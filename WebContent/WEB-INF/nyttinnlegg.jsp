<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nytt innlegg</title>
</head>
<body>
<form method="post">
	<h3>Nytt innlegg</h3>
	<p>Navn: <input type="text" name="navn" value="${vinSkjema.navn }"></p>
	<p>Land: <input type="text" name="land" value="${vinSkjema.land }"></p>
	<p>Region: <input type="text" name="region" value="${vinSkjema.region }"></p>
	<p>Årgang: <input type="text" name="årgang" value="${vinSkjema.årgang }"></p>
	<p>Beskrivelse: </p>
	<textarea rows="4" cols="50" name="beskrivelse" value="${vinSkjema.beskrivelse }"></textarea>
	<input type="submit" value="Legg til">
</form>
</body>
</html>