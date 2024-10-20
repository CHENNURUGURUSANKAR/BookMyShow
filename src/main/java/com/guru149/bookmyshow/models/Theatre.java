package com.guru149.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Theatre extends BaseModel {
    @OneToMany
    private List<Screen> screens = new ArrayList<>();
    private String name;
    private String address;
    private Long cityId;

}
