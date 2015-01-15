<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head> 
		<title> Create Invoice </title>  
	</head>
	<body>
		<form method="POST"> 
			<input type="text" name="customerName" value="${customerName}"/>
			<input type="Submit" value="Create"/>
		</form>
		
		<table>
			<tr>
				<th>Customer Name</th>
				<th>Current Date</th>
			</tr>
			<tr>
				<td>${invoice.getCustomer()}</td>
				<td><fmt:formatDate value="${today}" pattern="yyyy-MM-dd" /></td>
			</tr>
		</table>
		
	</body>
</html>