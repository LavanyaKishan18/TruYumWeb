package com.truYum.Dao;

import java.text.ParseException;
import java.util.List;

import com.truYum.model.Cart;
import com.truYum.model.MenuItem;
import com.truYum.util.DateUtil;
public class CartDaoCollectionImplTest {

    /**
    * @param args
    */
	public static void main(String[] args) throws CartEmptyException {
        // TODO Auto-generated method stub

        testAddCartItem();
        testRemoveCartItem();
        testGetAllCartItems();

}

	static void testAddCartItem() throws CartEmptyException {

        CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
        CartDao cartDao = cartDaoCollectionImpl;
        cartDao.addCartItem(2,4);
        cartDao.addCartItem(2,3);
        List<MenuItem> menuItemList = cartDao.getAllCartItem(2);
        System.out.println("MenuItem list :" + menuItemList);

}


	static void testGetAllCartItems() throws CartEmptyException {
        CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
        CartDao cartDao = cartDaoCollectionImpl;
        List<MenuItem> menuItemList = cartDao.getAllCartItem(2);
        System.out.println("MenuItem list :" + menuItemList);
}


	static void testRemoveCartItem() throws CartEmptyException {
        CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
        CartDao cartDao = cartDaoCollectionImpl;
        try {
		cartDao.removeCartItem(2, 4);
		List<MenuItem> menuItemList = cartDao.getAllCartItem(2);
		System.out.println("MenuItem list after removed:" + menuItemList);
		}
		catch(Exception e){
		         throw new CartEmptyException("Cart is empty");
		}


}

    }



