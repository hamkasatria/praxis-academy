package com.sample.relationshipdata.controller;

import com.sample.relationshipdata.repositories.AddressRepository;
import com.sample.relationshipdata.repositories.LibraryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/trial")
public class MainController {
    @Autowired
    private AddressRepository addressrepository;

    @Autowired
    private LibraryRepository libraryRepository;

    


}
