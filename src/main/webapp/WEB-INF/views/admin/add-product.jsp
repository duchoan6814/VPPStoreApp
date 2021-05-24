<%@ page import="org.apache.commons.io.FilenameUtils" %>
  <%@ page import="java.util.regex.Pattern" %>
    <%-- Created by IntelliJ IDEA. User: hoantruong Date: 23/05/2021 Time: 23:41 To change this template use File |
      Settings | File Templates. --%>
      <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <rapid:override name="header">
            </rapid:override>

            <rapid:override name="title">
              <a class="navbar-brand" href="javascript:;">Thêm sản phẩm</a>
            </rapid:override>

            <rapid:override name="content">
              <div class="row">
                <div class="col-12">
                  <form>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Tên sản phẩm</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                        placeholder="">
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone
                        else.</small>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Tên Thương Hiệu</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                        placeholder="">
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone
                        else.</small>
                    </div>
                    <div class="form-group">
                      <label for="exampleFormControlSelect1">Thể Loại</label>
                      <select class="form-control selectpicker" data-style="btn btn-link"
                        id="exampleFormControlSelect1">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                      </select>
                    </div>

                    <div class="form-group">
                      <label for="exampleInputEmail1">Gia</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                        placeholder="">
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone
                        else.</small>
                    </div>
                    <div class="form-group">
                      <label for="exampleFormControlTextarea1">Mô tả</label>
                      <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                    </div>

                    <div class="form-group form-file-upload form-file-simple">
                      <input type="text" class="form-control inputFileVisible" placeholder="Simple chooser...">
                      <input type="file" class="inputFileHidden">
                    </div>

                    <div class="form-group form-file-upload form-file-multiple">
                      <input type="file" multiple="" class="inputFileHidden">
                      <div class="input-group">
                        <input type="text" class="form-control inputFileVisible" placeholder="Single File">
                        <span class="input-group-btn">
                          <button type="button" class="btn btn-fab btn-round btn-primary">
                            <i class="material-icons">attach_file</i>
                          </button>
                        </span>
                      </div>
                    </div>

                    <div class="form-group form-file-upload form-file-multiple">
                      <input type="file" multiple="" class="inputFileHidden">
                      <div class="input-group">
                        <input type="text" class="form-control inputFileVisible" placeholder="Multiple Files" multiple>
                        <span class="input-group-btn">
                          <button type="button" class="btn btn-fab btn-round btn-info">
                            <i class="material-icons">layers</i>
                          </button>
                        </span>
                      </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                  </form>
                </div>
              </div>
            </rapid:override>
            <%@include file="index.jsp" %>