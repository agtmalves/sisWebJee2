<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%!
	String acao,opcao;
%>

<!DOCTYPE html>

<% 
	acao = request.getParameter("acao");
	if(acao!=null){
			if(acao.equals("novo")){
				opcao="base/novo.jsp";
			}else if(acao.equals("editar")){
				opcao="base/editar.jsp";
			}else if(acao.equals("excluir")){
				opcao="base/excluir.jsp";
			}else if(acao.equals("listar")){
				opcao="base/listar.jsp";
			}else if(acao.equals("home")){
				opcao="base/home.jsp";
			}
	}else{
		opcao="base/home.jsp";
	}
	%>
		
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>Cadastro de Profissionais!</title>
		<link rel="stylesheet" href="util/estilo.css" >
		<script language="javascript"  src="util/funcoes.js"></script>
	</head>
	<body>
		<div class="conteudo">
			<table>
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
					<td id="menu">
						<h3>
							Opções<br><br>
							<a href="index.jsp?acao=home">. Home .</a><br>
							<a href="index.jsp?acao=novo">. Novo .</a><br>
							<a href="index.jsp?acao=editar">. Editar .</a><br>
							<a href="index.jsp?acao=excluir">. Apagar .</a><br>
							<a href="index.jsp?acao=listar">. Listar .</a><br>
						</h3>
					</td>
					<td id="principal" style="vertical-align:top">
						<jsp:include page="<%=opcao %>" />
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