<%@ page import="com.truYum.model.MenuItem"  %>
<%@ page import="com.truYum.Dao.MenuItemDaoCollectionImpl"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!doctype html>
<html>
<head>
<title>Menu Item List Customer</title>
<link rel="stylesheet" href="style\styleyum.css">
</head>
<body>
<header class="header container-fluid">
<h1 class="header-itemleft">truYum</h1>
<img class="header-img" src="images\truyum.jfif" >
<a class="header-itemright" href="cart.jsp">Cart</a>
<a class="header-itemright" href="menu-item-list-customer.jsp">Menu</a>
</header>
<section class="body-main">
<h2 style="color:green; text-align:center;">Item added to Cart Successfully</h2>
<h2>Menu Items</h2>
<c:if test="${addCartStatus}"><h2 style="color:green; text-align:center;">Item added to Cart Successfully</h2></c:if>
<table>
<th class ="td-allignleft">Name</th>
<th>Free Delivery</th>
<th class="th-allignright">Price</th>
<th>Category</th>
<th>Action</th>
<tr>
<td class ="td-allignleft">Sandwich</td>
<td>Yes</td>
<td class="th-allignright">Rs.99.00</td>
<td>Main Course</td>
<td><a href="#">Add to cart</a></td>
</tr>
<tr>
<td class ="td-allignleft">Burger</td>
<td>No</td>
<td class="th-allignright">Rs.129.00</td>
<td>Main Course</td>
<td><a href="#">Add to cart</a></td>
</tr>
<tr>
<td class ="td-allignleft">Pizza</td>
<td>No</td>
<td class="th-allignright">Rs.149.00</td>
<td>Main Course</td>
<td><a href="#">Add to cart</a></td>
</tr>
</table>
</section>
<div class ="footer">
<p>Copyright©2019</p>
</div>
</body>
</html>