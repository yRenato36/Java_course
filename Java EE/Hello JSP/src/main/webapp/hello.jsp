<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--IMPORTAR AS CLASSES DE JAVA --%>
    <%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html lang = "pt-br"> <%-- PADRONIZANDO LIGUAGEM PARA PTBR --%>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%out.println("teste teste");%>
	
	<p>Data: <%=new Date()%>
	<%!int contador=0; %>>
	<p>Visitas: <%=contador++ %></p> <%-- toda vez que página recarrega, é contado +1 --%>
	
</body>
</html>