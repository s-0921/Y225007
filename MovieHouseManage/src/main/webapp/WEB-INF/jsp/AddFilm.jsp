<%--
  Created by IntelliJ IDEA.
  User: 时贝妮
  Date: 2019/12/16
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<body style="border: #0000FF 3px solid">
<div class="layui-upload" style="border: #00FF00 3px solid ; width: 50%; margin: auto 0px">
    <button type="button" class="layui-btn" id="test1">上传图片</button>
    <div class="layui-upload-list" style="border: #0C0C0C 2px solid ">
        <img class="layui-upload-img" id="demo1" style="width: 150px; height: 150px">
        <p id="demoText"></p>
    </div>
<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">输入框</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码框</label>
        <div class="layui-input-inline">
            <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">辅助文字</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">选择框</label>
        <div class="layui-input-block">
            <select name="city" lay-verify="required">
                <option value="">请选择</option>
                <option value="0">北京</option>
                <option value="1">上海</option>
                <option value="2">广州</option>
                <option value="3">深圳</option>
                <option value="4">杭州</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">复选框</label>
        <div class="layui-input-block">
            <input type="checkbox" name="" title="写作" checked>
            <input type="checkbox" name="" title="发呆">
            <input type="checkbox" name="" title="禁用" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">开关</label>
        <div class="layui-input-block">
            <input type="checkbox" name="switch" lay-skin="switch">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" title="男">
            <input type="radio" name="sex" value="女" title="女" checked>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">文本域</label>
        <div class="layui-input-block">
            <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>


    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
<script>
    layui.use('upload', function() {
        var $ = layui.jquery
            , upload = layui.upload;

        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test1'
            , url: ''
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        })
    })
</script>
<%--    <script>--%>
<%--        layui.use('upload', function(){--%>
<%--            var $ = layui.jquery--%>
<%--                ,upload = layui.upload;--%>

<%--            //普通图片上传--%>
<%--            var uploadInst = upload.render({--%>
<%--                elem: '#test1'--%>
<%--                ,url: '/upload/'--%>
<%--                ,before: function(obj){--%>
<%--                    //预读本地文件示例，不支持ie8--%>
<%--                    obj.preview(function(index, file, result){--%>
<%--                        $('#demo1').attr('src', result); //图片链接（base64）--%>
<%--                    });--%>
<%--                }--%>
<%--                ,done: function(res){--%>
<%--                    //如果上传失败--%>
<%--                    if(res.code > 0){--%>
<%--                        return layer.msg('上传失败');--%>
<%--                    }--%>
<%--                    //上传成功--%>
<%--                }--%>
<%--                ,error: function(){--%>
<%--                    //演示失败状态，并实现重传--%>
<%--                    var demoText = $('#demoText');--%>
<%--                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');--%>
<%--                    demoText.find('.demo-reload').on('click', function(){--%>
<%--                        uploadInst.upload();--%>
<%--                    });--%>
<%--                }--%>
<%--            })--%>
<%--    </script>--%>


</body>
</html>
