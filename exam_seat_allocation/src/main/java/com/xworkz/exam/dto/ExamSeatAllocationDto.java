package com.xworkz.exam.dto;

import lombok.*;

import java.time.LocalDateTime;


@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExamSeatAllocationDto {


    //decalre the properrties
    private String name;
    private String usn;
    private String subject;
    private int roomNumber;
    private int seatNumber;

    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime updatedOn;
    private String updatedBy;

}
