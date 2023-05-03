<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/modificarEmpresa" var="linkServletNuevaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action= "${linkServletNuevaEmpresa}" method="post">
		<label for="nombre">Nombre empresa:</label>
		<input type="text" name="nombre" value="${empresa.nombre}"/><br><br>
		<label for="fecha">Fecha abertura:  </label>
		<input type="text" name="fecha" value="<fmt:formatDate value="${empresa.fechaAbertura}" pattern="dd/MM/yyyy"/>"/><br><br>
		<input type="hidden" name="id" value="${empresa.id}"/>
		<input type="submit"/>
	</form>
	
</body>
</html>