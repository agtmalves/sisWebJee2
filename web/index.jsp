<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>Cadastro de Profissionais!</title>
		<link rel="stylesheet" href="util/estilo.css" >
	</head>
	<body>
		<div class="conteudo">
			<table border="1">
				<tr>
					<td style="width:128px; text-align:center">
						<img src= "img/id-card.png" width="128" height="128"
							alt="siswebjee"/>
					</td>
					<td style="width:600px;">
						<%@include file="util/topo.html"%>
					</td>
				</tr>
				<tr>
					<td style="width=100px; text-align:center">
						<h3>
							Opções<br><br>
							<a href="index.jsp?acao=home">. Home .</a><br>
							<a href="index.jsp?acao=novo">. Novo .</a><br>
							<a href="index.jsp?acao=editar">. Editar .</a><br>
							<a href="index.jsp?acao=excluir">. Apagar .</a><br>
							<a href="index.jsp?acao=listar">. Listar .</a><br>
						</h3>
					</td>
					<td>
						FORMULÁRIO
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<p id="rodape"> Copyright© 2021 - siswebjee®</p>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>