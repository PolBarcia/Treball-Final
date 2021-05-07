package com.example.findbook.service;


import com.example.findbook.entities.Address;

public interface AddressService {

	boolean saveAddress(Address address);
	Address findAddressByBilling(boolean billing);

}
