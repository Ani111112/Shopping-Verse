package com.example.springmart.controller;

import com.example.springmart.dto.requestDto.CustomerRequestDto;
import com.example.springmart.dto.responseDto.CustomerResponseDto;
import com.example.springmart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    // Add customer
    @PostMapping("/add")
    public ResponseEntity<CustomerResponseDto> addCustomer(@RequestBody CustomerRequestDto customerRequestDto){

        CustomerResponseDto customerResponse = customerService.addCustomer(customerRequestDto);
        return new ResponseEntity<>(customerResponse, HttpStatus.CREATED);
    }

}
