<%@ page import="com.truYum.model.MenuItem"%>
<%@ page import="com.truYum.Dao.MenuItemDaoCollectionImpl"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<title>edit menu item</title>
<script src="js\ValidateMenuItemForm.js">
	
</script>
<link rel="stylesheet" href="style\styleyum.css">
<style>
.body-main th {
	text-align: left;
}

.body-main td {
	text-align: left;
}
</style>
</head>
<body>
	<header class="header container-fluid">
		<h1 class="header-itemleft">truYum</h1>
		<img class="header-img" src="images\truyum.jfif"> <a
			class="header-itemright" href="ShowMenuItemListAdminServlet">Menu</a>
	</header>
	<section class="body-main">
		<h1>
			Edit Menu Item
			</h1>
				<c:set var="categories" value="Starters,Main Course,Dessert,Drinks"scope="application"></c:set>
				<c:set var="selected" value="${menuItem.category}" scope="application"></c:set>
				<form name="editMenuform" action="EditMenuItemServlet"onsubmit="return ValidateMenuItemForm()" method="post">
					<table>
						<tr>
							<th colspan="4" class="edittable"><label for="mname">Name</th>
						</tr>
						<tr>
							<td colspan="4"><input type="text" name="mname" id="mname"
								style="width: 815px; height: 35px"
								value=<c:out value="${menuItem.name}"/>></td>
						</tr>
						<tr>
							<th class="edittable"><label for="price">Price(Rs.)</th>
							<th class="edittable">Active</th>
							<th class="edittable"><label for="date">Date of Launch</th>
							<th class="edittable"><label for="category">Category</th>
						</tr>
						<tr>
							<td><input type="text" name="price" id="price"
								value="${menuItem.price}" style="height: 25px"></td>
							<c:choose>
								<c:when test="${menuItem.active}">
									<td><input type="radio" name="available" value="yes"
										id="active" checked><label>Yes</label> <input
										type="radio" name="available" value="no" id="active"><label>No</label>
									</td>
								</c:when>

								<c:otherwise>

									<td><input type="radio" name="available" value="yes"
										id="active"><label>Yes</label> <input type="radio"
										name="available" value="no" id="active" checked><label>No</label>
									</td>
								</c:otherwise>
							</c:choose>
							<td><input style="height: 25px; width: 200px" type="date" name="launchDate" id="launchDate" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${menuItem.dateOfLaunch}" />"></td>
							<td><select name="category" id="category" style="height: 25px">
									<option value="${menuItem.category}" selected>${selected}</option>
									<c:forEach items="${categories}" var="category">
										<c:if test="${category!=selected}">
											<option value="${category}">${category }</option>
										</c:if>
									</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td class="edittable"><input type="checkbox"
								name="freedelivery" value=""
								<c:if test="${menuItem.freeDelivery}"> checked="checked"</c:if>>
								<label>Free Delivery</label>
							<td>
						</tr>
						<tr>
							<td class="edittable"><a href="edit-menu-item-status.jsp"><input
									type="submit" class="button" value="Save"></a></td>
						</tr>

					</table>
	</section>
	<input type="hidden" name="menuitemid" id="menuitemid" value="${menuItem.id}">
	</form>
	<div class="footer">
		<p>Copyright©2019</p>
	</div>