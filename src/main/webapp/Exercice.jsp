
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
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
                        <a class="nav-link active" aria-current="page" href="#">Responsable</a>
                        <a class="nav-link active" aria-current="page" href="#">Participant</a>
                        <a class="nav-link active" aria-current="page" href="#">Activite</a>
                        <a class="nav-link active" aria-current="page" href="#">Exercice</a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <div id="body" class="active">
        <div class="content">
            <div class="container">
                <div class="page-title">
                    <h3>Exercises table</h3>
                </div>
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="card">
                            <div class="card-header d-flex justify-content-between"><p></p> <a class="link-primary" href="create-exercise">add exercise</a></div>
                            <div class="card-body">
                                <p class="card-title"></p>
                                <table class="table table-hover" id="dataTables-example" width="100%">
                                    <thead>
                                    <tr>
                                        <th>title</th>
                                        <th>year</th>
                                        <th>start date</th>
                                        <th>end date</th>
                                        <th>status</th>
                                        <th>Actions</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td>
                                                <a class="btn-info" href="">Edit</a>
                                                <a class="btn-danger" href="">Delete</a>
                                            </td>
                                        </tr>
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
