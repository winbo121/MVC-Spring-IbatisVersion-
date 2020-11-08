<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%@include file="../include/header.jsp" %>
<form role="form" method="post">
  <input type='hidden' name='name' value="${user.name }">
</form>


<div class="form-group">
<label for="a1">name</label>
<input type="text" name="name" class="form-control" id="name" value=${user.name } />
</div>
<div class="form-group">
<label for="a2">password</label>
<input name="password" class="form-control" id="password" value=${user.password } />
</div>

<div class="box-footer">
<button type="submit" class="btn btn-danger">Remove</button>
<button type="submit" class="btn btn-primary">ListAll</button>
</div>
<script type="text/javascript">
$(document).ready(function(){
	
	var form1=$("form[role='form']");
	
	
	$(".btn-danger").on("click",function(){
		
		form1.attr("action","deletePro.guest");
	
		form1.submit();
		
	});
	
	$(".btn-primary").on("click",function(){
		
		self.location="/list.guest";
		
	});
	
});
</script>
<%@include file="../include/footer.jsp" %>
</body>
</html>