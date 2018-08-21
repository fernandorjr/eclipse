package control;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pessoa;
import persistence.PessoaDao;


@WebServlet("/ControllerPessoa")
public class ControllerPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if(cmd.equalsIgnoreCase("gravar")) {
			gravar(request, response);
		} else if (cmd.equalsIgnoreCase("listar")){
			listar(request, response);
		}
	}
	
protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome   = request.getParameter("nome");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		String foto   = request.getParameter("foto");
		
		Pessoa p = new Pessoa(null, nome, idade, foto);
		
		try {
			new PessoaDao().create(p);
			request.setAttribute("msg", "Dados Gravados");
		} catch (Exception ex) {
			request.setAttribute("msg", "Error: " + ex.getMessage());
		} finally {
			request.getRequestDispatcher("sistema.jsp").forward(request, response);;
		}
		
	}

protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	try {
		
		request.setAttribute("msg", "Listar clicado!!");
	} catch (Exception ex) {
		request.setAttribute("msg", "Error: " + ex.getMessage());
	} finally {
		request.getRequestDispatcher("sistema.jsp").forward(request, response);;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
