package com.sample.relationshipdata.repositories;

import com.sample.relationshipdata.model.OneToOne.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{

    
}