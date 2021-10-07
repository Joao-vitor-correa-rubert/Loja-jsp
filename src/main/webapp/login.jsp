<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Loja JSP</title>
<%@include file="includes/header.jsp"%>
</head>
<body>
<%@include file="includes/NavBar.jsp"%>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
		  <div class="card-header text-center">Usuário login</div>
			<div class="card-body">
		<form action="method=post">
		
		<div class="form-group">
		<label>E-mail</label>
		<input type="email" class="form-control" name="login-email" placeholder="Digite seu e-mail" required="required"></input>
</div>
		<div class="form-group">
		<label>Senha</label>
		<input type="password" class="form-control" name="password" placeholder="Digite sua senha" required="required"></input>
</div>
		<div class="form-group">
		<button type="submit" class="btn_sucesso">Entrar</button>
</div>
</form>
</div>
</div>
</div>
<%@include file="includes/footer.jsp"%>
</body>
</html>