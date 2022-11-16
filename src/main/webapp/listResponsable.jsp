<%@ page import="java.util.List" %>
<%@ page import="com.example.digital_academy_pda.Entities.Responsable" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 14/11/2022
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- bootstrap css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
    <title> List Responsable </title>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Login</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                    <a class="nav-link active" aria-current="page" href="#">Responsable</a>
                    <a class="nav-link active" aria-current="page" href="#">Participant</a>
                    <a class="nav-link active" aria-current="page" href="#">Activite</a>
                    <a class="nav-link active" aria-current="page" href="#">Exercice</a>
                </div>
            </div>
        </div>
    </nav>
</header>

<div class="container mt-5 pt-5">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Domaine</th>
            <th scope="col">type</th>
            <th scope="col">Etat</th>
            <th> action </th>
        </tr>
        </thead>
        <tbody>

        <%
            List<Responsable> responsables = (List<Responsable>) request.getAttribute("responsable");
            for (Responsable responsable: responsables) {

        %>

        <tr>
            <th scope="row"><%= responsable.getId()  %></th>
            <td><%= responsable.getNom()  %></td>
            <td><%= responsable.getPrenom()  %></td>
            <td><%= responsable.getDomaine()  %></td>
            <td><%= responsable.getType()  %></td>
            <td><%= responsable.getEtat()  %></td>
            <td><a href="/Pole_Digital_Academy_PDA_war_exploded/editResponsable?id=<%= responsable.getId() %>">edit</a> </td>
            <td><a href="/Pole_Digital_Academy_PDA_war_exploded/DeletResponsable?id=<%= responsable.getId() %>">delet</a></td>
        </tr>

        <% } %>
        </tbody>
    </table>
</div>

   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
