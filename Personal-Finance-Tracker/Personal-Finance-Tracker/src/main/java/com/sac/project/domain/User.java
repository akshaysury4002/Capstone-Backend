package com.sac.project.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
 
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="User")
public class User {
 
    @Id
    @Column(name="User_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
 
    @Column(name="User_name", length = 255)
    private String username;
 
    @Column(name="email", length = 255)
    private String email;
 
    @Column(name="password", length = 255)
    private String password;
 
 
}
