<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 时贝妮
  Date: 2019/12/13
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div id="header">
    <ul class="layui-nav " >
        <li class="layui-nav-item ">
            <a href=""><img src="${pageContext.request.contextPath}/image/longyanlogo.png"/> </a>
        </li>
        <li class="layui-nav-item ">
            <a href="">首页</a>
        </li>
        <li class="layui-nav-item ">
            <a href="">电影<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item ">
            <a href="">影院</a>
        </li>
        <li class="layui-nav-item ">
            <a href="">演出<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item ">
            <a href="">榜单</a>
        </li>
        <li class="layui-nav-item ">
            <a href="">热点</a>
        </li>
        <li class="layui-nav-item ">
            <a href="">商城<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">
                <img src="http://t.cn/RCzsdCq" class="layui-nav-img">

            </a>
            <dl class="layui-nav-child">
                <dd><a href="">基本资料</a></dd>
                <dd><a href="">安全设置</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
</div>

<div class="layui-carousel" id="test1">
    <div carousel-item>
        <div>条目1</div>
        <div>条目2</div>
        <div>条目3</div>
        <div>条目4</div>
        <div>条目5</div>
    </div>
</div>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-md9">

           <ul>
               <c:forEach items="${films}" var="film">
                   <li></li>
               </c:forEach>
           </ul>

        </div>
        <div class="layui-col-md3">
            你的内容 3/12
        </div>
    </div>

<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

    <script>
        layui.use('carousel', function(){
            var carousel = layui.carousel;
            //建造实例
            carousel.render({
                elem: '#test1'
                ,width: '100%' //设置容器宽度
               // ,arrow: 'always' //始终显示箭头
                ,anim: 'fade' //切换动画方式
            });
        });
    </script>
    <script>
        $(function () {
        })
    </script>
<script>
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script></body>
</html>