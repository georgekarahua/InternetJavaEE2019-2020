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
<h1>Please fill out your Application Form</h1>
<form method="post" action='<spring:url value="/student/makeApplicationForm"/>' id="form" class="validate">
  <div class="form-field">
    <label >Annual Income:</label>
    <input type="text" name="annualIncome" id="email-input" placeholder="Income" required/>
  </div>

  <div class="form-field">
    <label >Parental_Status:</label>
    <input type="text" name="parentalStatus" id="email-input" placeholder="Parental Status" required/>
  </div>
    <div class="form-field">
    <label>Residence:</label>
    <input type="text" name="resdence" id="email-input" placeholder="Residence" required/>
  </div>
      <div class="form-field">
    <label >Student Siblings:</label>
    <input type="text" name="siblingStudents" id="email-input" placeholder="Number of Siblings" required/>
  </div>
  <div class="form-field">
    <label for=""></label>
    <input type="submit" value="Sumbit Form" />
  </div>
  
</form>
<a class="myButton" href="<c:url value="/" />">GO BACK</a>
</body>
</html>