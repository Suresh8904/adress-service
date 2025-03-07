package uk.lset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.lset.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

}
