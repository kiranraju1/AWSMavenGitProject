<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Angular Book Application</title>

<link href="resources/styles/main.css" rel="stylesheet" />
<link href="resources/styles/bootstrap.min.css" rel="stylesheet" />
<script src="resources/scripts/angular.js" ></script>
<script src="resources/scripts/angular-route.js" ></script>



</head>
<body data-ng-app = "MyApp">

<h2>ng-view example</h2>



<a href ="#abc">Get All Books</a>

<div data-ng-view></div>

<script src ="resources/scripts/MyApp.js"></script>
<script src ="resources/scripts/controller/GetAllBooksController.js"></script>
 <script src ="resources/scripts/services/forecast.js"></script> 
</body>
</html>