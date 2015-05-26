<%-- 
    Document   : create
    Created on : May 22, 2015, 10:02:27 AM
    Author     : Hasan
--%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>    
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Spring Create Page</title>
    </head>
    <body>
        <div class="container">
        <h2>Create Pages</h2>
        <form class="form-horizontal" role="form" action="create.html" modelAttritube="employee">
            <div class="form-group">
              <label class="control-label col-sm-2" for="email">Name:</label>
              <div class="col-sm-4">
                  <input type="text" class="form-control" id="email" placeholder="Enter name" name="name"  required>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label col-sm-2" for="pwd">Lastname:</label>
              <div class="col-sm-4">          
                  <input type="text" class="form-control" id="pwd" placeholder="Enter lastname" name="lastname"  required>
              </div>
            </div>
            <div class="form-group">
              <label class="control-label col-sm-2" for="phone">Password:</label>
              <div class="col-sm-4">          
                  <input type="text" class="form-control" id="phone" placeholder="Enter password" name="password"  required>
              </div>
            </div>
            <div class="form-group">        
              <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-info">Save</button>
              </div>
            </div>
        </form>
      </div>
    </body>
</html>
