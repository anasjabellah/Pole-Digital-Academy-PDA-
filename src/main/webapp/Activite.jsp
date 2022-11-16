<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 16/11/2022
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.digital_academy_pda.Entities.Activite" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
<div class="wrapper">

    <header>
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                        <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listResponsable">Responsable</a>
                        <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listParticipant">Participant</a>
                        <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listActivite">Activite</a>
                        <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listExercice">Exercice</a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <div id="body" class="active">
        <div class="content">
            <div class="container">
                <div class="page-title">
                    <h3>Activities table</h3>
                </div>
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="card">
                            <div class="card-header d-flex justify-content-between"><p>to view more info about an activity, click edit button</p> <a class="link-primary" href="/Pole_Digital_Academy_PDA_war_exploded/AddActivite">add activity</a></div>
                            <div class="card-body">
                                <p class="card-title"></p>
                                <table class="table table-hover" id="dataTables-example" width="100%">
                                    <thead>
                                    <tr>
                                        <th>Title</th>
                                        <th>Description</th>
                                        <th>Start Date</th>
                                        <th>End Date</th>
                                        <th>Type</th>
                                        <th>State</th>
                                        <th>Responsible</th>
                                        <th>Actions</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            // gettting the list of activities from the servlet
                                            List<Activite> activites = (List<Activite>) request.getAttribute("activite");
                                            for (Activite activite : activites) {
                                        %>
                                        <tr>
                                            <td><%= activite.getTitre() %></td>
                                            <td><%= activite.getDescriptif() %></td>
                                            <td><%= activite.getDateDebut() %></td>
                                            <td><%= activite.getDateDeFin() %></td>
                                            <td><%= activite.getType() %></td>
                                            <td><%= activite.getStatut() %></td>
                                            <td><%= activite.getResponsable().getPrenom() %></td>
                                            <td>
                                                <a class="btn btn-primary" href="editActivite?id=<%= activite.getId() %>">edit</a>
                                                <a class="btn btn-danger" href="DeletActivite?id=<%= activite.getId() %>">delete</a>
                                            </td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
