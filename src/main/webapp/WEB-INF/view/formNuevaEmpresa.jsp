<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"></c:import>
	
	<form action= "${linkEntradaServlet}" method="post">
		<label for="nombre">Nombre empresa:</label>
		<input type="text" name="nombre"/><br><br>
		<label for="fecha">Fecha abertura:  </label>
		<input type="text" name="fecha"/><br><br>
		<input type="hidden" name="accion" value="NuevaEmpresa"/><br><br>
		<input type="submit">
	</form>
	
</body>
</html>