package uk.lset.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.model.Address;
import uk.lset.request.AddressRequest;
import uk.lset.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	@GetMapping("/{id}")
	public Address getForID(@PathVariable("id") String id)  {
		return addressService.getAddressById(id);
	}
	
	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json") 
	public Address createAddress(@RequestBody AddressRequest addressRequest) {
		Address address = new Address();
		address.setCity(addressRequest.getCity());
		address.setCountry(addressRequest.getCountry());
		address.setAddress(addressRequest.getAddress());
		return addressService.saveAddress(address);
	}
	
	@PutMapping(path = "/update", consumes = "application/json", produces = "application/json") 
	public Address updateAddress(@RequestBody AddressRequest addressRequest) {
		Address address = null;
		Address existingAddress = addressService.getAddressById(addressRequest.getId());
		if (existingAddress != null) {
			existingAddress.setCity(addressRequest.getCity());
			existingAddress.setCountry(addressRequest.getCountry());
			existingAddress.setAddress(addressRequest.getAddress());
		address =  addressService.saveAddress(existingAddress);
		}
		return address;
	}
	
	
}
