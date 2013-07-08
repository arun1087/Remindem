<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="actionForm" action="EventServlet" method ="GET">
		<table align="center">
			<tr>
				<td>Event Name</td>
				<td><input type="text" id="name" name="ename" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" id="address" name="eaddress" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="text" id="name" name="edate" /></td>
			</tr>
			<tr>
				<td>End Date(Optional)</td>
				<td><input type="text" id="enddate" name="eenddate" /></td>
			</tr>
			<tr>
				<td>number of guests</td>
				<td><input type="text" id="numberofguests" name="ename" /></td>
			</tr>
			<tr>
				<td>Start Time</td>
				<td><input type="text" id="time" name="eaddress" /></td>
			</tr>
			<tr>
				<td>End Time</td>
				<td><input type="text" id="address" name="eaddress" /></td>
			</tr>
			<tr>
				<td>Comments</td>
				<td colspan="2"><textarea style="width: 100%;" /></textarea></td>
			</tr>
			<tr>
				<td><input type="button" id="time" name="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>