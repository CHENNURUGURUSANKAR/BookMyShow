package com.guru149.bookmyshow.models;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class Coupon extends BaseModel {
    private String code;
    private double discount;
    private LocalDateTime expiryDate;
}
