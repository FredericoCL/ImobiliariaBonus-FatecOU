<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Importa��es das TAGs do Struts -->
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imobili�ria Bonus - Corretor</title>
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
  
//   $( document ).ready(function() {
// 	  bloquearCampo();
	  
// 	  $( "#button" ).click(function() {
// 		  bloquearCampo();
// 	});
// });
  </script>
  <script type="text/javascript">
//   	function bloquearCampo(){
//   		if($("#corretor").val() == "nao"){
//   			$("#creci").attr("disabled", true);
//   		}else if($("#corretor").val() == "sim"){
//   			$("#creci").attr("disabled", false);
//   		} 
//   	}
  </script>
<!-- Limpando o CACHE de pagina -->
	<meta http-equiv="Expires" CONTENT="0">
	<meta http-equiv="Cache-Control" CONTENT="no-cache">
	<meta http-equiv="Pragma" CONTENT="no-cache">
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Corretor</title>
		
		<script type="text/javascript">
			/* Fun��o generica que nos permite submeter o formul�rio com nomes
 			de m�todos din�micos que dever�o ser executados na action. */
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
	<li><a href="endereco.html">Endere�o</a></li>
	<li><a href="imovel.html">Im�vel</a></li>
	<li><a href="contrato.html">Contrato</a></li>
	<li><a href="telefone.html">Telefone</a></li>
</div>

<!-- Formulario JSP que � representado pela classe EnderecoForm -->
		<form action="clienteAction.do">
		
			<!-- Campo invisivel utilizado implicitamente pelo Struts.
				 Este atributo est� mapeado no struts-config.xml (parameter) -->
			<html:hidden property="method" value="empty" />
			<div id="conteudo">
			<!-- TABELA DOS CAMPOS -->
			<h1>Corretor</h1>
			<table>
			<html:hidden property="idCliente" name="clienteForm" />
				<tr>
					<td>
						<label>Nome</label>
					</td>
					<td>
						<html:text property="nome" name="clienteForm" size="50" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Data de Nascimento</label>
					</td>
					<td>
						<html:text property="dataNascimento" name="clienteForm" size="30" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label>E-mail</label>
					</td>
					<td>
						<html:text property="email" name="clienteForm" size="30" />
					</td>
				</tr>
			
				<tr>
					<td>
						<label>CPF</label>
					</td>
					<td>
						<html:text property="cpf" name="clienteForm" size="30" />
					</td>
				</tr>
				
				<tr>
					<td>
						<label>RG</label>
					</td>
					<td>
						<html:text property="rg" name="clienteForm" size="30" />
					</td>
				</tr>
				<tr>
					<td>
						<label>Telefone</label>
					</td>
					<td>
						<html:select property="telefone.idTelefone" name="clienteForm" >
							<html:option value="0">Selecione o Telefone&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html:option>
							<html:optionsCollection property="listaTelefones" value="idTelefone" 
								label="numero" name="clienteForm"/>
						</html:select>
					</td>
				</tr>
				<tr>
					<td>
						<label>Endere�o</label>
					</td>
					<td>
						<html:select property="endereco.idEndereco" name="clienteForm" >
							<html:option value="0">Selecione o Endere�o&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html:option>
							<html:optionsCollection property="listaEnderecos" value="idEndereco" 
								label="logradouro" name="clienteForm"/>
						</html:select>
					</td>
				</tr>
				<tr>
					<td>
						<html:radio styleId="corretor" property="corretor" name="clienteForm" value="nao"/><label>Corretor</label>
					</td>
				</tr>
				<tr>
					<td>
						<label>Creci</label>
					</td>
					<td>
						<html:text styleId="creci" property="creci" name="clienteForm" size="30" />
					</td>
				</tr>
			</table>
			</div>
			
			<!-- TABELA DOS BOT�ES -->		
			<div id="menu_modal_txt">
				<li><a href="javascript://" id="button" onclick="executar('inserir')">Salvar</a></li>
				<li><a href="javascript://" id="button" onclick="executar('alterar')">Alterar</a></li>
				<li><a href="javascript://" id="button" onclick="executar('filtrar')">Filtrar</a></li>
				<li><a href="javascript://" id="button" onclick="executar('limpar')">Limpar</a></li>
				<li><a href="javascript://" id="button" onclick="executar('excluir')">Excluir</a></li>
				<li><a href="index.html">Home</a></li>
			</div>
				
		</form>

</body>
</html>