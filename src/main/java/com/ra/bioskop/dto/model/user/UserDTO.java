package com.ra.bioskop.dto.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String username;
    private String email;
    private String password;
    private Date createdAt;
}