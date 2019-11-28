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
<a class="header-itemright" href="ShowCartServlet">Cart</a>
<a class="header-itemright" href="ShowMenuItemListCustomerServlet">Menu</a>
</header>
<section class="body-main">
<h2>Menu Item</h2>
<c:if test="${addCartStatus}">
<h2 style="color:green; text-align:center;">Item added to Cart Successfully</h2>
</c:if>
<table width="100%" >

<tr>
<th class ="td-allignleft">Name</th>
<th style=text-align:center>Free Delivery</th>
<th class="th-allignright">Price</th>
<th style=text-align:center>Category</th>
<th style=text-align:center>Action</th>
</tr>

<c:forEach var="item" items="${customerMenuItemList}">

<tr>
<td class ="td-allignleft">${item.name}</td>
<td style=text-align:center>${item.freeDelivery ? 'yes' : 'No' }</td>
<td class="th-allignright"><fmt:setLocale value = "en_IN"/><fmt:formatNumber type="currency" value="${item.price}"/></td>	
<td style=text-align:center>${item.category}</td>
<td style=text-align:center><a href="AddToCartServlet?menuItemId=${item.id}">Add To Cart</a></td>
</tr>

</c:forEach>

</table>
</section>
<div class ="footer">
<p>Copyright©2019</p>
</div>
</body>
</html>