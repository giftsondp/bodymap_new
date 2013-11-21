<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
 	<link rel="icon" type="image/png" href="img/icon.PNG">
    <title>Patient Home</title>

    <!-- Bootstrap core CSS -->
   <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet"> 
    <link href="css/business-casual.css" rel="stylesheet">
    <script src="js/bootstrap.js"></script>
     <script src="js/jquery.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">   
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">   
    <script src="js/Three.js"></script>
    <script src="js/OBJLoader.js"></script>
   <script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
    <script src="js/d3.v3.min.js"></script>
    
    <style type="text/css">
    
    #obj{
    
    display: none;
    }
    
    </style>
    <script type="text/javascript">
    
    $( document ).ready(function() {
    	
    	
   	 var $ = jQuery.noConflict();
   	  var patientGender = '${reg.gender}';
   	 
   	  
   	  
   	  
   	  
   	if(patientGender=="M")
   		{
   			
   		   $.getScript("js/Male.js");
   		
   		}
   	
   	else if (patientGender=="F")
   		{
   		
   		 $.getScript("js/Female.js");
   		}
   	
   	
   	
   	$("#generateReportForDoc").click( function(){
   		
   		var page="DPR";
   		var bid = document.getElementById("bodyIDPrintInput").value;
     	
   		
   		document.location.href="GetAllAnnotationsAction?bid="+bid+"&page="+page;	
   		
   		
   		
   	});
    
   	
   	$('#switch').click(function() {
   		
        $('#pageone').hide();
        $('#obj').show();
    /*  }, function() {
        $('#obj').hide();
        $('#pageone').show();  */
});
   	
   	$('#leftarrow').click(function() {
   		
        $('#obj').hide();
        $('#pageone').show();
    /*  }, function() {
        $('#obj').hide();
        $('#pageone').show();  */
});
	});

    
    </script>
    
    
    
   
  </head>

  <body>
  <jsp:include page="HeaderLayout.jsp" />
  
       <div class="container">
      <div class="row" style="overflow: auto;"> 
        <div class="box" style="height: auto;">      
        

 <!--         <div id="wrapper">  -->
  <jsp:include page="DoctorMenuLayout.jsp" />

 
 <div id="page-wrapper">
 
 <!--Col1  -->
 <div class="row">
  	<div class="col-lg-5" style="top:-20px;left:2px;">
            <h2>Body Map <small>Print Report</small></h2>
            <ol class="breadcrumb">
              <li class="active"><i class="fa fa-eye"></i> Print Report</li>
            </ol>
            
         <!--  <h4 id="patientName" align="center"></h4> -->
            <!-- <div class="alert alert-success alert-dismissable">
              <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
             This is the Body Map View Mode!!   </div> -->
             
             
             <form role="form" id="myForm">
     <div class="form-group">
                <label>Body Map ID</label>
                <input class="form-control" id="bodyIDPrintInput" placeholder="Enter Body Map ID" required="required" autocomplete="on" autofocus="autofocus">
     </div>
       <div class="btn-group">
        <button type="button" id="generateReportForDoc" class="btn btn-primary">Search</button>
                  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"><span class="caret"></span></button>
                  <ul class="dropdown-menu">
                  <li style="height: 30px;"><a href="#" id="female" title="not implemented">Convert to PDF</a></li>   
                   <li style="height: 30px;"><a href="#" id="female" title="not implemented">Print Report</a></li>   
                                          
                  </ul>
             </div>     
                  
</form>
    </div> 

<!--  style="height: 30px;" -->
            
  <!--Col1 Ends -->

	 <!--Col2 -->
	<a href="#" id="leftarrow" style="position: absolute; top: 40%; right:58%"> <i class="fa fa-chevron-left" id="leftarrow"></i></a>
	  <form role="form" id="reportForm">
	  <div class="col-lg-6" style="border:1px solid;top:-10px">
	<h3 align="center">2D Body Map for EHR</h3>
	<h4 align="center">Report</h4>
	<hr>
