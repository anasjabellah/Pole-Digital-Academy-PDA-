<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 16/11/2022
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.digital_academy_pda.Entities.Activite" %>
<%@ page import="com.example.digital_academy_pda.Entities.Responsable" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
  <title>edit Activet</title>
</head>
<body>
<div class="wrapper">

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
            <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listParticipant">Participant</a>
            <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listActivite">Activite</a>
            <a class="nav-link active" aria-current="page" href="/Pole_Digital_Academy_PDA_war_exploded/listExercice">Exercice</a>
          </div>
        </div>
      </div>
    </nav>
  </header>

  <div id="body" class="active">
    <!-- navbar navigation component -->
    <nav class="navbar navbar-expand-lg navbar-white bg-white">
      <button type="button" id="sidebarCollapse" class="btn btn-light">
        <i class="fas fa-bars"></i><span></span>
      </button>
    </nav>
    <!-- end of navbar navigation -->
    <div class="content">
      <div class="container">
        <div class="page-title">
          <h3>Add a new Activity</h3>
        </div>
        <div class="row">
          <div class="col-lg-12">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title"><p>You can edit this information and add exercises to this activity later</p></h5>
                <form method="post"  class="needs-validation" novalidate accept-charset="utf-8">
                  <%
                    // get the activity from the request
                    Activite activite = (Activite) request.getAttribute("activite");
                  %>
                  <div class="row g-2">
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">Activity Title</label>
                      <input type="text" class="form-control" name="title" value="<%= activite.getTitre() %>" placeholder="title" required>
                    </div>
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">Choose a responsible for this activity</label>
                      <select  name="responsible" class="form-control">
                        <option value="" selected disabled>Select</option>
                        <%
                          // listing all the responsible
                          List<Responsable> responsables = (List<Responsable>) request.getAttribute("responsable");
                          for (Responsable responsable : responsables) {
                        %>
                        <option value="<%= responsable.getId() %>"><%= responsable.getPrenom() %></option>
                        <%
                          }
                        %>
                      </select>
                    </div>
                  </div>
                  <div class="mb-3">
                    <label  class="form-label">Description</label>
                    <input value="<%= activite.getDescriptif() %>" name="description" class="form-control" rows="4" cols="50"></input>
                  </div>
                  <div class="row g-2">
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">start date</label>
                      <input type="date" value="<%= activite.getDateDebut()%>" class="form-control" name="startdate" required>
                    </div>
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">end date</label>
                      <input type="date" value="<%= activite.getDateDeFin()%>" class="form-control" name="enddate" required>
                    </div>
                  </div>
                  <div class="row g-2">
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">Activity state</label>
                      <select  name="activitystate" class="form-control">
                        <option value="" disabled>Select</option>
                        <option selected value="<%= activite.getStatut()%>"><%= activite.getStatut()%></option>
                        <option value="Active">Active</option>
                        <option value="Inactive">Inactive</option>
                      </select>
                    </div>
                    <div class="mb-3 col-md-6">
                      <label  class="form-label">Activity type</label>
                      <select  name="activitytype" class="form-control">
                        <option value="" disabled>Select</option>
                        <option selected value="<%= activite.getType()%>"><%= activite.getType()%></option>
                        <option value="Online">Online</option>
                        <option value="Outdoor">Outdoor</option>
                        <option value="Indoor">Indoor</option>
                      </select>
                    </div>
                  </div>
                  <button type="submit" name="submit" value="submit" class="btn btn-primary"><i class="fas fa-save"></i> Save</button>
                </form>

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
