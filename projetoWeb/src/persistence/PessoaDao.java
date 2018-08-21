package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class PessoaDao extends Dao{
	
	public void create(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("insert into pessoa values (null, ?, ?, ?)");
		stmt.setString(1, p.getNome());
		stmt.setInt(   2, p.getIdade());
		stmt.setString(3, p.getFoto() );
		stmt.execute();
		stmt.close();
		
		close();
	}
	
	public List<Pessoa> listar() throws Exception{
		open();
		stmt = con.prepareStatement("select * from pessoa");
		Pessoa p = new Pessoa();
		rs = stmt.executeQuery();
		List<Pessoa> lista = new ArrayList<Pessoa>();
		if(rs.next()){
			p.setId(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setIdade(rs.getInt(3));
			p.setFoto(rs.getString(4));
			lista.add(p);
		};
		stmt.close();
		
		close();
		return lista;
	}
	
	public static void main(String[] args) {
		try {
			new PessoaDao().listar().forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
