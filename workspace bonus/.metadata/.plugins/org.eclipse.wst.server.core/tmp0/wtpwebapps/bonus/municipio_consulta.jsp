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
		<td width="150px"><b><u>Nome</u></b></td>
	</tr>
	
	<logic:iterate id="municipioCorrente" name="municipioForm" property="municipios" type="br.com.bonus.endereco.municipio.model.MunicipioVO">
		<tr>
			<td width="75px">${ municipioCorrente.idMunicipio }</td>
			<td width="75px">${ municipioCorrente.descricao }</td>
		</tr>
	</logic:iterate>
</table>
</div>


<table>
	<tr>
		<td>
			<div id="menu_modal_txt"><a href="municipioAction.do?method=abrirTela">Voltar</a></div>
		</td>
	</tr>

</table>

</body>
</html>