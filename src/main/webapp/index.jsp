<html>
<body>
<h2>Hello World!</h2>
<form action="EmpController" method="post">

<input type="hidden" name="operations" value="insert">
<label> ID </label>         
<input type="number" name="id" size="15"/> <br> <br> 

<label> FirstName </label>         
<input type="text" name="firstName" size="15"/> <br> <br> 

<label> LastName </label>         
<input type="text" name="lastName" size="15"/> <br> <br> 

<label> EmailId </label>         
<input type="text" name="emailId" size="15"/> <br> <br> 

<label> Password </label>         
<input type="text" name="password" size="15"/> <br> <br> 

 <input type="submit" value="submit">
 
 <input type="submit" value="select">
</form>
</body>
</html>
