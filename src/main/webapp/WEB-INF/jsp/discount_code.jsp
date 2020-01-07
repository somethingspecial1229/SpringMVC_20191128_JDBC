<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
    <head>
        <%@include file="fragment/head.jspf" %>
        <script>
            $(document).ready(function () {
                $(".delete").click(function () {
                    var href = $(this).attr("href");
                    $("#_method").val("DELETE")
                    $("#myform").attr("action", href).submit();
                    return  false;
                })
            })
        </script>
    </head>
    <body>
        <div id="layout">
            <!-- Menu  -->
            <%@include file="fragment/menu.jspf" %>
            <!-- Body -->
            <div id="main">
                <div class="header">
                    <h1>Discount Code</h1>
                    <h2>折扣碼資料維護</h2>
                </div>

                <div class="content">
                    <h2 class="content-subhead">折扣碼資料維護</h2>
                    <form:form modelAttribute="po" id="myform" method="post" action="${pageContext.request.contextPath}/mvc/discount_code/" class="pure-form">
                        <fieldset>
                            <form:input path="discountCode" placeholder="請輸入折扣碼" />
                            <form:input path="rate" placeholder="請輸入折扣" />
                            <input type="hidden" id="_method" name="_method" value="${_method}">
                            <button type="submit" class="pure-button pure-button-primary">${_method}</button>
                            <button type="reset" class="pure-button pure-button-primary">reset</button>
                        </fieldset>
                    </form:form>
                    <h2 class="content-subhead">折扣碼資料列表</h2>
                    <table class="pure-table pure-table-bordered">
                        <thead>
                            <tr>
                                <th>刪除</th>
                                <th>Model</th>
                                <th>Year</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach var="item" items="${list}">
                                <tr>
                                    <td title="按我一下可刪除"><a href="${pageContext.request.contextPath}/mvc/discount_code/${item.discountCode}" class="delete">刪除</a></td>
                                    <td title="按我一下可修改"><a href="${pageContext.request.contextPath}/mvc/discount_code/${item.discountCode}">${item.discountCode}</a></td>
                                    <td>${item.rate}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>