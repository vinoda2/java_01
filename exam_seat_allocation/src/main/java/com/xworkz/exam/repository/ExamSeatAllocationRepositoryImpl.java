package com.xworkz.exam.repository;

import com.xworkz.exam.dto.ExamSeatAllocationDto;

public class ExamSeatAllocationRepositoryImpl implements ExamSeatAllocationRepository{
    @Override
    public boolean onSave(ExamSeatAllocationDto dto) {

        // database connection
        //load the drivers
        //get the connection from the database
        //

        System.out.println("invoking the on save() from repo");
        return false;
    }
}
