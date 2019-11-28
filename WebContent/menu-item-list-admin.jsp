<%@ page import="com.truYum.model.MenuItem"  %>
<%@ page import="com.truYum.Dao.MenuItemDaoCollectionImpl"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
<link rel="stylesheet" href="style\styleyum.css">
<title>Menu Item List Admin</title>
</head>
<body>
<header class="header container-fluid">
<h1 class="header-itemleft">truYum</h1>
<img class="header-img" src="images\truyum.jfif" >
<a class="header-itemright" href="ShowMenuItemListAdminServlet">Menu</a>
</header> 
<section class="body-main">
<h2>Menu Item</h2>
<table width="100%">

<tr>
<th class ="td-allignleft">Name</th>
<th class="th-allignright">Price</th>
<th >Active</th>
<th >Date of Launch</th>
<th >Category</th>
<th >Free Delivery</th>
<th >Action</th>
</tr>

<c:forEach var="item" items="${adminMenuItemList}">
<tr>
<td class ="td-allignleft">${item.name}</td>
<td class="th-allignright"><fmt:setLocale value = "en_IN"/><fmt:formatNumber type="currency" value="${item.price}"/></td>	
<td >${item.active ? 'yes' : 'No'}</td>
<td ><fmt:formatDate pattern="dd/MM/yyyy" value="${item.dateOfLaunch}"/></td>
<td >${item.category}</td>
<td >${item.freeDelivery ? 'yes' : 'No' }</td>
<td ><a href="ShowEditMenuItemServlet?menuItemId=${item.id}">Edit</a></td>
</tr>
</c:forEach>

</table>
</section>
<div class ="footer">
<p>Copyright©2019</p>
</div>
</body>
</html>