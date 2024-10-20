package com.guru149.bookmyshow.models;

import com.guru149.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

@Getter
@Entity
public class Seat extends BaseModel {

    private Integer seatNumber;
    @Enumerated
    private SeatType seatType;
    private Double prices;

}
