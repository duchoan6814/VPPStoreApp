<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hoantruong
  Date: 20/05/2021
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:url var="cssLoginUrl" value="/css/login_style.css" />
    <title>Đăng nhập</title>
    <link rel="stylesheet" href="${cssLoginUrl}">
</head>
<body>
<jsp:include page="layout/header.jsp"/>
<div layout:fragment="content" class="login container">
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a th:href="@{/}">Trang chủ</a></li>
            <li class="breadcrumb-item"><a href="@{/user}">Tài khoản</a></li>
            <li class="breadcrumb-item active" aria-current="page">Đăng
                nhập
            </li>
        </ol>
    </nav>
    <div class="login__form my-5">
        <h5>Đăng nhập tài khoản</h5>
        <p>
            Bạn chưa có tài khoản <a th:href="@{/register}">Đăng ký tại đây</a>
        </p>
        <div class="main-content login__form__wrap-form pt-3">

            <form class="m-auto" th:action="@{/perform_login}" method="POST">
                <div class="form-group row">
                    <div class="col">
                        <p th:if="${param.error}" class="error">Email hoặc mật khẩu
                            không chính xác!</p>
                        <p th:if="${param.logout}" class="success">Bạn đã đăng xuất.</p>
                        <p th:if="${param.success}" class="success">Bạn đã đăng ký thành công tài khoản.</p>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" name="email" class="form-control"
                               id="inputEmail3">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" name="password" class="form-control"
                               id="inputPassword3">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col">
                        <p>
                            Quên mật khẩu? ấn vào <a th:href="@{/forgotpassword}">đây</a>
                        </p>
                    </div>

                </div>
                <div class="form-group row">
                    <div class="col">
                        <button type="submit" class="btn btn-primary btn-block m-auto">
                            Đăng nhập
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp"/>
</body>
</html>
