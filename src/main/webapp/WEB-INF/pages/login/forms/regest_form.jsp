<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="user/manager" method="Post">
    <div class="panel panel-body login-form">
        <div class="text-center">
            <div class="icon-object border-success text-success"><i class="icon-plus3"></i></div>
            <h5 class="content-group">创建账户 <small class="display-block">所有项都需要填写</small></h5>
        </div>
        <div class="content-divider text-muted form-group"><span>Your credentials</span></div>
        <div class="form-group has-feedback has-feedback-left">
            <input name="username" type="text" class="form-control" placeholder="Eugene" required="required">
            <div class="form-control-feedback">
                <i class="icon-user-check text-muted"></i>
            </div>
            <c:if test="${wrong!=null}">
            <span class="help-block text-danger"><i class="icon-cancel-circle2 position-left"></i>用户名已经存在!</span>
            </c:if>
        </div>
        <div class="form-group has-feedback has-feedback-left">
            <input name="password" type="text" class="form-control" placeholder="Create password" required="required">
            <div class="form-control-feedback">
                <i class="icon-user-lock text-muted"></i>
            </div>
        </div>
        <div class="content-divider text-muted form-group"><span>Your privacy</span></div>
        <div class="form-group has-feedback has-feedback-left">
            <input type="text" class="form-control" placeholder="Your email"required="required">
            <div class="form-control-feedback">
                <i class="icon-mention text-muted"></i>
            </div>
        </div>
        <div class="form-group has-feedback has-feedback-left">
            <input type="text" class="form-control" placeholder="Repeat email"required="required">
            <div class="form-control-feedback">
                <i class="icon-mention text-muted"></i>
            </div>
        </div>
        <div class="content-divider text-muted form-group"><span>Additions</span></div>
        <div class="form-group">
            <div class="checkbox">
                <label>
                    <input type="checkbox" class="styled" checked="checked">
                    Send me <a href="#">test account settings</a>
                </label>
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox" class="styled" checked="checked">
                    Subscribe to monthly newsletter
                </label>
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox" class="styled">
                    Accept <a href="#">terms of service</a>
                </label>
            </div>
        </div>
        <button type="submit" class="btn bg-teal btn-block btn-lg">Register <i class="icon-circle-right2 position-right"></i></button>
    </div>
</form>
