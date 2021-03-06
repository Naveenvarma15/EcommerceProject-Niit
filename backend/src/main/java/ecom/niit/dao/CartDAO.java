package ecom.niit.dao;
import java.util.List;

import ecom.niit.model.Cart;

public interface CartDAO {

	public boolean addCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean updateCart(Cart cart);
	public Cart getCart(int cardId);
	public List <Cart> listCart(String username);
}
