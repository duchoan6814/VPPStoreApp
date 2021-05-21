<%-- Created by IntelliJ IDEA. User: hoantruong Date: 20/05/2021 Time: 15:43 To change this template use File | Settings
    | File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Thông tin</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/information_origin.css?v=1">
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<jsp:include page="../layout/header.jsp"/>

<div class="wrapper container">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>
        <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/user">Tài khoản</a></li>
        <li class="breadcrumb-item active" aria-current="page">Địa chỉ</li>
    </ol>
    <!-- Sidebar -->
    <div class="row main">

        <jsp:include page="../layout/left-site.jsp"/>
        <!-- Page Content -->
        <div id="content" class="col-9 main__right-site">
            <!-- We'll fill this with dummy content -->
            <div class="main__right-site__wrap-content main-content">
                <div class="row main-content__title ">
                    <div class="col">
                        <h4>Hồ sơ của tôi</h4>
                        <p>Quản lý thông tin hồ sơ để bảo mất tài khoản</p>
                        <hr>
                    </div>
                </div>
                <form class="row main-content__content mt-4">
                    <div class="col-8">

                        <div class="form-group row">
                            <label for="inputEmail3" class="col-sm-3 col-form-label">Email</label>
                            <div class="col-sm-9">
                                <p class="mb-0"><b>hoantruong6814@gmail.com</b></p>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-3 col-form-label">Họ tên đệm</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-3 col-form-label">Tên</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-3 col-form-label">Số điện
                                thoại</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3">
                            </div>
                        </div>
                        <fieldset class="form-group row">
                            <legend class="col-form-label col-sm-3 float-sm-left pt-0">Giới tính</legend>
                            <div class="col-sm-9">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gridRadios"
                                           id="gridRadios1" value="option1" checked>
                                    <label class="form-check-label" for="gridRadios1">
                                        Nam
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gridRadios"
                                           id="gridRadios2" value="option2">
                                    <label class="form-check-label" for="gridRadios2">
                                        Nữ
                                    </label>
                                </div>
                            </div>

                        </fieldset>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-3 col-form-label">Ngày sinh</label>
                            <div class="col-sm-9">
                                <input id="datepicker"/>
                            </div>
                        </div>

                        <div class="form-group row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-9">
                                <button type="submit" class="btn btn-primary">Lưu</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="row">
                            <div class="col">
                                <img src="https://cf.shopee.vn/file/0d3c18d46c33ca1241d278d9ce282a2d_tn" alt="avatar"/>
                                <div class="custom-file mb-3 mt-3">
                                    <input type="file" class="custom-file-input" id="customFile" name="filename">
                                    <label class="custom-file-label" for="customFile">Choose file</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>


        </div>
    </div>

</div>
<jsp:include page="../layout/footer.jsp"/>
<script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
<script>
    $('#datepicker').datepicker({
        uiLibrary: 'bootstrap4'
    });
</script>
</body>

</html>