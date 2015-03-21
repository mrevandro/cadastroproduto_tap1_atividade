<%@page import="cadastroproduto_tap1.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos Cadastrados</title>
</head>
<body>

<h1> Lista de Produtos</h1>

<%
	List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");

	for(Produto p : produtos){
			out.print("<b>ID</b>: ");
			out.print(p.getId());
			out.print("<br>");
			out.print("<b>Descrição</b>: ");
			out.print(p.getDescricao());
			out.print("<br>");
			out.print("<b>Valor</b>: ");
			out.print(p.getValor());
			out.print("<br><br>");
	}
%>

</body>
</html>