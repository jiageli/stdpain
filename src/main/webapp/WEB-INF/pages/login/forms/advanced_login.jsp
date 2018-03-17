<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="user/login" method="POST">
    <div class="panel panel-body login-form">
        <div class="text-center">
            <div class="icon-object border-slate-300 text-slate-300"><i class="icon-reading"></i></div>
            <h5 class="content-group">登录到你的账户 <small class="display-block">Your credentials</small></h5>
        </div>
        <div class="form-group has-feedback has-feedback-left">
            <input name="username" type="text" class="form-control" placeholder="Username">
            <div class="form-control-feedback">
                <i class="icon-user text-muted"></i>
            </div>
            <c:if test="${wrong!=null}">
            <span class="help-block text-danger"><i class="icon-cancel-circle2 position-left"></i>用户名或密码错误</span>
            </c:if>
        </div>

        <div class="form-group has-feedback has-feedback-left">
            <input name="password"  type="text" class="form-control" placeholder="Password">
            <div class="form-control-feedback">
                <i class="icon-lock2 text-muted"></i>
            </div>
            <c:if test="${wrong!=null}">
            <span class="help-block text-danger"><i class="icon-cancel-circle2 position-left"></i>用户名或密码错误</span>
            </c:if>
        </div>

        <div class="form-group login-options">
            <div class="row">
                <div class="col-sm-6">
                    <label class="checkbox-inline">
                        <input name="checked" type="checkbox" class="styled" checked="checked">
                        记住密码
                    </label>
                </div>

                <div class="col-sm-6 text-right">
                    <a href="#login_password_recover.html">忘记密码?</a>
                </div>
            </div>
        </div>

        <div class="form-group">
            <button type="submit" class="btn bg-blue btn-block">Login <i class="icon-arrow-right14 position-right"></i></button>
        </div>

        <div class="content-divider text-muted form-group"><span>还没有账户?</span></div>
        <a href="#login_registration.html" class="btn btn-default btn-block content-group">注册</a>
        <span class="help-block text-center no-margin">By continuing, you're confirming that you've read our <a href="#">Terms &amp; Conditions</a> and <a href="#">Cookie Policy</a></span>
    </div>
</form>