<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:if test="${not empty nombreEmpresa}">
			<h1>Empresa ${nombreEmpresa} registrada</h1>		
		</c:if>
		<c:if test="${empty nombreEmpresa}">
			<h1>Ninguna empresa fue registrada</h1>		
		</c:if>
	</body>
</html>