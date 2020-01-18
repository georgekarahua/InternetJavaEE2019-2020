<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<title>Insert title here</title>
</head>
<style>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  background-color: #eee;
  font-family: 'helvetica neue', helvetica, arial, sans-serif;
  color: #222;
}

#form {
  max-width: 700px;
  padding: 2rem;
  box-sizing: border-box;
}

.form-field {
  display: flex;
  margin: 0 0 1rem 0;
}
label, input {
  width: 70%;
  padding: 0.5rem;
  box-sizing: border-box;
  justify-content: space-between;
  font-size: 1.1rem;
}
label {
  text-align: right;
  width: 30%;
}
input {
  border: 2px solid #aaa;
  border-radius: 2px;
}
</style>

<body>
<h1>Your Info</h1>
<form method="post" action='<spring:url value="/student/updateStudentInfo"/>' id="form" class="validate">
  <div class="form-field">
    <label >First Name:</label>
    <input type="text" name="firstName" id="email-input" placeholder="${student.lastName}" value="${student.firstName}"/>
  </div>

  <div class="form-field">
    <label >Last Name:</label>
    <input type="text" name="lastName" id="email-input" placeholder="${student.lastName}" value="${student.lastName}"/>
  </div>
    <div class="form-field">
    <label for="email-input">Phone :</label>
    <input type="text" name="phone" id="email-input" placeholder="${student.phone}" value="${student.phone}" />
  </div>
  <div class="form-field">
    <label for=""></label>
    <input type="submit" value="Update Info" />
  </div>
  
</form>
<a class="myButton" href="<c:url value="/" />">GO BACK</a>
</body>
</html>