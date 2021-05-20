<%-- Created by IntelliJ IDEA. User: hoantruong Date: 20/05/2021 Time: 15:43 To change this template use File | Settings
    | File Templates. --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <html>

        <head>
            <title>Thông tin</title>
        </head>

        <body>
            <jsp:include page="../layout/header.jsp" />

            <div class="wrapper container">
            
                <!-- Sidebar -->
                <div class="row main">
                    
                    <jsp:include page="../layout/left-site.jsp"/>
                    <!-- Page Content -->
                    <div id="content" class="col-9 main__right-site">
                        <!-- We'll fill this with dummy content -->
                        <h1>content</h1>
                    </div>
                </div>

            </div>
            <jsp:include page="../layout/footer.jsp" />
        </body>

        </html>