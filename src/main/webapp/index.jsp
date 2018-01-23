<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="save.do" method="post">
	ID:<input type="text" name="goodId">
	NAME:<input type="text" name="goodName">
	PRICE:<input type="text" name="goodPrice">
	<input type="submit" value="添加">
	</form>
	
	<form action="delete.do" method="post">
	ID:<input type="text" name="goodId">
	<input type="submit" value="删除">
	</form>
	<form action="update.do" method="post">
	ID:<input type="text" name="goodId">
	NAME:<input type="text" name="goodName">
	PRICE:<input type="text" name="goodPrice">
	<input type="submit" value="修改">
	</form>
	<form action="selectAll.do" method="post">
	<input type="submit" value="查询">
	</form>
	<form action="selectById.do" method="post">
	ID:<input type="text" name="goodId">
	<input type="submit" value="查询一个">
	</form>
</body>
</html>
