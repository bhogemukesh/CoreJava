package com.mukesh.corejava.streams;

import lombok.Builder;
import lombok.Data;

/**
 * @author Mukesh Bhoge
 **/
@Builder
@Data
public class Employee {

    private String firstname;
    private String lastname;
    private String department;
    private boolean isActive;
    private int salary;

}
