package com.truYum.Dao;

import java.util.*;

import com.truYum.model.MenuItem;
import com.truYum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao{
	static List<MenuItem> menuItemList;
	/*public static void main(String[] args)
	{
		testGetMenuItemlistAdmin(); 
	}*/
	
	public MenuItemDaoCollectionImpl()
	{
		if(menuItemList==null){
			try{
		menuItemList=new ArrayList<MenuItem>();
		menuItemList.add(new MenuItem(1,"sandwich",99.00f,true,DateUtil.convertTodate("15/03/2017"),"Main Course",true));
		menuItemList.add(new MenuItem(2,"Burger",129.00f,true,DateUtil.convertTodate("23/12/2017"),"Main Course",false));
		menuItemList.add(new MenuItem(3,"Pizza",149.00f,true,DateUtil.convertTodate("21/08/2018"),"Main Course",false));
		menuItemList.add(new MenuItem(4,"French Fries",57.00f,false,DateUtil.convertTodate("02/07/2017"),"Starters",true));
		menuItemList.add(new MenuItem(5,"Chocolate Brownie",32.00f,true,DateUtil.convertTodate("02/11/2022"),"Dessert",true));
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		List<MenuItem> mpl=new ArrayList<MenuItem>();
		Date today=new Date();
		for(MenuItem menuItem:menuItemList){
		if(menuItem.getDateOfLaunch().getTime()<=today.getTime()&&menuItem.isActive())
		{
			mpl.add(menuItem);
		}
		}
		return mpl;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		for(MenuItem menu_item_modify:menuItemList)
        {
              if(menuItem.getId()==menu_item_modify.getId())
              {
                    menu_item_modify.setName(menuItem.getName());
                    menu_item_modify.setCategory(menuItem.getCategory());
                    menu_item_modify.setDateOfLaunch(menuItem.getDateOfLaunch());
                    menu_item_modify.setPrice(menuItem.getPrice());
                    menu_item_modify.setActive(menuItem.isActive());
                    menu_item_modify.setFreeDelivery(menuItem.isFreeDelivery());
               
              }
        }

		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
			for(MenuItem menu_item : menuItemList)
								{
									if(menuItemId==menu_item.getId())
									{
										return menu_item;
									}
								} 
			 

		return null;
	}
	/*static void testGetMenuItemlistAdmin()
	{
		MenuItemDaoCollectionImpl mp=new MenuItemDaoCollectionImpl();
		System.out.println("Menu Item List "+mp.getMenuItemListAdmin());
		List<MenuItem> menuItems=mp.getMenuItemListAdmin();
		for(MenuItem menuItem: menuItems)
		{
			System.out.println(menuItem.toString());
		}
	}*/

}
