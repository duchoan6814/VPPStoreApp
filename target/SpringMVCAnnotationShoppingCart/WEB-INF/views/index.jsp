<%--
  Created by IntelliJ IDEA.
  User: hoantruong
  Date: 19/05/2021
  Time: 02:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Trang chủ</title>
</head>
<body>
<c:url var="addProduct" value="sp/showFormAddProduct"/>
<a href="${addProduct}" > Them sp</a>
	<jsp:include page="layout/header.jsp"/>
	<jsp:include page="components/iten-home.jsp" />       
	<jsp:include page="layout/footer.jsp"/>
</body>
</html>
