package com.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Questions {
    @Id
    @Column(name = "question_id")
    private  int questionId;
    @Column
    private String quesString;
    @Column
    private Answer answer;
}
