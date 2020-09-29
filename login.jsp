<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" 
    prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
    prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="log" value="/check"></c:url>
<form:form action="${log}" commandName="std" method="post">
ID:<form:input path="id"/><font color="red"><form:errors path="id"/></font><br/>
Name:<form:input path="name"/><font color="red"><form:errors path="name"/></font><br/>
Password<form:password path="password"/><font color="red"><form:errors path="password"/></font><br/>
Email<form:input type="email" path="email"/><font color="red"><form:errors path="email"/></font><br/>
Gender:
Male<form:radiobutton path="gender" value="Male"/><font color="red"><form:errors path="gender"/></font>
Female<form:radiobutton path="gender" value="Female"/><font color="red"><form:errors path="gender"/></font><br/>
Subject:
Java<form:checkbox path="subject" value="Java"/><font color="red"><form:errors path="subject"/></font>
C++<form:checkbox path="subject" value="C++"/><font color="red"><form:errors path="subject"/></font><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>