package com.guru149.bookmyshow.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateUserDTO {
    @NonNull
    private String username;
    @NonNull
    private String password;

    @NonNull
    private String roleName;
}
