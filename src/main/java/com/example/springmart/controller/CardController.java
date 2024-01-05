package com.example.springmart.controller;

import com.example.springmart.dto.requestDto.CardRequestDto;
import com.example.springmart.dto.responseDto.CardResponseDto;
import com.example.springmart.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;


    //Add card
    @PostMapping("/add")
    public ResponseEntity<CardResponseDto> addCard(@RequestBody CardRequestDto cardRequestDto){
        try {
            CardResponseDto cardResponseDto = cardService.addCard(cardRequestDto);
            return new ResponseEntity<>(cardResponseDto, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
