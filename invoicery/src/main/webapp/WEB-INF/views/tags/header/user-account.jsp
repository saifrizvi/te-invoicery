<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<body>

  <div class="tabbable" id="demo-tab"> <!-- Only required for left/right tabs -->
    <!-- Tab Definitions-->               
    <ul class="nav nav-tabs">
      <li class="active"><a href="#csettings" data-toggle="tab">Company settings</a></li>
      <li><a href="#team" data-toggle="tab">Team</a></li>
      <li><a href="#isettings" data-toggle="tab">Invoice Settings</a></li>      
    </ul>  

    <!-- Tab Content-->
    <div class="tab-content">                  
      <div class="tab-pane" id="csettings">
        <h2>Settings</h2>
        <p>
          <code>[Company Name]</code>  
        </p>
        <ul>
          <li>
            <a id="address" class="textLink" href="<c:url value="/csettings?number=3&date=2014-12-27" />">Company Settings</a>
          </li>
          <li>
            <a id="contact" class="textLink" href="<c:url value="/contact?number=3&date=2014-12-27" />">Contact</a>
          </li>
        </ul> 
      </div>
      <div class="tab-pane" id="team">
        <h2>Team</h2>
        <p>
          <code>Display Team Members</code>   
        </p>
        <ul>
          <li>
            <a id="team" class="textLink" href="<c:url value="/team" />">Team List</a>
          </li>
        </ul>
      </div> 
    </div>
    <div class="tab-pane" id="isettings">
        <h2>Settings</h2>
        <p>
          <code>Invoice Settings</code>  
        </p>
        <ul>
          <li>
            <a id="invoicefee" class="textLink" href="<c:url value="/isettings?number=3&date=2014-12-27" />">Invoice Fee</a>
          </li>
          <li>
            <a id="reminderfee" class="textLink" href="<c:url value="/reminderfee?number=3&date=2014-12-27" />">Reminder Fee</a>
          </li>
        </ul> 
      </div> 
    <!--tab-content-->
  </div> <!--tabbable-->   

</body>
</html>