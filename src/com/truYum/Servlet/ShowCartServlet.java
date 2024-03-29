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
import com.truYum.Dao.CartEmptyException;
import com.truYum.model.MenuItem;

/**
 * Servlet implementation class ShowCartServlet
 */
@WebServlet("/ShowCartServlet")
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long userId=1;
		CartDaoCollectionImpl cartDaoCollectionImpl=new CartDaoCollectionImpl();
		CartDao cartDao=cartDaoCollectionImpl;
		System.out.println("Inside doGet of ShowCartServlet");
		try{
			System.out.println("1");
			List <MenuItem> menuItemList=cartDao.getAllCartItem(userId);
			System.out.println("2");
			request.setAttribute("cartMenuList", menuItemList);
			System.out.println("3");
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			System.out.println("4");
		}
		catch(CartEmptyException e){
			System.out.println("inside catch block :"+request);
			request.getRequestDispatcher("cart-empty.jsp").forward(request, response);
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
