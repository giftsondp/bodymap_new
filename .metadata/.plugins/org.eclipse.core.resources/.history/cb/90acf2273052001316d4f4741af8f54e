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
    <title>Doctor Edit Mode</title>
	<%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
	<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

    <!-- Bootstrap core CSS -->
 	<link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet"> 
    <link href="css/business-casual.css" rel="stylesheet">
    <script src="js/bootstrap.js"></script>
    <script src="js/jquery.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
    <link rel="stylesheet" href="../font-awesome/css/font-awesome.min.css">   
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">    
    <script src="js/Three.js"></script>
    <script src="js/OBJLoader.js"></script>
    <script>
    	var x_Offset = 0;
		var y_Offset = 0;
	</script>
	<script type="text/javascript" src="js/script.js"></script>
    
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />    
    
    <script type="text/javascript">
    
    $( document ).ready(function() {
    	var patientGender = '${patient.gender}';
  		var patientGender1 = '${reg.gender}';
  		
  		$("#svgElement").hide();
  	
  	  
 
	if(patientGender=="M" || patientGender1=="M" )
		{
		   $("#nobody").remove();
		   $.getScript("js/Male.js");
		
		}
	
	else if (patientGender=="F" || patientGender1=="F")
		{
		 $("#nobody").remove();
		 $.getScript("js/Female.js");
		}
    	 

  
  	}); 
    
    </script>
    
    <script type="text/javascript">
    

    $(function() {
    $("#searchPatientEditMode").click(function(e) {
     	
     	var bid = document.getElementById("bodyIDEditInput").value;
     	
   
     	
     	if(bid)
     		{
     
     		var page ="edit";
    		
	  		document.location.href="GetAllAnnotationsAction?bid="+bid+"&page="+page;
	  		
	  		
	  	
	  		/* $('#checkbox').is(':checked') */
	  		
	/*   		int bid = Integer.parseInt(request.getParameter("BID")); */
     		
     		}
     	else
     		{
     		
     		/* Only if else is added the "Required" Warning method shows! As this is a JQuery Call */
     		}
     	
  	    

  	
  }); 
    

    
    });   
    

    
    
    </script>
    
 <script type="text/javascript">
 function toggle(className, obj) {
	    var $input = $(obj);
	    if ($input.prop('checked')) $(className).show();
	    else $(className).hide();	}
 
 
 
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
 
