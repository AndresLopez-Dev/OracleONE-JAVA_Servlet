<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/nuevaEmpresa" var="linkServletNuevaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action= "${linkServletNuevaEmpresa}" method="post">
		<label for="nombre">Nombre empresa:</label>
		<input type="text" name="nombre"/><br><br>
		<label for="fecha">Fecha abertura:  </label>
		<input type="text" name="fecha"/><br><br>
		<input type="submit">
	</form>
	
</body>
</html>