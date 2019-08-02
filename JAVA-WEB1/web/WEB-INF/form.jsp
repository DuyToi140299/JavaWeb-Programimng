<%-- 
    Document   : form
    Created on : Aug 1, 2019, 2:20:59 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="com.java.user.User"%>
<%@page import="com.java.user.UserManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>

                    </form>
            </div>
        </nav>

        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Họ Tên</th>
                    <th scope="col">Khoa</th>
                    <th scope="col">Lớp</th>
                    <th scope="col">Chức năng</th>
                </tr>
            </thead>
            <tbody>
                <% UserManager us = new UserManager();
                   List<User> list = us.getUser();
                   for (User s : list) { %>
                   <tr>
                       <td><%= s.getId() %></td>
                       <td><%= s.getHoten()%></td>
                       <td><%= s.getLop()%></td>
                       <td><%= s.getKhoa()%></td>
                       <td><button type="button" class="btn btn-primary">Sửa</button>
                           <button type="button" class="btn btn-danger">Xóa</button>
                       </td>
                       
                   </tr>
                                      
                   <%} %>
                   <tr><button type="button" class="btn btn-success"><a href="">Thêm</a></button></tr>   
            </tbody>
        </table>

    </body>
</html>
