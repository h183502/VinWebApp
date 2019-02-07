<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registering</title>
</head>
	<body>
	<form action="registrering" method="post">
		<fieldset><legend><b>Registrering:</b></legend>
			<p>Brukernavn: <input type="text" name="brukernavn" value="${skjema.brukernavn }"></p>
			<p>Fornavn: <input type="text" name="fornavn" value="${skjema.fornavn }"></p>
			<p>Etternavn: <input type="text" name="etternavn" value="${skjema.etternavn }"></p>
			<p>Passord: <input type="password" name="passord1" value="${skjema.passord1 }"></p>
			<p>Gjenta passord: <input type="password" name="passord2" value="${skjema.passord2 }"></p>
			<input type="submit" value="Register">
		</fieldset>
	</form>
	</body>
</html>
    