
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Exercice</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
</head>
<body>

<div class="wrapper">
    <div id="body" class="active">
        <div class="content">
            <div class="container">
                <div class="page-title">
                    <h3>Add a new Exercise</h3>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title"><p>You can edit this information later</p></h5>
                                <form method="post" action="insert-exercise" class="needs-validation" novalidate accept-charset="utf-8">
                                    <div class="row g-2">
                                        <div class="mb-3 col-md-6">
                                            <label  class="form-label">Exercise Title</label>
                                            <input type="text" class="form-control" name="title" placeholder="title" required>
                                        </div>
                                        <div class="mb-3 col-md-6">
                                            <label  class="form-label">Exercise Year</label>
                                            <input type="number" class="form-control" name="year" value="2022" min="2020" max="2030" required>
                                        </div>
                                    </div>
                                    <div class="row g-2">
                                        <div class="mb-3 col-md-6">
                                            <label  class="form-label">start date</label>
                                            <input type="date" class="form-control" name="start-date" required>
                                        </div>
                                        <div class="mb-3 col-md-6">
                                            <label  class="form-label">end date</label>
                                            <input type="date" class="form-control" name="end-date" required>
                                        </div>
                                    </div>
                                    <div class="row g-2">
                                        <div class="mb-3 col-md-6">
                                            <label  class="form-label">Activity state</label>
                                            <select  name="exercise-status" class="form-control">
                                                <option value=""></option>
                                            </select>
                                        </div>
                                        <div class="mb-3 col-md-6">
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
