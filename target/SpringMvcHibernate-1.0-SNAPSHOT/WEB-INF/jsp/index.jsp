<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>    

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Spring Web MVC and Hibernate</title>
    </head>
    <body>
        <div class="container">
        <h2>Student Data</h2>
         
        <p><td><a href="redirectCreate.html" class="btn btn-success" role="button">Add new a Student</a></p>
        <table class="table table-hover">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Lastname</th>
              <th>Year Level</th>
              <th>Edit</th>
              <th>Delete</th>
            </tr>
          </thead>
          <tbody>
              <c:forEach var="em" items="${lst}">
                <tr>
                    <td>${em.id}</td>
                    <td>${em.firstname}</td>
                    <td>${em.lastname}</td>
                    <td>${em.yearLevel}</td>
                    <td><a href="edit.html?id=${em.id}" class="btn btn-primary" role="button">Update</a></td>
                    <td><a href="remove.html?id=${em.id}" class="btn btn-danger" role="button"
                           onclick="return confirm('Are you sure!')">Delete</a></td>
                </tr>
              </c:forEach>
          </tbody>
        </table>
      </div>
    </body>
</html>