<!--  col 1 -->
   <div class="col-lg-3" style="margin-top:0.5%; left: 1%">
            <div class="panel panel-info" style="width: 100%; height: 520px;">
              <div class="panel-heading">
                <h3 class="panel-title" style="text-align: center"><i class="fa fa-user"></i> Patient Info</h3>
              </div>
      <div class="panel-body">
                <div class="list-group">                  
                  <a class="list-group-item">                    
                    <i class="fa fa-user"></i> <label> First Name: </label> <label id="fname" style="font-weight:normal;">${patient.firstName}${reg.firstName}</label>
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-user"></i> <label> Last Name: </label> <label id="lname" style="font-weight:normal;">${patient.lastName}${reg.lastName}</label>
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-check"></i> <label> Age: </label> <label id="age" style="font-weight:normal;">${patient.age}${reg.age}</label>
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-male"></i> <label> Gender: </label> <label id="gender" style="font-weight:normal;">${patient.gender}${reg.gender}</label>
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-envelope"></i> <label> Email: </label> <label id="email" style="font-weight:normal;">${patient.email}${reg.email}</label>
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-tag"></i> <label >Body Map ID: </label> <label id="bid" style="font-weight:normal;">${patient.BID}${reg.BID}</label>
                  </a>
                </div>     
          
              </div>
            </div>
            </div>
 
 
 <!-- col 2 -->
 
  	<div class="col-lg-4" style="margin-top:0; padding-left: 1%">
            <h2>Body Map <small>Edit Mode</small></h2>
            <ol class="breadcrumb">
              <li class="active"><i class="fa fa-eye"></i> Edit Mode</li>
            </ol>
            
         <!--  <h4 id="patientName" align="center"></h4> -->
            <!-- <div class="alert alert-success alert-dismissable">
              <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
             This is the Body Map View Mode!!   </div> -->
             
             
	<form role="form" id="myForm1">
     <div class="form-group">
         <label>Body Map ID</label>
       
        <input id="bodyIDEditInput" class="form-control" title="Patient Body Map ID" placeholder="Enter Body Map ID" autocomplete="on" autofocus="autofocus" required> 

     </div>
     
     
     <div class="form-group">

       <button type="button" id="searchPatientEditMode" class="btn btn-primary" >Search Patient</button>
    
       </div>
      
      
      <details>
       <summary>Filter </summary>
       <div id="seeAnnotations">
     	<label>See Past Annotations/Diseases:</label>
       <input onclick="toggle('#svgElement', this)" type="checkbox" value="">
 		
       </div>
     </details>
	</form>
   </div> 

      <!--Col3  -->
   
     <div class="col-lg-5">

       <div id="obj" style=";border:1px solid;">	
       
       <svg id="svgElement" style="width: 100%; height: 100%; position: absolute; top:0; left:0;">

        <c:if test="${annotation ne null }">
				
					<c:forEach begin="0" end="${fn:length(annotation)-1}" var="index">
              
				
						 <a href="About.jsp" id="annotationsLink" data-ot="Disease Code:${annotation[index].getDiseaseCode()}" data-ot-hide-trigger="trigger" data-ot-target="true"> <circle cx="${annotation[index].getX_Coord()+15}" cy="${annotation[index].getY_Coord()+4}" r="6" fill="yellow" />
					<text dx="${annotation[index].getX_Coord()+30}" dy="${annotation[index].getY_Coord()+12}">${annotation[index].getExtraDiseaseName()}</text></a>
					 
					 	
					 
			
					</c:forEach>
				
			</c:if>
 </svg>	   	
		   	  
	<%-- <div id="toPopup">
				<div class="close"></div>
				<span class="ecs_tooltip">Press Esc to close <span class="arrow"></span></span>
				<div id="popup_content">
					<form name="test" id="test" action="AddAnnotationAction" method="post">
						<table style="width: 100%;">
							<tr>
								<td>Disease Name</td>
								<td>
									<c:if test="${listOfDiseases ne null }">
										<select name="diseaseName">
											<c:forEach begin="0" end="${fn:length(listOfDiseases)-1}"
												var="index">
												<option value="${listOfDiseases[index].getDiseaseCode()}">${listOfDiseases[index].getDiseaseName()}</option>
											</c:forEach>
										</select>
									</c:if>
								</td>
							</tr>
							<tr>
								<td>Disease Description</td>
								<td>
									<textarea name="diseaseDesc" rows="10" cols="20"></textarea>
								</td>
							</tr>
							<tr>
								<td>Date</td>
								<td>
									<input type="text" name="dateofdiag" id="dateofdiag" style="position:relative; z-index:100000;" placeholder="mm/dd/yyyy" readonly="readonly" required />
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="hidden" name="x_Offset" id="x_Offset" value=""/>
									<input type="hidden" name="y_Offset" id="y_Offset" value=""/>
									<input type="hidden" name="BID" id="BID" value="${patient.BID}${reg.BID}"/>
									<button type="submit">Save Details</button>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>   
			<div class="loader"></div>
		   	<div id="backgroundPopup"></div>
		</div>    
    </div>  --%>
    <div class="loader"></div>
		   	<div id="backgroundPopup"></div>
  
    
     <!--Col3 Ends  -->
    </div>
 </div><!--Page Wrapper  -->
</div>
</div>
</div><!-- /.container -->

<div id="toPopup">
				<div class="close"></div>
				<span class="ecs_tooltip">Press Esc to close <span class="arrow"></span></span>
				<div id="popup_content">
					<form name="test" id="test" action="AddAnnotationAction" method="post">
						<table style="width: 100%;">
							<tr>
								<td>Disease Name</td>
								<td>
									<c:if test="${listOfDiseases ne null }">
										<select name="diseaseName">
											<c:forEach begin="0" end="${fn:length(listOfDiseases)-1}"
												var="index">
												<option value="${listOfDiseases[index].getDiseaseCode()}">${listOfDiseases[index].getDiseaseName()}</option>
											</c:forEach>
										</select>
									</c:if>
								</td>
							</tr>
							<tr>
								<td>Disease Description</td>
								<td>
									<textarea name="diseaseDesc" rows="10" cols="20"></textarea>
								</td>
							</tr>
							<tr>
								<td>Date</td>
								<td>
									<input type="text" name="dateofdiag" id="dateofdiag" style="position:relative; z-index:100000;" placeholder="mm/dd/yyyy" readonly="readonly" required />
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="hidden" name="x_Offset" id="x_Offset" value=""/>
									<input type="hidden" name="y_Offset" id="y_Offset" value=""/>
									<input type="hidden" name="BID" id="BID" value="${patient.BID}${reg.BID}"/>
									<button type="submit">Save Details</button>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>   
			<!-- <div class="loader"></div>
		   	<div id="backgroundPopup"></div> -->
		</div>    
    </div>
    
      <jsp:include page="FooterLayout.jsp" />
  </body>
</html>