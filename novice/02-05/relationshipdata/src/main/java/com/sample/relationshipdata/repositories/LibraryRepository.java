package com.sample.relationshipdata.repositories;

import com.sample.relationshipdata.model.OneToOne.Library;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long>{

    
}
