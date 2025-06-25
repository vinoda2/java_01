package com.xworkz.exam.service;

import com.xworkz.exam.dto.ExamSeatAllocationDto;

public interface ExamSeatAllocationService {

    boolean validateData(ExamSeatAllocationDto dto);
}
