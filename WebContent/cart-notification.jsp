<!doctype html>
<html>
<head>
<title>Remove Cart</title>
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
<h2 style="color:green; text-align:center">Item removed from Cart successfully</h2>
<h2>Cart</h2>
<table width ="85%">
<th class ="td-allignleft">Name</th>
<th>Free Delivery</th>
<th class="th-allignright">Price</th>
<tr>
<td class ="td-allignleft">sandwich</td>
<td>Yes</td>
<td class="th-allignright">Rs.99.00</td>
<td><a href="cart-notification.jsp">Delete</a></td>
</tr>
<tr>
<td class ="td-allignleft">Burger</td>
<td>No</td>
<td class="th-allignright">Rs.129.00</td>
<td><a href="RemoveCartServlet">Delete</a></td>
</tr>
<tr>
<td></td>
<td>Total</td>
<td class="th-allignright">Rs.228.00</td>
</tr>
</table>
</section>
<div class ="footer">
<p>Copyright©2019</p>
</div>
</body>
</html>
