<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<%@include file="../include/header.jsp" %>
<form role="form" method="post">
  <div class="box-body">
   <div class = "form-group">
   <label for="exampleInputEmail1">BNO</label> 
   <input type="text" name='bno' class="form-control" value="${boardVO.bno}"
          readonly="readonly">
  </div>
  <div class = "form-group">
    <label for="exampleInputEmail1">Title</label> 
    <input type="text" name='title' class="form-control" value="${boardVO.title}">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Content</label> 
    <textarea name='content' class="form-control" rows="3">${boardVO.content}</textarea>
  </div>
  <div class = "form-group">
    <label for="exampleInputEmail1">Writer</label> 
    <input type="text" name='writer' class="form-control" 
    value="${boardVO.writer}" readonly="readonly">
  </div>
</div>
<!-- /.box-body -->
</form>

<div class="box-footer">
  <button type="submit" class="btn btn-primary">SAVE</button>
  <button type="submit" class="btn btn-warning">CANCLE</button>
</div>
<script type="text/javascript">
$(document).ready(function(){
	  var formObj = $("form[role='form']");
	  console.log(formObj);

	  $(".btn-warning").on("click", function(){
	    self.location = "/board/listAll";
	  });
	  
	  $(".btn-primary").on("click", function(){
		formObj.submit();
	  });
	});
</script>
<%@include file="../include/footer.jsp" %>