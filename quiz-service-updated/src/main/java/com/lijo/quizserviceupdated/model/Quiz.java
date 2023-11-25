package com.lijo.quizserviceupdated.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String title;

    @ElementCollection
    private List<Integer> questionIds;
}
