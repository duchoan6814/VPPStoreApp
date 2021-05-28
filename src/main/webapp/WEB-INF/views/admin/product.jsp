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
              hello world
            </rapid:override>

            <rapid:override name="content">
              <div class="row">
                <div class="col-12">
                  <form class="row forms-sample">
                    <div class="col form-group">
                      <label for="exampleInputEmail1">Tên sản phẩm</label>
                      <input type="text" class="form-control p-input" id="exampleInputEmail1"
                        aria-describedby="emailHelp" placeholder="Enter email">
                    </div>
                    <div class="col form-group">
                      <label for="exampleInputPassword1">Thương hiệu</label>
                      <input type="text" class="form-control p-input" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="col form-group">
                      <label for="exampleSelectGender">Thể loại</label>
                      <select class="form-control" id="exampleSelectGender">
                        <option>Male</option>
                        <option>Female</option>
                      </select>
                    </div>
                    <div class="col">
                      <div class="row">
                        <div class="col">
                          <button type="submit" class="btn btn-outline-primary">Lọc</button>
                        </div>
                        <div class="col">
                          <a href="${pageContext.request.contextPath}/product/add" class="btn btn-outline-success">thêm</a>
                        </div>
                      </div>
                    </div>
                  </form>
                </div>
              </div>

              <div class="row">
                <div class="col-12">
                  <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
                        <tr>
                          <th> ID </th>
                          <th> Hình ảnh </th>
                          <th> Tên sản phẩm </th>
                          <th> Thương hiệu </th>
                          <th> Thể loại </th>
                          <th> Giá </th>
                          <th> Action </th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>SP000001</td>
                          <td class="py-1">
                            <img
                              src="data:image/jpeg;base64,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"
                              alt="image" />
                          </td>
                          <td> Herman Beck </td>
                          <td>
                            Bittis
                          </td>
                          <td> Giấy bút </td>
                          <td> 150.000đ </td>
                          <td>
                            <div class="row">
                              <div class="col"><button type="button" class="btn btn-outline-warning">Sửa</button></div>
                              <div class="col"><button type="button" class="btn btn-outline-danger">Xóa</button></div>
                            </div>
                          </td>
                        </tr>

                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </rapid:override>
            <%@include file="index.jsp" %>