<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../include/header.jsp" %>

<section class="content">

<form role="form" method="post" action="insertPro.guest">

<div class="form-group">
<label for="a1">name</label>
<input type="text" name="name" class="form-control" id="name" placeholder="Enter Title" />
</div>
<div class="form-group">
<label for="a2">password</label>
<textarea name="password" class="form-control" rows="3" id="password"></textarea>
</div>


<!-- post success.jsp -->
<div class="box-footer">
<button class="btn btn-primary">Submit</button>
</div>

</form>

</section><!-- end .content -->

<%@include file="../include/footer.jsp" %>
</body>
</html>