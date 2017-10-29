package com.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.AddressDao;
import com.spring.model.Address;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;
	
	@Override
	@Transactional
	public void addAddress(Address address) {
		addressDao.addAddress(address);
	}

	@Override
	@Transactional
	public void updateAddress(Address address) {
		addressDao.updateAddress(address);
	}
	
	@Override
	@Transactional
	public List<Address> listAddresses() {
		return addressDao.listAddresses();
	}

	@Override
	@Transactional
	public Address getAddress(int addressId) {
		return addressDao.getAddress(addressId);
	}
	
	@Override
	@Transactional
	public void deleteAddress(int addressId) {
		addressDao.deleteAddress(addressId);
	}
}
