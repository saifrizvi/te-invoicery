<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

<body>  
	<div class="row">     
    	<div class="col-md-12"> 
      		<h2> Dashboard </br> </h2>
      		<h3> Welcome to Invoicery - Solution for your invoicing problems ! </h3>
			<h3> Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" /> </h3>
			<h3> News feed:</h3>
			<ul>
				<li>Welcome to Invoicery</li>
				<li>Complete your company profile</li>
				<li>Send a test invoice to your email id</li>
			</ul>  
    	</div> 
	</div>
</body>
</html>