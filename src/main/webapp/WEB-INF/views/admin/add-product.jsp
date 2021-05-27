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
                                    <form class="forms-sample">
                                        <div class="form-group">
                                            <label for="tenSanPhamId">Tên sản phẩm</label>
                                            <input type="text" class="form-control" id="tenSanPhamId"
                                                placeholder="tên sản phẩm...">
                                        </div>

                                        <div class="form-group">
                                            <label for="tenThuongHieuId">Tên thương hiệu</label>
                                            <input type="text" class="form-control" id="tenThuongHieuId"
                                                placeholder="tên thương hiệu...">
                                        </div>

                                        <div class="form-group">
                                            <label for="theLoaiId">Thể loại</label>
                                            <select class="form-control" id="theLoaiId">
                                                <option>Male</option>
                                                <option>Female</option>
                                            </select>
                                        </div>

                                        <div class="form-group">
                                            <label for="giaId">Giá</label>
                                            <input type="number" class="form-control" id="giaId" placeholder="Giá...">
                                        </div>

                                        <div class="form-group">
                                            <label for="moTaId">Mô tả</label>
                                            <textarea class="form-control" id="moTaId" rows="4"></textarea>
                                        </div>


                                        <div class="form-group">
                                            <label>Ảnh đại diện</label>
                                            <input type="file" name="anhDaiDien[]" class="file-upload-default">
                                            <div class="input-group col-xs-12">
                                                <input type="text" class="form-control file-upload-info" disabled
                                                    placeholder="Upload Image">
                                                <span class="input-group-append">
                                                    <button class="file-upload-browse btn btn-primary"
                                                        type="button">Upload</button>
                                                </span>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label>Ảnh mẫu sản phẩm</label>
                                            <input multiple type="file" name="anhMauSanPham[]"
                                                class="file-upload-default">
                                            <div class="input-group col-xs-12">
                                                <input type="text" class="form-control file-upload-info" disabled
                                                    placeholder="Upload Image">
                                                <span class="input-group-append">
                                                    <button class="file-upload-browse btn btn-primary"
                                                        type="button">Upload</button>
                                                </span>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label>Màu sắc</label>
                                            <div class="row" id="listMauSacId">
                                                <div class="col-3 mt-2">
                                                    <select name="mauSacs[]" class="form-control" id="theLoaiId">
                                                        <option>Male</option>
                                                        <option>Female</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <button class="btn btn-success mt-2">add</button>
                                        </div>

                                        <div class="form-group">
                                            <label>Thuộc tính riêng</label>
                                            <div class="row" id="listThuocTinhId">
                                                <div class="col-6">
                                                    <label for="tenThuongHieuId">Thuộc tính</label>
                                                    <input name="thuocTinhs[][thuocTinh]" type="text" class="form-control" id="tenThuongHieuId"
                                                        placeholder="tên thương hiệu...">
                                                </div>
                                                <div class="col-6">
                                                    <label for="tenThuongHieuId">Giá trị</label>
                                                    <input name="thuocTinhs[][giaTri]" type="text" class="form-control" id="tenThuongHieuId"
                                                        placeholder="tên thương hiệu...">
                                                </div>
                                            </div>
                                            <button class="btn btn-success mt-2">add</button>
                                        </div>

                                        <button type="submit" class="btn btn-primary mr-2">Submit</button>
                                        <button class="btn btn-dark">Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </rapid:override>

                        <rapid:override name="scripPath">
                            <script src="${pageContext.request.contextPath}/css/assets/js/file-upload.js"></script>
                        </rapid:override>
                        <%@include file="index.jsp" %>