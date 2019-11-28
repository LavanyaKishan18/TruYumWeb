package com.truYum.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.truYum.Dao.MenuItemDao;
import com.truYum.Dao.MenuItemDaoCollectionImpl;
import com.truYum.model.MenuItem;

/**
 * Servlet implementation class ShowMenuItemListCustomerServlet
 */
@WebServlet("/ShowMenuItemListCustomerServlet")
public class ShowMenuItemListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMenuItemListCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl=new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao= menuItemDaoCollectionImpl;
		List<MenuItem> menuItemList=menuItemDao.getMenuItemListCustomer();
		request.setAttribute("customerMenuItemList", menuItemList);
		request.getRequestDispatcher("menu-item-list-customer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
