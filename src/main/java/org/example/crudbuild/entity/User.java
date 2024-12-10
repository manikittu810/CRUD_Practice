package org.example.crudbuild.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false,unique = true)
    private String email;
    @Column(nullable=false)
    private int itemsCount;
    @Column(nullable=false)
    private String UserAddress;
    @Column(nullable=false)
    private String eventLocation;
    @Column(nullable = false)
    private Date date;
}
