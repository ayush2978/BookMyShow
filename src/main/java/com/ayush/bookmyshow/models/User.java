package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name;
    private String userName;
    private String password;
    private String emailAddress;
    private String phoneNumber;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Role> roles;
}
