<%@ page import="com.example.digital_academy_pda.Entities.Participant" %><%--
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
  <title>Add  Participant</title>
</head>
<body>


<!--login form-->
<div class="container mt-5 pt-5">
  <h1>Add Participant</h1>

  <form method="post" action="/Pole_Digital_Academy_PDA_war_exploded/addParticipant">

    <div class="mb-3">
      <input type="number" hidden name="id" class="form-control">
    </div>


    <div class="mb-3">
      <label class="form-label">first name</label>
      <input type="text" name="firstname" class="form-control" >
    </div>

    <div class="mb-3">
      <label  class="form-label">lastname</label>
      <input type="text" name="lastname" class="form-control">
    </div>

    <div class="mb-3">
      <label class="form-label">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>


    <div class="mb-3">
      <label  class="form-label">Domaine</label>
      <input type="text" name="Domaine" class="form-control">
    </div>


    <div class="mb-3">
      <label  class="form-label">phone</label>
      <input type="text" name="phone" class="form-control">
    </div>


    <div class="mb-3">
      <label  class="form-label">Structure</label>
      <input type="text" name="Structure" class="form-control">
    </div>


    <button type="submit" class="btn btn-primary">Add</button>
  </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

