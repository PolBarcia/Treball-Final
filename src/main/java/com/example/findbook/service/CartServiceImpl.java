package com.example.findbook.service;


import com.example.findbook.entities.Cart;
import com.example.findbook.entities.User;
import com.example.findbook.entities.UserModel;
import com.example.findbook.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Qualifier("cartRepository")
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private HttpSession httpSession;

	@Override
	public boolean saveCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public Cart findCart() {
		// TODO Auto-generated method stub

		return ((UserModel) httpSession.getAttribute("userModel")).getCart();
	}

}
