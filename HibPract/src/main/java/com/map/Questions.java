package com.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Questions {
    @Id
    @Column(name = "question_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int questionId;
    @Column(name = "questions")
    private String quesString;
    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
}
