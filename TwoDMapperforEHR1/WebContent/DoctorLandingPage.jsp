<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<title>Doctor Landing Page</title>
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/datatables.css">
		 
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
   <script src="js/opentip-jquery.js"></script><!-- Change to the adapter you actually use -->
	<link href="css/opentip.css" rel="stylesheet" type="text/css" />

    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">   
    
    <script type="text/javascript">
    
	
 	 $(function() {	  
		$("#refreshLink").click( function() {		
			
			
			document.location.href="userDetailsForDoctor";  
			
			/*$.ajax({
				 type: "POST",			 
	  	         url: "userDetailsForDoctor",
	  	      	 data: null,
	  	         
	  	         success: function(data) {    	    	        	 
											  var tr;
											
										     for (var i = 0; i < data.length; i++) {		
										    	 
										    	 /* alert(data[i].lastName); */
										    	
										          /*   tr = $('<tr>');
										            tr.append('<td><input type="radio" name="optionRadios" value=""></td>');
										            tr.append('<td id='+data[i].BID+'>' + data[i].firstName + '</td>');
										            tr.append('<td>' + data[i].lastName + '</td>');
										            tr.append('<td class="center">' + data[i].gender + '</td></tr>'); */
										            
										            
										           /*  var row = '<tr>';
													
										            row += '<td><input type="radio" name="optionRadios" value=""></td>';
									                row += '<td id='+ data[i].BID + '>' + data[i].firstName+ '</td>';
									                row += '<td>' + data[i].lastName + '</td>';
									                row += '<td>' + data[i].gender + '</td>';
									               
									             

									                row += '</tr>';
										      
										            
									                $("table tbody").append(row);
										  }
										 
	  	         
	  	         }
	        });*/
			
			
		 });
		
	 }); 

 	 /* ToolTip */
 	 Opentip.styles.selectPatient = {			  
			   extends: "alert",	
			
			  target: true, 			
			  showEffectDuration: 0.5,
			  hideEffectDuration:0.3,
	 		  stem: true, 
	 
	 		 offset: [-380,-12], 
	 	 	 hideTrigger: "trigger", 
			  hideTriggers:["closeButton","trigger", "tip", "target", "closeButton"],

			  closeButtonRadius: 7,
			  closeButtonCrossSize: 7,
			  closeButtonCrossColor:"#FFFFFF",
			  
			  showOn: "creation"
			};
	
    
    
    
    
    
    var buttonID;
	$(function() {	  
		$("#createBodyMap").click( function() {		
			
				buttonID = $(this).attr("id");			
			
			     var checked = $("input[name=optionRadios]:checked");	
			     
			     if(checked.val()!=null)
			    	 {
						    	
			    	var id=$(checked).closest('tr').children('td:eq(1)').attr('id');			
			    	document.location.href="SetFlagServlet?Id="+id;		     
				    	 
			    	 }
			     else
			    	 {
			    
			    	 
			    	
					
					new Opentip("#reference", "Select a Patient!", {  style: "selectPatient" });
					
			    	
			    	
			    	 
			    	 }
	 
		 });
	});
	
	
	$(function() {	  
		$("#deletePatient").click( function() {					
			    	
			 var checked = $("input[name=optionRadios]:checked");	
		     
		     if(checked.val()!=null)
		    	 {
					    	
		    	var id=$(checked).closest('tr').children('td:eq(1)').attr('id');
		    	document.location.href="DeletePatient?Id="+id;		     
			    	 
		    	 }
		     else
		    	 {
		    	 
		    
		    		new Opentip("#reference", "Select a Patient!", {  style: "selectPatient" });
		    	 
		    	 }
 
				 
		 });
	});
	
    
    
    
    
    
    </script>
		
	</head>
	<body>
	<jsp:include page="HeaderLayout.jsp" />
	
        
	  <div class="container" style="height: 100%">
        <div class="row" style="overflow: auto;"> 
        <div class="box" style="height: auto;">    
          <jsp:include page="DoctorMenuLayout.jsp" />
	
		<div id="page-wrapper">
		<div class="container">
		
		<div class="col-lg-3" style="margin-top:0; right: 1%">
            <div class="panel panel-primary" style="width: 100%; height: 520px;">
              <div class="panel-heading">
                <h3 class="panel-title" style="text-align: center"><i class="fa fa-user"></i> Doctor Info</h3>
              </div>
              <div class="panel-body">
                <div class="list-group">                  
                  <a class="list-group-item">                    
                    <i class="fa fa-user"></i> <label> First Name:</label> ${user.firstName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-user"></i>  <label>Last Name:</label> ${user.lastName}
                  </a>
                  <a class="list-group-item">                 
                    <i class="fa fa-check"></i>  <label>Age:</label> ${user.age}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-male"></i> <label> Gender: </label> ${user.gender}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-envelope"> </i> <label> Email:</label> ${user.email}
                  </a>
                   <a class="list-group-item">                 
                    <i class="fa fa-tag"></i>  <label>Doctor ID:</label> <%-- ${user.doctorID} --%>
                  </a>
                </div>
                <div class="text-right">
                  <a href="#">View full profile <i class="fa fa-arrow-circle-right"></i></a>
                </div>
              </div>
            </div>
            </div>
            
        <div class="col-lg-9" style="margin-top:0;">
            <h2>Body Map <small>Doctor Dashboard</small></h2>
            <ol class="breadcrumb" style="width: 82%">
              <li class="active"><i class="fa fa-dashboard"></i> Dashboard</li>
            </ol>
      <form action="">
    
     <div class="row">
          <div class="col-lg-8">
            <h4>Registered Patients <small>(without bodymap) <a href="#" id="refreshLink" > <i class="fa fa-refresh" style="color: black"></i></a> </small></h4>
			
				<table cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered">
					<thead>
						<tr>
							<th><i class="fa fa-check"></i></th>
							<th>First Name <i class="fa fa-sort"></i></th>
							<th>Last Name <i class="fa fa-sort"></i></th>
							<th>Gender</th>
					
						</tr>
					</thead>
					<tbody>
					
					
					<c:if test="${registration ne null }">
				
					<c:forEach begin="0" end="${fn:length(registration)-1}" var="index">
					 <tr>
                    	<td><input type="radio" name="optionRadios" value=""></td>
                  		<td id="${registration[index].getBID()}" class="checkBox">${registration[index].getFirstName()} </td>
                  		<td id="reference">${registration[index].getLastName()}</td> 
                    	<td>${registration[index].getGender()} </td>
					 </tr>						
					</c:forEach>
				
					</c:if>
				
					</tbody>
					<tfoot>
						<tr>
							<th><i class="fa fa-check"></i></th>
							<th>First Name <i class="fa fa-sort"></i></th>
							<th>Last Name <i class="fa fa-sort"></i></th>
							<th>Gender</th>
					
						</tr>
					</tfoot>
				</table>
				</div>		
		<div class="col-lg-4" style="margin-top: 13.5%;">
		           <p>              
		          <button type="button" class="btn btn-primary btn-lg" id="createBodyMap">Create Body Map</button>
		          </p>
	          
		           <p>              
		          <button type="button" class="btn btn-primary btn-lg" id="deletePatient">Delete Patient</button>
		          </p>
           
		    </div> 
		    </div>
		    </form>
			</div>
		</div>
		
		</div>
		</div>
		</div>
		</div>
		   <jsp:include page="FooterLayout.jsp" />
		<script src="//cdnjs.cloudflare.com/ajax/libs/datatables/1.9.4/jquery.dataTables.min.js"></script>
		<script src="js/datatables.js"></script>
		<script type="text/javascript">
		$(document).ready(function() {
			$('.datatable').dataTable({
				"sPaginationType": "bs_normal"
			});	
			$('.datatable').each(function(){
				var datatable = $(this);
				// SEARCH - Add the placeholder for Search and Turn this into in-line form control
				var search_input = datatable.closest('.dataTables_wrapper').find('div[id$=_filter] input');
				search_input.attr('placeholder', 'Search');
				search_input.addClass('form-control input-sm');
				// LENGTH - Inline-Form control
				var length_sel = datatable.closest('.dataTables_wrapper').find('div[id$=_length] select');
				length_sel.addClass('form-control input-sm');
			});	
			
			Opentip.styles.refreshTip = {			  
					   extends: "dark",	
					
					  target: true, 			
					  showEffectDuration: 0.5,
					  hideEffectDuration:0.3,
			 		  stem: true, 
			 	 	
			 
			 	 	 hideTrigger: "trigger", 
					  hideTriggers:["closeButton","trigger", "tip", "target", "closeButton"],

					  closeButtonRadius: 7,
					  closeButtonCrossSize: 7,
					  closeButtonCrossColor:"#FFFFFF",
					  
					  showOn: "creation"
					};
			
			
			new Opentip("#refreshLink", "Refresh your Patient List", {  style: "refreshTip" });
			
			
		});
		</script>
	</body>
</html>