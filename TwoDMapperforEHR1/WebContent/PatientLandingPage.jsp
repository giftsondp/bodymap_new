<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
 	<link rel="icon" type="image/png" href="img/icon.PNG">
    <title>Patient Home</title>
 <%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

    <!-- Bootstrap core CSS -->
  
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet"> 
    <link href="css/business-casual.css" rel="stylesheet">
    <script src="js/bootstrap.js"></script>
 	<script src="js/jquery.js"></script> 

    <script src="js/Three.js"></script>
    <script src="js/OBJLoader.js"></script>
<!--  	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>  --> 
 	<script src="js/opentip-jquery.js"></script><!-- Change to the adapter you actually use -->
	<link href="css/opentip.css" rel="stylesheet" type="text/css" />
	<script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script> 
<!--     <script src="js/d3.v3.min.js"></script> -->
	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">   
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">  
    
  
<script type="text/javascript">

$( document ).ready(function() {
	
	 var $ = jQuery.noConflict();
	  
	  var patientGender = '${user.gender}';
	  var bodyMap =  '${user.bodyMap}';
	  
	 

  
	if(patientGender=="M" && bodyMap=="Yes" )
		{
		   $("#nobody").remove();
		   $.getScript("js/Male.js");
		
		}
	
	else if (patientGender=="F" && bodyMap=="Yes")
		{
		 $("#nobody").remove();
		 $.getScript("js/Female.js");
		}
	
	else{
		
		Opentip.styles.noBodyMap = {			  
				   extends: "alert",	
				
				  target: true, 			
				  showEffectDuration: 0.5,
				  hideEffectDuration:0.3,
		 		  stem: true, 
		 	 	  offset: [-220,100], 
		 
		 	 	 hideTrigger: "trigger", 
				  hideTriggers:["closeButton","trigger", "tip", "target", "closeButton"],

				  closeButtonRadius: 7,
				  closeButtonCrossSize: 7,
				  closeButtonCrossColor:"#FFFFFF",
				  
				  showOn: "creation"
				};
		
		
		new Opentip("#obj", "Body Map not created!! Contact your doctor", {  style: "noBodyMap" });
		
		
		
	}
	
	Opentip.styles.myErrorStyle = {			  
			   extends: "dark",	
			
			  target: true, 
			  showEffectDuration: 0.5,
			  hideEffectDuration:0.3,
			  borderRadius: 2,
	 		  stem: true, 
	 		 shadow:true,
	 	
	 		 shadowBlur:0,
	 		   offset: [25,0], 
			/*    background: "#028482",  */ /* [[0,"white"],[1,"black"]] */
			  hideTrigger: "trigger", 
			  hideTriggers:["closeButton","trigger", "tip", "target", "closeButton"],
			  closeButtonRadius: 7,
			  closeButtonCrossSize: 7,
			  closeButtonCrossColor:"#FFFFFF",
			  
			  showOn: "creation"
			};

	new Opentip("#patientBID", "Please remember this ID during your next visit to the doctor!", "Body Map ID", {  style: "myErrorStyle" });
	
	
	
	

	
	

	 $("#viewDiseases").click(function(e) {
		 
			var bid = '${user.BID}';
			document.location.href="PatientGetAnnotations?bid="+bid;
	  			
	   });  
	 
	
	 
	 
	 

	}); 
	
	
</script>

<!--  data-ot="The content" data-ot-hide-trigger="trigger" data-ot-target="true" -->

  </head>

  <body>
  <jsp:include page="HeaderLayout.jsp" />
  
       <div class="container">
      <div class="row"> 
        <div class="box">      
        

 <!--         <div id="wrapper">  -->
  <jsp:include page="PatientMenuLayout.jsp" />

 
 <div id="page-wrapper">
 
  <div class="col-lg-3" style="left:-14px;">
            <div class="panel panel-primary" style="width: 100%; height: 520px;">
              <div class="panel-heading">
                <h3 class="panel-title" style="text-align: center"><i class="fa fa-user"></i> Patient Info</h3>
              </div>
              <div class="panel-body">
                <div class="list-group">                  
                  <a class="list-group-item">                    
                    <i class="fa fa-user"></i> <label> First Name: </label> ${user.firstName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-user"></i> <label>Last Name: </label> ${user.lastName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-check"></i> <label>Age: </label> ${user.age}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-male"></i> <label> Gender: </label> ${user.gender}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-envelope"> </i> <label> Email: </label> ${user.email}
                  </a>
                   <a class="list-group-item"  data-ot="This is the BID">                 
                    <i class="fa fa-tag"></i>  <label id="patientBID"  >Body Map ID: </label> ${user.BID}
                  </a>
                  
                   
                </div>
                <div class="text-right">
                  <a href="PatientPrintReport.jsp">View full report <i class="fa fa-arrow-circle-right"></i></a>
                </div>
              </div>
            </div>
            </div>


   	<div class="col-lg-4" style="top:-20px; left: -20px;">
            <h2>Body Map <small>View Mode</small></h2>
            <ol class="breadcrumb">
              <li class="active"><i class="fa fa-eye"></i> View Mode</li>
            </ol>
            <div class="alert alert-info alert-dismissable">
              <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
             This is the Body Map View Mode!!   </div>
             
          <button type="button" class="btn btn-primary" id="viewDiseases">View Diseases</button>
     
    </div> 
    
     <div class="col-lg-5">
 
     <div id="obj"  style="margin-top:0; width:100% ; border:1px solid;">
    
    
 	<svg style="width: 100%; height: 100%; position: absolute; top:0; left:0;">

        <c:if test="${annotation ne null }">
				
					<c:forEach begin="0" end="${fn:length(annotation)-1}" var="index">
              
				
						 <a href="About.jsp" id="annotationsLink" data-ot="Disease Code:${annotation[index].getDiseaseCode()}" data-ot-hide-trigger="trigger" data-ot-target="true"> <circle cx="${annotation[index].getX_Coord()+15}" cy="${annotation[index].getY_Coord()+4}" r="6" fill="yellow" />
					<text dx="${annotation[index].getX_Coord()+30}" dy="${annotation[index].getY_Coord()+12}">${annotation[index].getExtraDiseaseName()}</text></a>
					 
					 	 
			
					</c:forEach>
				
			</c:if>
 </svg>
        
        </div>
        
        <div id="nobody" style="top: 20px; position: relative; "><h4 align="center"> Your Body Map Has not been created yet!!</h4>
       <img alt="Body Map Not Present!" id="nobodyimg" src="human_body.jpg">
       
       </div>
       
       
       </div>

 </div>
</div>
</div>
</div><!-- /.container -->
    
      <jsp:include page="FooterLayout.jsp" />
  </body>
</html>