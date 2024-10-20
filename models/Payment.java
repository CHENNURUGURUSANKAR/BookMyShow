package com.guru149.bookmyshow.models;

import com.guru149.bookmyshow.enums.PaymentType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment  extends BaseModel{
    private PaymentType paymentType;
    private double amount;
}
