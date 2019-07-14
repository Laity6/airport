<%--
  Created by IntelliJ IDEA.
  User: xulin
  Date: 2019/7/13
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>

<body>
<form action="showtake" method="post">
    起飞机场:
    <select name="takeid">
        <option>请选择</option>
        <c:forEach items="${takeport}" var="take">
            <option value="${take.id}">${take.portName}</option>
        </c:forEach>
    </select>


    降落机场:
    <select name="landid">
        <option>请选择</option>
        <c:forEach items="${landport}" var="land">
            <option value="${land.id}">${land.portName}</option>
        </c:forEach>
    </select>

    <input type="submit" value="查询">
</form>
<br>
<table>
    <tr>
        <td>飞机编号</td>
        <td>起飞机场</td>
        <td>起飞城市</td>
        <td>降落机场</td>
        <td>降落城市</td>
        <td>航行时间</td>
        <td>票价</td>
    </tr>
    <c:forEach items="${list}" var="plane">
        <tr>
            <td>${plane.airNo }</td>
            <td>${plane.takePort.portName }</td>
            <td>${plane.takePort.cityName }</td>
            <td>${plane.landPort.portName }</td>
            <td>${plane.landPort.cityName }</td>
            <td>
                <c:if test="${plane.time>=60 }">
                    ${Math.floor(plane.time/60)}小时
                </c:if>
                <c:if test="${plane.time<60 }">
                    ${palnce.time }
                </c:if>
            </td>
            <td>${plane.price } </td>
        </tr>
    </c:forEach>

</table>
</body>

</html>
