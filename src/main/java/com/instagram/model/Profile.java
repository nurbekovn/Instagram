package com.instagram.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "profiles")
@Getter@Setter
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nickName;
    private String description;
    private boolean status;
    private boolean isActive;
    @CreatedDate
    private LocalDateTime created;

}
