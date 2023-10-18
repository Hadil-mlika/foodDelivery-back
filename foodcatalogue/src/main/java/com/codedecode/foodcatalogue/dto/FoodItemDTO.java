package com.codedecode.foodcatalogue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDTO {


    private int id ;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Number price ;

    private Integer restaurantId ;
    private Integer quantity;
}
