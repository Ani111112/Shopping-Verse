package com.example.springmart.dto.requestDto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemRequestDto {

    String customerEmail;

    int productId;

    int requiredQuantity;
}
