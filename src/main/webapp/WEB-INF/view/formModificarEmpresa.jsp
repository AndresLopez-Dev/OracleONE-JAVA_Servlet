<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action= "${linkEntradaServlet}" method="post">
		<label for="nombre">Nombre empresa:</label>
		<input type="text" name="nombre" value="${empresa.nombre}"/><br><br>
		<label for="fecha">Fecha abertura:  </label>
		<input type="text" name="fecha" value="<fmt:formatDate value="${empresa.fechaAbertura}" pattern="dd/MM/yyyy"/>"/><br><br>
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="hidden" name="accion" value="ModificarEmpresa"/>
		<input type="submit"/>
	</form>
	
</body>
</html>