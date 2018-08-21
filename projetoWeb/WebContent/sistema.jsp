<h2>Gravar Dados</h2>

<form method="post" action="ControllerPessoa?cmd=gravar">
	
	<br />Nome<br />
	<input type="text" id="nome" name="nome" required="required" size="50" />
	
	<br />Idade<br />
	<input type="number" id="idade" name="idade" required="required" size="10" />
	
	<br />Foto<br />
	<input type="text" id="foto" name="foto" required="required" size="70" />
	
	<br />
	<br />
	
	<button type="submit">Enviar</button>

</form>


<form method="post" action="ControllerPessoa?cmd=listar">
	
	<button type="submit">Listar</button>

</form>

${msg}