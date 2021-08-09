<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>The Code</title>
    </head>
    <body>
    	<c:out value="${error}"/>
        <p>What is the code?</p>
        <form action="/code" method="POST">
        	<input name="code" type="text"/>
        	<input type="submit" value="Try Code"/>
        </form>
    </body>
</html>