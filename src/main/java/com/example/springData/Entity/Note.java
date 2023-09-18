package com.example.springData.Entity;
import jakarta.persistence.*;
import lombok.*;


@Data
@Getter
@Setter
@Entity
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String title;
    @Column
    private String content;
}

