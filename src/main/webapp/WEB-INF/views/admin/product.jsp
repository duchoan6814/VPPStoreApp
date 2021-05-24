<%@ page import="org.apache.commons.io.FilenameUtils" %>
  <%@ page import="java.util.regex.Pattern" %>
    <%-- Created by IntelliJ IDEA. User: hoantruong Date: 23/05/2021 Time: 23:41 To change this template use File |
      Settings | File Templates. --%>
      <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <rapid:override name="header">
              <link href="${pageContext.request.contextPath}/css/admin-product.css" rel="stylesheet" />
            </rapid:override>

            <rapid:override name="title">
              <a class="navbar-brand" href="javascript:;">Sản Phẩm</a>
            </rapid:override>

            <rapid:override name="content">
              <div class="row">
                <div class="col-12">
                  <form class="header-filter">
                    <input type="text" class="form-control" placeholder="ID">
                    <input type="text" class="form-control" placeholder="Tên sản phẩm">
                    <div class="form-check">
                      <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" value="">
                        Còn tồn
                        <span class="form-check-sign">
                          <span class="check"></span>
                        </span>
                      </label>
                    </div>
                    <input type="text" class="form-control" placeholder="Từ">
                    <input type="text" class="form-control" placeholder="Đến">
                    <input type="text" class="form-control" placeholder="Nhà cung cấp">
                    <button type="submit" class="btn btn-primary">Lọc</button>
                  </form>
                </div>
              </div>

              <div class="row them-san-pham">
                <a href="${pageContext.request.contextPath}/product/add" class="btn btn-primary">
                  <span class="material-icons">
                    add
                  </span>
                    Thêm sản phẩm
                </a>
              </div>

              <div class="row content-table">
                <div class="col-12">
                  <table class="table">
                    <thead>
                      <tr>
                        <th class="text-center">#</th>
                        <th>ID</th>
                        <th>Hình ảnh</th>
                        <th>Tên sản phẩm</th>
                        <th>Thương hiệu</th>
                        <th>Đơn vị tính</th>
                        <th class="text-right">Giá</th>
                        <th class="text-right">Số lượng</th>
                        <th class="text-right">Action</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td class="text-center">1</td>
                        <td>SP0001</td>
                        <td><img
                            src="data:image/jpeg;base64,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"
                            class="img-thumbnail" alt="product" /></td>
                        <td>Gậy như ý</td>
                        <td>Tôn ngộ không</td>
                        <td>Cái</td>
                        <td class="text-right">150.000đ</td>
                        <td class="text-right">150</td>
                        <td class="td-actions text-right">
                          <button class="btn btn-btn-warning">Sửa</button>
                          <button class="btn btn-danger">Xóa</button>
                        </td>
                      </tr>

                    </tbody>
                  </table>
                </div>
              </div>
            </rapid:override>
            <%@include file="index.jsp" %>