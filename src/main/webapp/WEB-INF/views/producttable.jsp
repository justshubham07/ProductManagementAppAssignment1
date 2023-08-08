<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>ProductManagementSystem 😋</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            border: 1px solid black; /* Add border to the entire table */
        }

        th, td {
            border: 1px solid black; /* Add border to cells */
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Product List 🍕🌮🍰🥤</h1>
    <table>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Quantity</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.productid}</td>
                <td>${product.productname}</td>
                <td>${product.productprice}</td>
                <td>${product.productqty}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
