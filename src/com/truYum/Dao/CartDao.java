package com.truYum.Dao;

import java.util.List;

import com.truYum.model.MenuItem;
public interface CartDao 
{	
	 void addCartItem(long userId,long menuItemId);
	 List<MenuItem> getAllCartItem(long userId) throws CartEmptyException;
	 void removeCartItem(long userId,long menuItemId);
} 
