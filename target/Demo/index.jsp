<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NTT Employee Details</title>
    <script>
		function search(){
	        let empId = prompt("Enter the Employee Id : ");
	        var form = document.getElementById("empId");
	        document.getElementById("id").value = empId;
	        document.getElementById("action").value = "Search";

	        document.getElementById("myForm").submit();
	    };
	    
	    function search(){
	        let empId = prompt("Enter the Employee Id : ");
	        var form = document.getElementById("empId");
	        document.getElementById("id").value = empId;
	        document.getElementById("action").value = "Search";

	        document.getElementById("myForm").submit();
	    };
	    
	    function validate(){
	    	
	    	let val;
	    	
	    	val = document.getElementById("name").value;
	    	if(!val.match(/^[A-Za-z]+$/)){
	            alert('Only alphabets are allowed');
	            return false;
	    	}
    	    	
	    	val = document.getElementById("id").value;
	    	if(isNaN(val) || val <= 0 || val > 100){
	    		alert("Enter ID between 1 to 100");
	    		return false;
	    	}
	    
	    	
	   /*  	val = document.getElementById("doj").value;
	    	alert(val);
	    	if(regs = form.startdate.value.match(re)) {
	            // day value between 1 and 31
	            if(regs[1] < 1 || regs[1] > 31) {
	              alert("Invalid value for day: " + regs[1]);
	              return false;
	            }
	            // month value between 1 and 12
	            if(regs[2] < 1 || regs[2] > 12) {
	              alert("Invalid value for month: " + regs[2]);
	              return false;
	            }
	            // year value between 1902 and 2020
	            if(regs[3] < 2018 || regs[3] > 2020){
	              alert("Invalid value for year: " + regs[3] + " - must be between 1902 and " + (new Date()).getFullYear());
	              return false;
	            } 
	    */       
	    };
	    
    </script>
</head>
<body>
    <div>
        <h1 align="center">NTT Employee Details</h1>
        <form id="myForm" autocomplete="off" action="DemoServlet" method="post" onsubmit="return(validate());">
            <table align="center">
                <tr>
                    <td><label for="name"><b>Name:</b></label></td>
                    <td><input id="name" name="name" type="text" required></input></td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                    <td><label for="id"><b>ID:</b></label></td>
                    <td><input id = "id" name="id" type="number" required></input></td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                    <td><label for="dob"><b>Date of Birth:</b></label></td>
                    <td><input name="dob" type="date" required></input></td>
                </tr>  
                <tr><td><br></td></tr>
                <tr>
                    <td><label for="doj"><b>Date of Joining:</b></label></td>
                    <td><input id ="doj" name="doj" type="date" required></input></td>
                </tr>  
                <tr><td><br></td></tr>
                <tr>
                    <td><label for="designation"><b>Designation:</b></label></td>
                    <td><input name="designation" type="text" required></input></td>
                </tr> 
                <tr><td><br></td></tr>
                <tr>
                	<td align="center"><input type="submit" name="save" value="Save">
										<input type="hidden" name="action" id="action" value="Save">
                	</td>
                	<td align="center"><button type="button" value="Search" onclick="search()">Search</button>                						
                	</td>                	
                </tr> 
            </table>
        </form>
    </div>
</body>
</html>
