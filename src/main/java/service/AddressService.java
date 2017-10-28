package service;

import java.util.List;

import model.Address;

public interface AddressService {
	public void addAddress(Address address);
	public void updateAddress(Address address);
	public List<Address> listAddresses();
	public Address getAddress(int addressId);
	public void deleteAddress(Address address);
}