package com.employeeexperience.employeeexperience.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Details {

    private String company;
    private int experience;
}
