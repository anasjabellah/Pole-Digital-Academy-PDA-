<%@ page import="java.util.List" %>
<%@ page import="com.example.digital_academy_pda.Entities.Responsable" %>
<%@ page import="com.example.digital_academy_pda.Entities.Participant" %><%--
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
    <title> List Participant </title>
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
                    <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listResponsable">Responsable</a>
                    <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/Participant">Participant</a>
                    <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listActivite">Activite</a>
                    <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listExercice">Exercice</a>
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
            <th scope="col">First name</th>
            <th scope="col">Last name</th>
            <th scope="col">Domaine</th>
            <th scope="col">phone</th>
            <th scope="col">email</th>
            <th scope="col">Structure</th>
            <th scope="col">Domain</th>
            <th scope="col">Role</th>
            <th> action </th>
        </tr>
        </thead>
        <tbody>
        <%
        List<Participant> Participants = (List<Participant>) request.getAttribute("participant");
        for(Participant participant : Participants){
        %>
        <tr>
            <th scope="row"><%= participant.getId() %></th>
            <td><%= participant.getNom() %></td>
            <td><%= participant.getPrenom() %></td>
            <td><%= participant.getDomaine() %></td>
            <td><%= participant.getTelephone() %></td>
            <td><%= participant.getEmail() %></td>
            <td><%= participant.getStructure() %></td>
            <td><%= participant.getDomaine()%></td>
            <td><%= participant.getRole().getName() %></td>
            <td>
                <a href="editParticipant?id=<%= participant.getId() %>" class="btn btn-primary">Edit</a>
                <a href="DeletParticipant?id=<%= participant.getId() %>" class="btn btn-danger">Delete</a>
            </td>
        <% } %>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
