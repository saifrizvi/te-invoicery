<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head> 
		<title> Create New Customer </title>  
		<style>
			.error{
			color: #ff0000;
			font-weight: bold;
			}
		</style>
	</head>
	<body>
		<div id="formsContent">
			<form:form id="createNewCustomerForm" method="POST" modelAttribute="customer" class="form-horizontal" role="form"> 
			<form:errors path="*" cssClass="error" />
				<fieldset>
			  		<legend>Customer Details</legend>
			  		
			  		<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerName"> 
							Customer Name <form:errors path="customerName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerName" class="form-control" placeholder="customerName"/>
						</div>
					</div>

					<legend>Customer Type</legend>
					<div class="form-group error">
						<label class="radio" style="margin-left: 50px !important">
							<form:radiobutton path="customerType" value="BUSINESS" />
							Business
						</label>
						<label class="radio" style="margin-left: 50px !important">
							<form:radiobutton path="customerType" value="INDIVIDUAL" />
							Individual
						</label>
					</div>
					
					<legend>Nationality</legend>
					<div class="form-group error">
						<label class="radio" style="margin-left: 50px !important">
							<form:radiobutton path="nationality" value="UNITED_KINGDOM" />
							United Kingdom
						</label>
						<label class="radio" style="margin-left: 50px !important">
							<form:radiobutton path="nationality" value="FOREIGN" />
							Foreign
						</label>
					</div>	
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerEmail"> 
							Customer Email <form:errors path="customerEmail" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerEmail" class="form-control" placeholder="customerEmail"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerPhoneNumber"> 
							Customer Phone Number <form:errors path="customerPhoneNumber" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerPhoneNumber" class="form-control" placeholder="customerPhoneNumber"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="recipientName"> 
							Recipient Name <form:errors path="recipientName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="recipientName" class="form-control" placeholder="recipientName"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerAdress.streetAddress"> 
							Street Address <form:errors path="customerAdress.streetAddress" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerAdress.streetAddress" class="form-control" placeholder="customerAdress.streetAddress"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerAdress.postCode"> 
							Post Code <form:errors path="customerAdress.postCode" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerAdress.postCode" class="form-control" placeholder="customerAdress.postCode"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="customerAdress.city"> 
							City <form:errors path="customerAdress.city" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="customerAdress.city" class="form-control" placeholder="customerAdress.city"/>
						</div>
					</div>
					<div class="form-group">
						<form:label class="col-lg-2 control-label" path="customerAdress.country">
							Country
						</form:label>
						<div class="col-lg-6">
							<form:select class="form-control" path="customerAdress.country">
								<form:option class="form-control" value="UNITED_KINGDOM">United Kingdom</form:option>
								<form:option class="form-control" value="FOREIGN">Foreign</form:option>
							</form:select>
						</div>
					</div>
		  		</fieldset>
		  		<hr/>
				<p><button type="submit" class="btn btn-primary">Save</button></p>
			</form:form>
		</div>
	</body>
</html>