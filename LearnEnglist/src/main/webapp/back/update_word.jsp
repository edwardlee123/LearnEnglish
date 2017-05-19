<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*,java.util.*,org.english.form.*" %>

 <% 
	Admin user= (Admin)request.getSession().getAttribute("currentAdmin");
	if(user==null){
		%>
			<script type="text/javascript">
			alert("请先登录");
			window.location.href = "login.html";
			</script>
		<%
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>英语学习软件</title>
 <!-- Bootstrap core CSS -->
    <link href="../resource/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div class="container">
      <form class="form-signin" action="updateWord.do" method="post" enctype="multipart/form-data">
        <h2 class="form-signin-heading">修改单词</h2>
        <label for="inputEmail" class="sr-only">单词</label>
        <input type="text" id="name" name="name" class="form-control" placeholder="hello" value="${word.name }"required autofocus>
         <label for="inputEmail" class="sr-only">音标</label>
        <input type="text" id="soundmark" name="soundmark" class="form-control" placeholder="həˈləʊ" value="${word.soundmark }"required autofocus>
        <label for="inputEmail" class="sr-only">含义</label>
        <input type="text" id="meaning" name="meaning" class="form-control" placeholder="你好" value="${word.meaning }" required autofocus>
        <!-- <div id="word_type">
        	  <label><input name="wordType" type="checkbox" value="1" checked="checked"/>四级</label> 
			  <label><input name="wordType" type="checkbox" value="2" />六级 </label> 
			  <label><input name="wordType" type="checkbox" value="3" />雅思 </label> 
        </div> -->
        <label for="inputPassword" class="sr-only">单词发音</label>
        <input type="hidden" name="wordId" id="wordId" value="${word.id }">
        <input type="file" id="pronunciation" name="pronunciation" class="form-control" value="${word.pronunciation }" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">修改</button>
      </form>
    </div> <!-- /container -->
</body>
</html>