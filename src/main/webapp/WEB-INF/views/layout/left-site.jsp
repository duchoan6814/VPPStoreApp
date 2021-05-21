<%-- Created by IntelliJ IDEA. User: hoantruong Date: 20/05/2021 Time: 22:00 To change this template use File | Settings
    | File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <title>Title</title>
            <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/information_style.css?v=2">
            <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/information_page_style.css?v=2">
        </head>

        <body>
            <nav id="sidebar" class="col-3 main__left-site">
                <div class="main__left-site__header">
                    <img class="rounded-circle" src="https://cf.shopee.vn/file/0d3c18d46c33ca1241d278d9ce282a2d_tn"
                        alt="avatar">
                    <div class="name-user">
                        <p>Truong Duc Hoa sadasd wqeqweq asdas asd fsdasd</p>
                        <a href=#>Chỉnh sửa thông tin</a>
                    </div>

                </div>

                <hr />

                <ul class="list-unstyled components">
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="true" class="dropdown-toggle">Tài
                            khoản của tôi</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li>
                                <a href="${pageContext.request.contextPath}/user">Hồ sơ</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/user/address">Địa chỉ</a>
                            </li>
                            <li>
                                <a href="#">Giỏ hàng</a>
                            </li>
                        </ul>
                    </li>
                    <li class="not-active">
                        <a href="${pageContext.request.contextPath}/user/order">Đơn hàng</a>
                    </li>

                </ul>
            </nav>

        </body>

        </html>