package com.example.findbook.repository;


import com.example.findbook.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	Address findAddressByBilling(boolean billing);

}
