<%@ page import="com.example.digital_academy_pda.Entities.Responsable" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 09/11/2022
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- bootstrap css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
    <title>Edit  Responsable</title>
</head>
<body>


<!--login form-->
<div class="container mt-5 pt-5">
    <h1>Edit Responsable</h1>

    <form method="post" action="/Pole_Digital_Academy_PDA_war_exploded/editResponsable">

        <% Responsable responsable = (Responsable) request.getAttribute("responsablee"); %>

        <div class="mb-3">
            <label class="form-label">id</label>
            <input type="number" name="id" class="form-control" value="<%= responsable.getId() %>" >
        </div>


        <div class="mb-3">
            <label class="form-label">first name</label>
            <input type="text" name="firstname" class="form-control" value="<%= responsable.getNom() %>" >
        </div>

        <div class="mb-3">
            <label  class="form-label">lastname</label>
            <input type="text" name="lastname" class="form-control" value="<%= responsable.getPrenom() %>" >
        </div>

        <div class="mb-3">
            <label class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email" value="<%= responsable.getEmail() %>" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>


        <div class="mb-3">
            <label  class="form-label">Domaine</label>
            <input type="text" name="Domaine" class="form-control" value="<%= responsable.getDomaine() %>" >
        </div>


        <div class="mb-3">
            <label  class="form-label">phone</label>
            <input type="text" name="phone" class="form-control" value="<%= responsable.getTelephone() %>" >
        </div>


        <select name="type" class="form-select mb-3" value="<%= responsable.getType() %>" aria-label="Default select example" >
            <option selected>Open this select menu</option>
            <option value="formateur">formateur</option>
            <option value="intervenant"> intervenant</option>
        </select>


        <select name="Etat" class="form-select mb-3" value="<%= responsable.getEtat() %>" aria-label="Default select example">
            <option selected>Open this select menu</option>
            <option value="active">activé</option>
            <option value="désactive">désactivé</option>
        </select>


        <button type="submit" class="btn btn-primary">Edit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
