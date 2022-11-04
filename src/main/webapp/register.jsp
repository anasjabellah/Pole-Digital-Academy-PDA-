<%--
  Created by IntelliJ IDEA.
  User: chaib
  Date: 11/3/2022
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <!-- bootstrap css -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
  <title>Login</title>
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
          <a class="nav-link" href="#">activities</a>
        </div>
      </div>
    </div>
  </nav>
</header>
<!--login form-->
  <div class="container mt-5 pt-5">
      <form method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">first name</label>
          <input type="text" name="firstname" class="form-control" >
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">lastname</label>
          <input type="text" name="lastname" class="form-control" >
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">username</label>
          <input type="text" name="username" class="form-control" >
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">phone</label>
          <input type="text" name="phone" class="form-control" >
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" name="con_password" class="form-control" id="exampleInputPassword">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
  </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
