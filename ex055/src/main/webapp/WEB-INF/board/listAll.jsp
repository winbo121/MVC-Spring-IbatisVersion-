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
<form role="form" method="post">


</form>
<table class="table table-bordered">
<tr>

<th>NAME</th>
<th>PASSWORD</th>


</tr>
<c:forEach items="${userList }" var="userList">
<tr>

<td><a href="../readForm.guest?name=${userList.name}">${userList.name}</a></td>
<td>${userList.password }</td>

</tr>
</c:forEach>

</table>

 <button type="submit" class="btn btn-primary">Write</button>  

<div class="text-center">
<ul class="pagination">
<c:if test="${pageMaker.prev }">
<li><a href="../list.guest?page=${pageMaker.startPage-1 }"><-</a></li>
</c:if>

<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
<li> 
<a href="../list.guest?page=${idx }">${idx }</a>
</li>
</c:forEach>
<c:if test="${pageMaker.next }">
<li><a href="../list.guest?page=${pageMaker.endPage+1 }">-></a></li>
</c:if>
</ul>
</div>


<%@include file="../include/footer.jsp" %>

<script type="text/javascript">

$(document).ready(function(){
	
	var form1=$("form[role='form']");
	
	$(".btn-primary").on("click",function(){
		
		form1.attr("action","insertForm.guest");
		form1.attr("method","get");
		form1.submit();
		
	});
	
	
	
	
});


</script>

</body>
</html>