<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logg inn</title>
</head>
<body>
<form method="post">
	<fieldset><legend>Logg inn</legend>
		<p>${notLoggedInn }</p>
		<p><font color="red">${loggInnSkjema.feilInnlogging }</font></p>
		<p>Brukernavn: <input type="text" name="brukernavn"></p>
		<p>Passord: <input type="password" name="passord"></p>
		<input type="submit" value="Logg inn">
	
	</fieldset>
</form>
</body>
</html>