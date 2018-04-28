<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Importações das TAGs do Struts -->
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imobiliária Bonus - Telefone</title>
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
<!-- Limpando o CACHE de pagina -->
	<meta http-equiv="Expires" CONTENT="0">
	<meta http-equiv="Cache-Control" CONTENT="no-cache">
	<meta http-equiv="Pragma" CONTENT="no-cache">
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Inserir Tipo de Telefone - Bonus</title>
		
		<script type="text/javascript">
			/* Função generica que nos permite submeter o formulário com nomes
 			de métodos dinâmicos que deverão ser executados na action. */
			function executar( nomeDoMetodo ){
				document.forms[0].method.value = nomeDoMetodo;
				document.forms[0].submit();
			}
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

<!-- Formulario JSP que é representado pela classe EnderecoForm -->
		<form action="tipoTelefoneAction.do">
		
			<!-- Campo invisivel utilizado implicitamente pelo Struts.
				 Este atributo está mapeado no struts-config.xml (parameter) -->
			<html:hidden property="method" value="empty" />
			<div id="conteudo">
			<!-- TABELA DOS CAMPOS -->
			<h1>Tipo de Telefone</h1>
			<table>
				<html:hidden property="idTipoTelefone" name="tipoTelefoneForm"/>
				<tr>
					<td>
						<label>Tipo de Telefone</label>
					</td>
					<td>
						<html:text property="descricao" name="tipoTelefoneForm" size="50" />
					</td>
				</tr>
			</table>
			</div>
			
			<!-- TABELA DOS BOTÕES -->		
			<div id="menu_modal_txt">
				<li><a href="javascript://" onclick="executar('inserir')">Salvar</a></li>
				<li><a href="javascript://" onclick="executar('alterar')">Alterar</a></li>
				<li><a href="javascript://" onclick="executar('filtrar')">Filtrar</a></li>
				<li><a href="javascript://" onclick="executar('limpar')">Limpar</a></li>
				<li><a href="javascript://" onclick="executar('excluir')">Excluir</a></li>
				<li><a href="index.html">Home</a></li>
			</div>
				
		</form>

</body>
</html>