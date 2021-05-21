<%-- Created by IntelliJ IDEA. User: hoantruong Date: 21/05/2021 Time: 22:58 To change this template use File | Settings
  | File Templates. --%>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
      <title>Giỏ hàng</title>
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cart_style.css">

    </head>

    <body>
      <jsp:include page="layout/header.jsp" />

      <div class="container cart">
        <nav aria-label="breadcrumb">
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
            <li class="breadcrumb-item active" aria-current="page">Giỏ hàng</li>
          </ol>
        </nav>
        <div class="row cart__header mb-3">
          <div class="col-6">
            <div class="form-check">
              <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
              <label class="form-check-label" for="flexCheckChecked">
                Giỏ hàng
              </label>
            </div>
          </div>
          <div class="col-6">
            <div class="row ">
              <div class="col-3 align-self-center">
                <p class="mb-0">Đơn Giá</p>
              </div>
              <div class="col-3 align-self-center">
                <p class="mb-0">Số lượng</p>
              </div>
              <div class="col-3 align-self-center">
                <p class="mb-0">Số tiền</p>
              </div>
              <div class="col-3 align-self-center">
                <p class="mb-0">Thao tác</p>
              </div>
            </div>
          </div>
        </div>

        <div class="row cart__list-order-detail">
          <jsp:include page="components/order-detail-cart.jsp" />
          <jsp:include page="components/order-detail-cart.jsp" />
          <jsp:include page="components/order-detail-cart.jsp" />
        </div>

        <div class="row cart__sum mt-4">
          <div class="col-12">
            <div class="cart__sum__wrap-content">
              <p class="mb-0">Tổng số tiền: <span>1.000.000đ</span></p>
              <button type="button" class="ml-3 btn btn-danger">Mua hàng</button>
            </div>
          </div>
        </div>
      </div>



      <jsp:include page="layout/footer.jsp" />
    </body>

    </html>