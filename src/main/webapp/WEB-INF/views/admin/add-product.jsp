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
                                            <label for="exampleInputUsername1">Username</label>
                                            <input type="text" class="form-control" id="exampleInputUsername1"
                                                placeholder="Username">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Email address</label>
                                            <input type="email" class="form-control" id="exampleInputEmail1"
                                                placeholder="Email">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">Password</label>
                                            <input type="password" class="form-control" id="exampleInputPassword1"
                                                placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputConfirmPassword1">Confirm Password</label>
                                            <input type="password" class="form-control"
                                                id="exampleInputConfirmPassword1" placeholder="Password">
                                        </div>
                                        <div class="form-check form-check-flat form-check-primary">
                                            <label class="form-check-label">
                                                <input type="checkbox" class="form-check-input"> Remember me </label>
                                        </div>
                                        <button type="submit" class="btn btn-primary mr-2">Submit</button>
                                        <button class="btn btn-dark">Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </rapid:override>

                        <rapid:override name="scripPath">

                        </rapid:override>
                        <%@include file="index.jsp" %>