<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head> 
		<title> Create Invoice </title>  
		<style>
			.error{
			color: #ff0000;
			font-weight: bold;
			}
		</style>
	</head>
	<body>
		<div id="formsContent">
			<form:form id="createInvoiceForm" method="POST" modelAttribute="invoice" class="form-horizontal" role="form"> 
			<form:errors path="*" cssClass="error" />
				<fieldset>
			  		<legend>Customer Details</legend>
					<div class="form-group">
						<div>
							<form:label class="col-lg-3 control-label" path="customer">
								Who are you billing?
							</form:label>
						</div>
						<div class="col-lg-3">
							<form:select class="form-control" path="customerSelection" items="${customerSelection}" itemValue="customerId" itemLabel="customerName" />
						</div>
					</div>
		  		</fieldset>
		  		<fieldset>
		  			<legend>Item Details</legend>
					<div class="form-group" style="margin-botton: 10px;">
		                <div class="col-md-10">
		                	<div>
								<form:label class="col-lg-4 control-label" path="itemList">
									What are you billing for?
								</form:label>
							</div>
							<div class="col-lg-3">
								<form:select class="form-control" path="itemSelection" items="${itemSelection}" itemValue="itemId" itemLabel="itemName" />
							</div>
						</div>
						<br><br>
		                <div class="col-md-8">
							<table style="table-layout: fixed; width: 100%;" border="0 0 0 0">
								<tr>
									<th> Number</th>
									<th>Title</th>
									<th>Description</th>
									<th> Unit</th>
									<th>Amount</th>
									<th>Price</th>
									<th>VAT%</th>
									<th>Sum</th>
								</tr>
								<tr>
									<td><form:input path="itemList[0].itemNumber"/>  </td>
									<td><form:input path="itemList[0].itemName"/>   </td>
									<td><form:input path="itemList[0].itemDescription"/>   </td>
									<td><form:input path="itemList[0].itemUnit"/>  </td>
									<td><form:input path="itemList[0].amount"/>   </td>
									<td><form:input path="itemList[0].netPrice"/> </td>
									<td><form:input path="itemList[0].vat"/>  </td>
									<td><form:input path="itemList[0].sum"/> </td>
								</tr>
								<div style="margin-bottom: 10px;"/>
								<tr>
									<td colspan="8" align="center"> <hr/><p><button type="submit" class="btn btn-primary">Send Invoice Email</button></p> </td>
								</tr>
							</table>
						</div>
					</div>
		  		</fieldset>
			</form:form>
		</div>
	</body>
</html>