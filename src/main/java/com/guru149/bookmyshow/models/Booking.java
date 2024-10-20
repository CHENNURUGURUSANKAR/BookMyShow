package com.guru149.bookmyshow.models;

import com.guru149.bookmyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking extends BaseModel{
   @ManyToOne
    private User user;
   @ManyToOne
    private Show show;
   @ManyToMany
    private List<ShowSeat> seats=new ArrayList<>();
    private double price;
    private Date bookedAt;

    @Enumerated

    private BookingStatus status;
    @OneToMany
    private List<Payment> payments=new ArrayList<>();
}
