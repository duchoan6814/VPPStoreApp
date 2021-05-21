<%-- Created by IntelliJ IDEA. User: hoantruong Date: 20/05/2021 Time: 15:43 To change this template use File | Settings
  | File Templates. --%>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
      <title>Thông tin</title>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/information_origin.css?v=1">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/address_style.css?v=1">
      
    </head>

    <body>
      <jsp:include page="../layout/header.jsp" />

      <div class="wrapper container">
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>
          <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/user">Tài khoản</a></li>
          <li class="breadcrumb-item active" aria-current="page">Địa chỉ</li>
        </ol>
        <!-- Sidebar -->
        <div class="row main">

          <jsp:include page="../layout/left-site.jsp" />
          <!-- Page Content -->
          <div id="content" class="col-9 main__right-site">
            <!-- We'll fill this with dummy content -->
            <div class="main__right-site__wrap-content main-content">
              <div class="row main-content__title ">
                <div class="col-12 main-content__title__top">
                  <h4 class="mb-0">Địa chỉ của tôi</h4>
                  <button type="button" class="btn btn-danger">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                      class="bi bi-plus-lg" viewBox="0 0 16 16">
                      <path
                        d="M8 0a1 1 0 0 1 1 1v6h6a1 1 0 1 1 0 2H9v6a1 1 0 1 1-2 0V9H1a1 1 0 0 1 0-2h6V1a1 1 0 0 1 1-1z" />
                    </svg>
                    Thêm địa chỉ
                  </button>
                </div>
                <div class="col-12">
                  <hr>
                </div>
              </div>
              <div class="row main-content__content mt-4">
                <div class="col item">
                  <div class="item__left-site">
                    <div class="row">
                      <div class="col-3">
                        Họ Tên
                      </div>
                      <div class="col-9">
                        <b>Trương Đức Hoàn</b>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-3">
                        Số điện thoai
                      </div>
                      <div class="col-9">
                        <b>0349380770</b>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-3">
                        Địa chỉ
                      </div>
                      <div class="col-9">
                        <p class="mb-0">số 30 Nguyễn Thái Sơn</p>
                        <p class="mb-0">Phường 3</p>
                        <p class="mb-0">Quận Gò Vấp</p>
                        <p class="mb-0">Thành phố Hồ Chí Minh</p>
                      </div>
                    </div>
                  </div>
                  <div class="item__right-site">
                    <div class="row">
                      <div class="col">
                        <button type="button" class="btn btn-warning">
                          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                            <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                            <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
                          </svg>
                          Sửa
                        </button>
                      </div>
                      <div class="col">
                        <button type="button" class="btn btn-danger">
                          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                            <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                            <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
                          </svg>
                          Xóa
                        </button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>


          </div>
        </div>

      </div>
      <jsp:include page="../layout/footer.jsp" />
    </body>

    </html>