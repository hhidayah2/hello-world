<%-- 
    Document   : smprofile
    Created on : Nov 16, 2017, 12:00:04 AM
    Author     : damia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Space Manager Profile</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="css/bootstrap-theme.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
        .jumbotron, .footer{
            background-color: #1b6d85;
            color:#fff;
          
        }
        body {
                padding-left: 10px;
                padding-right: 10px;
                background-color: #ebebeb;
            }
            
        </style>
</head>
<body>
    
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ADIOS@UTM</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="smprofile.jsp">Home</a></li>
      <li><a href="ViewSession.jsp">View Session</a></li>
      <li><a href="login.jsp">Logout</a></li>
    </ul>
  </div>
</nav>

<br><br> <center>
    <div class="jumbotron text-center">
        <h1>Space Management Booking System</h1>
    </div>
    

    
<div class="container-fluid text-center bg-grey">
    <h2>Space Manager Information</h2><br>
        <div class="row">
            <div class="col-md-3">
                <A><img src="img/profiles.png" style="width:150px;height:150px;"/></A>
                <br>
                <br>
                <a href="editSM.jsp">
                <input type="submit" class="btn btn-info" value="EDIT PROFILE">
                </a>
            </div>
            <div class="col-md-9">
                <div class="thumbnail">
                <div class="table-responsive">
                    <table style="text-align:left">
                    <tr>
                    <td><b>ID</td>
                    <td> : </td>
                    <tr></tr>
                </tr>
                <tr>
                    <tr> </tr>
                    <td><b>Name</td>
                    <td>: </td>
                    <tr></tr>
                </tr>
                <tr>
                    <tr> </tr>
                    <td><b>Email</td>
                    <td>: </td>
                    <tr></tr>
                </tr>
                <tr>
                    <tr> </tr>
                    <td><b>Phone No</td>
                    <td>: </td>
                    <tr></tr>
                </tr>
                <br><br>
                </table>
                </div>
                </div>
            </div> 
        </div>
</div>
<br>
<br>
<br>
	
           
<div class="footer"> 
<center><br><p>Copyright@Universiti Teknologi Malaysia</p><br></center>
</div>
</center>
</center>

</body>
</html>
