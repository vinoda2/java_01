package com.xworkz.exam.repository;

import com.xworkz.exam.dto.ExamSeatAllocationDto;

public interface ExamSeatAllocationRepository {
    boolean onSave(ExamSeatAllocationDto dto);
}