<div id="pageone">
  <div class="row" > 
  <div class="col-lg-5">
  
   <h5 style="text-decoration: underline;">Personal Information</h5>
  <div class="form-group">
              <label id="fname">  First Name: </label> ${reg.firstName}
   </div>
    <div class="form-group">
              <label id="lname">  Last Name:</label> ${reg.lastName}
   </div>
    <div class="form-group">
             <label id="gender"> Gender:</label> ${reg.gender}
   </div>
    <div class="form-group">
             <label id="gender">  Age:</label> ${reg.age}
   </div>
    <div class="form-group">
             <label id="email">   Email ID:</label> ${reg.email}
   </div>
      <div class="form-group">
             <label id="bid">     Body Map ID: </label> ${reg.BID}
   </div>
  </div> 
    
    <!--1st row second column  -->
<%--    <div class="col-lg-6" style="left:20%; top: -37px;">
       <div id="obj" style="top:30px;position: relative;border:1px solid;">
    
    
 	<svg style="width: 100%; height: 100%; position: absolute; top:0; left:0;">

        <c:if test="${annotation ne null }">
				
					<c:forEach begin="0" end="${fn:length(annotation)-1}" var="index">
              
				
					 <a href="About.jsp" id="annotationsLink" data-ot="Disease Code:${annotation[index].getDiseaseCode()}" data-ot-hide-trigger="trigger" data-ot-target="true"> <circle cx="${annotation[index].getX_Coord()-100}" cy="${annotation[index].getY_Coord()-35}" r="3" fill="yellow" />
					<text dx="${annotation[index].getX_Coord()+14}" dy="${annotation[index].getY_Coord()-60}">${annotation[index].getExtraDiseaseName()}</text></a> 
					 
					 
			
					</c:forEach>
				
			</c:if>
 </svg>
        
        </div>
    
</div> --%>
    </div><!--Row -->
    
    
    

   <div class="row"> 
   <div class="col-lg-6" style="width: 100%">
      <h5 style="text-decoration: underline;">Disease Information</h5>           
            <div class="table-responsive">
              <table class="table table-hover tablesorter">
                <thead>
                  <tr>
                  <th>BID</th>
                    <th>Disease Code </th>
                    <th>Disease Name </th>
                    <th>Date of Diagnosis </th>
                    <th>Disease Description </th>
               
                  </tr>
                </thead>
                <tbody>
                  <form name="disease" id="disease">
			<c:if test="${annotation ne null }">
				
					<c:forEach begin="0" end="${fn:length(annotation)-1}" var="index">
 <tr>
                    <td>${annotation[index].getBID()} </td>
                    <td>${annotation[index].getDiseaseCode()} </td>
                    <td>${annotation[index].getExtraDiseaseName()} </td>	
                    <td>${annotation[index].getDateOfDiag()}</td>
                    <td>${annotation[index].getDiseaseDesc()} </td>
                   
 				
 </tr>					
					
					</c:forEach>
				
			</c:if>
			</form>
                </tbody>
              </table>
              </div>
            </div>
            </div><!--Disease Table Row  -->
  </div>
  
  
  <div id="obj" style="left: 12%; position: relative;">
    
    
 	<svg style="width: 100%; height: 100%; position: absolute; top:0; left:0;">

        <c:if test="${annotation ne null }">
				
					<c:forEach begin="0" end="${fn:length(annotation)-1}" var="index">
              
				
					 <a href="About.jsp" id="annotationsLink" data-ot="Disease Code:${annotation[index].getDiseaseCode()}" data-ot-hide-trigger="trigger" data-ot-target="true"> <circle cx="${annotation[index].getX_Coord()+2}" cy="${annotation[index].getY_Coord()}" r="6" fill="yellow" />
					<text dx="${annotation[index].getX_Coord()+12}" dy="${annotation[index].getY_Coord()+4}">${annotation[index].getExtraDiseaseName()}</text></a> 
					 
					 
			
					</c:forEach>
				
			</c:if>
 </svg>
        
        </div>
  
  
  
  
</div>

    
    
    
    
     
       
   </form>
   <a href="#" id="switch" style="top: 40% ; left:86.75%; position: absolute;"> <i class="fa fa-chevron-right" id="switch"></i></a>
  </div><!--Close Column1  -->

   
   </div><!--Row Close1  -->
   





       <!--  <div id="obj" style="top:30px;position: absolute;border:1px solid;border-radius:25px;"></div> -->
    
   
 </div><!--Page Wrapper  -->
</div>

</div><!-- /.container -->
    
      <jsp:include page="FooterLayout.jsp" />
  </body>
</html>