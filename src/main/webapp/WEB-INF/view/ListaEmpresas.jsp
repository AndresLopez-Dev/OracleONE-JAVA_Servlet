<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.alura.gerenciador.modelo.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty nombreEmpresa}">
		<h1>Empresa ${nombreEmpresa} registrada</h1><br>	
	</c:if>

	<h1>LISTA DE EMPRESAS</h1>
	
	<ul>
		<c:forEach items="${listaEmpresas}" var="empresa">
			<li> 
				Empresa: ${empresa.nombre} - <fmt:formatDate value="${empresa.fechaAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${empresa.id}"> Modificar </a>
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${empresa.id}"> Eliminar </a>
			</li>
			
		</c:forEach>
	</ul>

</body>
</html>