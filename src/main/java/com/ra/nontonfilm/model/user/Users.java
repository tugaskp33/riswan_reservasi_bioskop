package com.ra.nontonfilm.model.user;

import com.ra.nontonfilm.model.film.Orders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users",
        indexes = @Index(name = "idx_user_email", columnList = "email", unique = true))
public class Users {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "username", length = 30)
    private String username;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "update_at")
    private Date updateAt;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Orders> orders = new ArrayList<>();
}
