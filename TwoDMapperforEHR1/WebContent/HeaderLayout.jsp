<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   <meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval}; url=Error.jsp">
    <title></title>

  	<link rel="icon" type="image/png" href="img/icon.PNG">
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet">
     <link href="css/style.css" rel="stylesheet">
    <link href="css/business-casual.css" rel="stylesheet">
     <script src="js/jquery.js"></script>
     <script src="js/bootstrap.js"></script>
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
       
       
    <script type="text/javascript">
    $( document ).ready(function() {
    	
    		
        /* 	document.location.href="userDetailsForDoctor"; */
        
    	 var session = '${user}';
    	 
    	 if(session)
    		 {
    		  $('#loginlogout').text('Logout'); 
    			  $('#loginlogout').attr("href","Logout.jsp");
    		  
    
    		 }
    	 else
    		 {
    		 document.getElementById('mymenutop').style.visibility='hidden'; 
    		 
    		 
    		 }
  
    	 if('${user.role}'=="Patient")
    		 {
    		
    		 $("#dash").remove();
    		 $("#edit").remove();
    		 $('#view').attr("href","PatientLandingPage.jsp");
    		 $('#report').attr("href","PatientPrintReport.jsp");    		 
    		 }
   	});
    
    
    </script>
  </head>

  <body>
  
    <div class="heading">2D Body Map for EHR</div>
                

    <nav class="navbar navbar-default" role="navigation" style="position: relative;">
      <div class="container" >
        <div class="navbar-header" >
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="Home.jsp">2D Body Map for EHR</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav">
            <li><a href="Home.jsp">Home</a></li>
            <li><a href="About.jsp">About 2DBM</a></li>
            <li><a href="Register.jsp">Patient Registration</a></li>
                 <li><a id="loginlogout" href="Login.jsp">Login</a></li>
                 
          </ul>
        
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container -->
         </nav>
       <div id="mymenutop" class="btn-group" style=" position:relative; margin-top: -250px; left:81%; z-index:100000;">
	   <button type="button" class="btn btn-default" style="width: auto;"><i class="fa fa-user"></i>&nbsp;&nbsp;${user.lastName}, ${user.firstName}</button>
       <button type="button" id="dropdownid" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="padding-left: 14px"><span class="caret"></span></button>
         <ul class="dropdown-menu" style="width: 90%">
                   <li id="dash" style="height: 30px;"><a  href="DoctorLandingPage.jsp"><i class="fa fa-dashboard"></i>&nbsp;&nbsp;DashBoard</a></li>
                   <li style="height: 30px;"><a href="DoctorViewMode.jsp" id="view"><i class="fa fa-eye"></i>&nbsp;&nbsp;View Mode</a></li>
                   <li id="edit" style="height: 30px;"><a  href="DoctorEditMode.jsp"><i class="fa fa-edit"></i>&nbsp;&nbsp;Edit Mode</a></li>        
                   <li style="height: 30px;"><a href="DoctorPrintReport.jsp" id="report"><i class="fa fa-print"></i>&nbsp;&nbsp;Print Report</a></li>   
                   <li class="divider"></li>   
                   <li style="height: 30px;"><a href="Logout.jsp" id="logout"><i class="fa fa-sign-out"></i>&nbsp;&nbsp;Logout</a></li>                   
        </ul>
      </div>
 


   
  </body>
</html>