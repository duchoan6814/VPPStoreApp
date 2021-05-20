<%-- Created by IntelliJ IDEA. User: hoantruong Date: 20/05/2021 Time: 15:43 To change this template use File | Settings
    | File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <title>Thông tin</title>
            <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/information_origin.css?v=1">
            <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
        </head>

        <body>
            <jsp:include page="../layout/header.jsp" />

            <div class="wrapper container">

                <!-- Sidebar -->
                <div class="row main">

                    <jsp:include page="../layout/left-site.jsp" />
                    <!-- Page Content -->
                    <div id="content" class="col-9 main__right-site">
                        <!-- We'll fill this with dummy content -->
                        <div class="main__right-site__wrap-content main-content">
                            <div class="row main-content__title ">
                                <div class="col">
                                    <h4>Địa chỉ của tôi</h4>
                                    <button type="button" class="btn btn-danger">Danger</button>
                                </div>
                                <hr>
                            </div>
                            <div class="row main-content__content mt-4">
                                
                            </div>
                        </div>


                    </div>
                </div>

            </div>
            <jsp:include page="../layout/footer.jsp" />
        </body>

        </html>