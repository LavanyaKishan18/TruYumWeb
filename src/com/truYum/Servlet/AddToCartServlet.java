package com.truYum.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.truYum.Dao.CartDao;
import com.truYum.Dao.CartDaoCollectionImpl;
import com.truYum.Dao.MenuItemDao;
import com.truYum.Dao.MenuItemDaoCollectionImpl;
import com.truYum.model.MenuItem;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long userId=1;
        
        System.out.println("inside do get");
        String menuItemId = request.getParameter("menuItemId");
        int menuitemid=Integer.parseInt(menuItemId);
        CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
        CartDao cartDao = cartDaoCollectionImpl;
        cartDao.addCartItem(1,menuitemid);
        MenuItemDaoCollectionImpl menu= new MenuItemDaoCollectionImpl();
        
        MenuItemDao menuItemDao=menu;
        List<MenuItem> menuItemList= menuItemDao.getMenuItemListCustomer();
        
        request.setAttribute("addCartStatus",true);
        request.setAttribute("customerMenuItemList",menuItemList);
        request.getRequestDispatcher("menu-item-list-customer.jsp").forward(request,response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
