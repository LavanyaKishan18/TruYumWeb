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
 * Servlet implementation class RemoveCartServlet
 */
@WebServlet("/RemoveCartServlet")
public class RemoveCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long userId=1;
		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;
		String menuItemId = request.getParameter("menuItemId");
		System.out.println(menuItemId);
		int menuitemid = Integer.parseInt(menuItemId);
		System.out.println("after parsing" + menuitemid);
		cartDao.removeCartItem(1, menuitemid);
		MenuItemDaoCollectionImpl menu = new MenuItemDaoCollectionImpl();

        MenuItemDao menuItemDao=menu;
      //List<MenuItem> menuItemList =cartDao.removeCartItem(userId,Long.parseLong(menuItemId));
        try{
		List<MenuItem> menuItemList=cartDao.getAllCartItem(1);
        
        request.setAttribute("removeCartStatus",true);
        request.setAttribute("cartMenuList",menuItemList);
        request.getRequestDispatcher("cart.jsp").forward(request,response);
        }
        catch(Exception e)
        {
        	request.getRequestDispatcher("cart-empty.jsp").forward(request, response);
        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
