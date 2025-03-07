package uk.lset.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.model.Address;
import uk.lset.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
    private AddressRepository addressRepository;
	
	public Address getAddressById(String id) {
		return addressRepository.findById(id).orElse(null);
		
	}
	
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
}
