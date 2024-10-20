package com.guru149.bookmyshow.models;

import com.guru149.bookmyshow.enums.Genre;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie extends BaseModel {
    private String name;
    @ElementCollection
    @Enumerated
    private List<String> languages = new ArrayList<>();
    private Float rating;
    @ElementCollection
    @Enumerated
    private List<Genre> genres;

}
