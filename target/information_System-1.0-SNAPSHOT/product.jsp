<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>相关产品</title>
    <link rel="stylesheet" type="text/css" href="./css/p2.css">
    <link rel="stylesheet" type="text/css" href="./css/produce.css">
    <script type="text/javascript" src="./js/product.js"></script>
    <style>
        a{
            margin-right: 30px;
        }
    </style>
</head>
<body>
<header>
    <ul>
        <li><a href="./index.jsp">银行介绍</a></li>
        <li><a href="./product.jsp">产品介绍</a></li>
    </ul>
</header>
<main>
    <h2>产品信息</h2>
    <form action="product" id="userForm">
     <input type="hidden" name="name" value="getall">
    <c:forEach items="${products}" var="product">
        <h3>${product.productName}</h3>
        <p>${product.productInfo}</p>
        <div style="margin-left: 650px; margin-top: 20px">联系人：${product.productUName} </div>
        <div style="margin-left: 600px; margin-top: 20px" >联系电话：${product.productPhone}</div>
    </c:forEach>
    </form>
    <div style="display: flex;justify-content: center">
        <input type="hidden" id="pgno" name="pageNo" value="${page.pageNo}">
        <input type="hidden" id="pgtt" name="pageTotal" value="${page.pageTotal}">
        <a href="#" onclick="firstPage()" >首页</a>
        <a href="#" onclick="prevPage()">上一页</a>
        <a href="#" onclick="nextPage()">下一页</a>
        <a href="#" onclick="lastPage()">尾页</a>
    </div>

<%--    <nav class="mt-5" th:if="${page.rows>page.limit}" th:fragment="pagination">--%>
<%--        <ul class="pagination justify-content-center">--%>
<%--            <li class="page-item">--%>
<%--                <a class="page-link" th:href="@{|${page.path}?current=1|}">首页</a>--%>
<%--            </li>--%>
<%--            <li th:class="|page-item ${page.current==1?'disabled':''}|">--%>
<%--                <a class="page-link" th:href="@{${page.path}(current=${page.current-1})}">上一页</a></li>--%>
<%--            <li th:class="|page-item ${i==page.current?'active':''}|" th:each="i:${#numbers.sequence(page.startPage,page.endPage)}">--%>
<%--                <a class="page-link" th:href="@{${page.path}(current=${i})}" th:text="${i}">1</a>--%>
<%--            </li>--%>
<%--            <li th:class="|page-item ${page.current==page.total?'disabled':''}|">--%>
<%--                <a class="page-link" th:href="@{${page.path}(current=${page.current+1})}">下一页</a>--%>
<%--            </li>--%>
<%--            <li class="page-item">--%>
<%--                <a class="page-link" th:href="@{${page.path}(current=${page.total})}">末页</a>--%>
<%--            </li>--%>
<%--        </ul>--%>
<%--    </nav>--%>

<%--    <h3>产品1</h3>--%>
<%--    <p>2016年4月18日，影片举行定档发布会   ；同年5月31日，片方发</p>--%>
<%--    <h3>产品1</h3>--%>
<%--    <p>2016年4月18日，影片举行定档发布会   ；同年5月31日，片方发</p>--%>
<%--    <h3>产品1</h3>--%>
<%--    <p>2016年4月18日，影片举行定档发布会   ；同年5月31日，片方发</p>--%>
<%--    <h3>发行上映</h3>--%>
<%--    <table border="1">--%>
<%--        <tr>--%>
<%--            <td>地区</td>--%>
<%--            <td>上映时间</td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td rowspan="4">中国</td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>2016年7月3日（成都点映 ）</td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>2016年7月4日（武汉点映 [25]  ）--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td> 2016年7月5日（南京点映）--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--    <h3>票房收入</h3>--%>
<%--    <p>2016年7月8日，《大鱼海棠》正式全国上映；该片首日票房达7460万元，打破了中国国产动画首日票房记录 [26]  ；截至7月23日，15天内影片的票房超过5亿元。</p>--%>
</main>

</body>
</html>