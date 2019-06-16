<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bookings</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

/* Style the container for inputs */
.container {
  background-color: #f1f1f1;
  padding: 20px;
  margin-right: 50px;
  margin-left: 50px;
}

.h11{
margin-left: 50px;
}
</style>
</head>
<body>

<h2 class="h11">My Bookings</h2>
<button class="h11" type="button" onclick="window.location.href='book'">Click Me!</button>
<div class="container">
<table>
  <tr>
    <th>Room ID</th>
    <th>Rooms Booked</th>
    <th>Checkout</th>
  </tr>
  <tr>
    <td>1</td>
    <td>4</td>
    <td><button class="info">vacate</button></td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
  </tr>
  <tr>
    <td>Ernst Handel</td>
    <td>Roland Mendel</td>
    <td>Austria</td>
  </tr>
  <tr>
    <td>Island Trading</td>
    <td>Helen Bennett</td>
    <td>UK</td>
  </tr>
  <tr>
    <td>Laughing Bacchus Winecellars</td>
    <td>Yoshi Tannamuri</td>
    <td>Canada</td>
  </tr>
  <tr>
    <td>Magazzini Alimentari Riuniti</td>
    <td>Giovanni Rovelli</td>
    <td>Italy</td>
  </tr>
</table>
</div>
</body>
</html>