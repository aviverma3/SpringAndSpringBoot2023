package com.tut;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable
public class Certificate
{
    private String course;
    private String duration;
}
