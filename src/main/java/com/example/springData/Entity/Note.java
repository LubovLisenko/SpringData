package com.example.springData.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Data
@Getter
@Setter
@Entity
public class Note {
    @Id
    private long id;
    private String title;
    private String content;
}

