package com.TOMSystem.dao;

import java.util.ArrayList;
import java.util.List;
import com.TOMSystem.Item.Item;
import com.TOMSystem.Order.*;


public interface OrderDao {
	public void add(Order order);
	public void edit(Order order);
	public void delete(int order_id);
	public Order getOrder(int order_id);
	public List getAllOrders();
	public int totalPrepTime(ArrayList<Item> order);
	public List<Item> getAllItems(Order order);

}
