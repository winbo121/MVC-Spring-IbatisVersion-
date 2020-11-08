<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
var result='${msg}';

if(result=='Success'){
	alert("성공");
}

</script>
</head>
<body>
<%@include file="../include/header.jsp" %>
<table class="table table-bordered">
<tr>
<th style="width:10px">BNO</th>
<th>TITLE</th>
<th>WRITHER</th>
<th>REGDATE</th>
<th style="width:40px">VIEWCNT</th>
</tr>
<c:forEach items="${list }" var="boardVO">
<tr>
<td>${boardVO.bno }</td>
<td><a href="/board/read?bno=${boardVO.bno}">${boardVO.title}</a></td>
<td>${boardVO.writer}</td>
<td>${boardVO.regdate }</td>
<td>${boardVO.viewcnt}</td>
</tr>
</c:forEach>

</table>
<div class="text-center">
<ul class="pagination">
<c:if test="${pageMaker.prev }">
<li><a href="listCri?page=${pageMaker.startPage-1 }"><-</a></li>
</c:if>

<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
<li> 
<a href="listCri?page=${idx }">${idx }</a>
</li>
</c:forEach>
<c:if test="${pageMaker.next }">
<li><a href="listCri?page=${pageMaker.endPage+1 }">-></a></li>
</c:if>
</ul>
</div>


<%@include file="../include/footer.jsp" %>
</body>
</html>