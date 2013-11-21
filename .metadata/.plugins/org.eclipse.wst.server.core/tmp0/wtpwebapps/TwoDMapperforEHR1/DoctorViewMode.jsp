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
    <title>Doctor View Mode</title>
    
        <%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

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
    
<!-- <script src="js/base64.js"></script>
   	 <script src="js/canvas2image.js"></script>
     <script src="http://html2canvas.hertzen.com/build/html2canvas.js"></script> -->
       	<script src="js/opentip-jquery.js"></script><!-- Change to the adapter you actually use -->
	<link href="css/opentip.css" rel="stylesheet" type="text/css" />
      <script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script>
<!--          <script src="js/d3.v3.min.js"></script> -->
    
    
<script type="text/javascript">


$( document ).ready(function() {
	
	
   	  

	var patientGender = '${reg.gender}';
	  
	  

	if(patientGender=="M" )
		{
		   $("#nobody").remove();
		   $.getScript("js/Male.js");
		
		}
	
	else if (patientGender=="F")
		{
		 $("#nobody").remove();
		 $.getScript("js/Female.js");
		}
  	  
	
	
	
	
	 $("#viewBodyMap").click(function(e) {
		 
		 
	
		var bid = document.getElementById("bodyIDInput").value;

		 if(bid)
  			{ 
			 	var page ="view";
		
				
		  		document.location.href="GetAllAnnotationsAction?bid="+bid+"&page="+page;
  		}
  		 else
  			{
  			 
  			 alert("Please Enter a Body Map ID");
  		
  			/* Only if else is added the "Required" Warning method shows! As this is a JQuery Call */
  		 } 
   });   
	  
	
	/* $('canvas') */
	
	/* 
	$("#image").click(function() {		 */

	/* 	  html2canvas([document.getElementById('obj')], {
		    onrendered: function (canvas) { */
		       
		    	
		    	/* var c = document.getElementsByTagName('canvas');
		  		  var t = c.getContext('2d');
		    	
		    	
		        var data = t.toDataURL('image/png');		      
		        
		       	var img = document.createElement('img');
				 img.src = data;
				 document.getElementById('chuma').appendChild(img);
				// Download image
				 window.location = data.replace("image/png", "image/octet-stream");  */
/* 		    } */
		  
		/* });  */
		 
		
		
		
		
	/* }); */
	
	


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
   <div class="col-lg-3" style="margin-top:0.5%; left: 1%">
            <div class="panel panel-info" style="width: 100%; height: 520px;">
              <div class="panel-heading">
                <h3 class="panel-title" style="text-align: center"><i class="fa fa-user"></i> Patient Info</h3>
              </div>
              <div class="panel-body">
                <div class="list-group">                  
                  <a class="list-group-item">                    
                    <i class="fa fa-user"></i> <label> First Name: </label> ${reg.firstName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-user"></i> <label> Last Name: </label> ${reg.lastName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-check"></i> <label> Age: </label> ${reg.age}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-male"></i> <label> Gender: </label> ${reg.gender}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-envelope"></i> <label> Email: </label> ${reg.email}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-tag"></i> <label >Body Map ID: </label> ${reg.BID}
                  </a>
                </div>             
              </div>
            </div>
    </div> 
 
<!--  style="height: 30px;" -->
            
  <!--Col1 Ends -->

	 <!--Col2 -->
  	<div class="col-lg-4" style="margin-top:0; padding-left: 1%">
      <h2>Body Map <small>View Mode</small></h2>
            <ol class="breadcrumb">
              <li class="active"><i class="fa fa-eye"></i> View Mode</li>
            </ol>
            
          <h4 id="patientName" align="center"></h4>
          
 <form role="form" id="myForm">
     <div class="form-group">
                <label>Body Map ID</label>
                <input id="bodyIDInput" class="form-control" title="Patient Body Map ID" placeholder="Enter Body Map ID"  autocomplete="on" autofocus="autofocus" required>
     </div>
      <div class="form-group">

       			<button type="button" class="btn btn-primary" id="viewBodyMap">Search Patient</button>
       			
      </div>            
                  
                  
</form> 
        
    
    </div> 
    
     <!--Col2 Ends -->
     
      <!--Col3  -->
   
    
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
     
       
       </div>
    
     <!--Col3 Ends  -->
    </div>
 </div><!--Page Wrapper  -->
</div>
</div>
</div><!-- /.container -->
    
      <jsp:include page="FooterLayout.jsp" />
  </body>
</html>