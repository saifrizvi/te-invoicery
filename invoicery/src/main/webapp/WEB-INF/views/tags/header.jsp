<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    	<div class="navbar-header">                                   
	        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	        </button>
        	<a class="navbar-brand" href="#">Invoicery</a>
        </div>
        <div class="navbar-collapse collapse">  
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/dashboard" />">Dashboard</a></li>
            <li><a href="<c:url value="/dashboard" />">Notifications</a></li>
            <li><a href="<c:url value="/tags/header/logo-upload" />">Company Logo</a></li>
            <li><a href="<c:url value="/dashboard" />">Company Name</a></li>
            <li><a href="<c:url value="/tags/header/user-account" />">User Account</a></li>
          </ul>
        </div>   			      		 
  </div>
</div>