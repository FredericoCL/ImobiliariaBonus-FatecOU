<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Importações das TAGs do Struts -->
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imobiliária Bonus - Endereço</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css" />
  <script>
  $(function() {
    $( "input[type=submit], a, button" )
      .button()
      .click(function( event ) {
        event.method=abrirTela();
      });
  });
  </script>
</head>
<body>

<div id="logo">
	<img alt="Logomarca" src="imagens/logo.png" border="0px">
</div>

<div id="menu_principal_txt">
	<li><a href="clienteAction.do?method=abrirTela">Clientes</a></li>
	<li><a href="clienteAction.do?method=abrirTela">Corretor</a></li>
	<li><a href="endereco.html">Endereço</a></li>
	<li><a href="imovel.html">Imóvel</a></li>
	<li><a href="contrato.html">Contrato</a></li>
	<li><a href="telefone.html">Telefone</a></li>
</div>

<!-- TABELA DA GRID DE CONSULTA -->
<div id="conteudo">
	<table>
		<tr>
			<td width="75px"><B><U>Código</u></b></td>
			<td width="250px"><b><u>Logradouro</u></b></td>
			<td width="75px"><b><u>Número</u></b></td>
			<td width="100px"><b><u>Bairro</u></b></td>
			<td width="75px"><b><u>CEP</u></b></td>
			<td width="100px"><b><u>Complemento</u></b></td>
			<td width="100px"><b><u>Município</u></b></td>
			<td width="100px"><b><u>Estado</u></b></td>
			<td width="100px"><b><u>País</u></b></td>
		</tr>
	
			<logic:iterate id="enderecoCorrente" name="enderecoForm" property="enderecos" type="br.com.bonus.endereco.endereco.model.EnderecoVO">
			<tr>
				<td width="75px">${ enderecoCorrente.idEndereco }</td>
				<td width="75px">${ enderecoCorrente.logradouro }</td>
				<td width="75px">${ enderecoCorrente.numero }</td>
				<td width="75px">${ enderecoCorrente.bairro }</td>
				<td width="75px">${ enderecoCorrente.cep }</td>
				<td width="75px">${ enderecoCorrente.complemento }</td>
				<td width="75px">${ enderecoCorrente.municipio.descricao }</td>
				<td width="75px">${ enderecoCorrente.estado.descricao }</td>
				<td width="75px">${ enderecoCorrente.pais.descricao }</td>
			</tr>
		</logic:iterate>
	</table>
</div>
	
	<table>	
		<tr>
			<td>
				<div id="menu_modal_txt"><a href="enderecoAction.do?method=abrirTela">Voltar</a></div>
			</td>
		</tr>
	</table>

</body>
</html>