package com.xworkz.exam.service;

import com.xworkz.exam.dto.ExamSeatAllocationDto;
import com.xworkz.exam.repository.ExamSeatAllocationRepository;
import com.xworkz.exam.repository.ExamSeatAllocationRepositoryImpl;

public class ExamSeatAllocationServiceImpl implements ExamSeatAllocationService{

    //create a object for repo
    ExamSeatAllocationRepository repository= new ExamSeatAllocationRepositoryImpl();
    @Override
    public boolean validateData(ExamSeatAllocationDto dto) {
        System.out.println("validate method is invoking");

        //validate the dto
        if(dto!=null){
            System.out.println("dto is not null we can save to database");
            repository.onSave(dto);
            return true;
        }
        return false;
    }
}
