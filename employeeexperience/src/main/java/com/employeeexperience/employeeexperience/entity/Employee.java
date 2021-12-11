package com.employeeexperience.employeeexperience.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long employeeId;
    private String name;
    private String email;
    private String designation;


    @Embedded
    private Details details;


}
