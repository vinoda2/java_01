package com.xworkz.anything.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class BookDto {

    private String bookName;
    private String authorName;
    private String publisher;
    private int price;
    private LocalDate publishedDate;

    static{
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }

    public BookDto(){
        System.out.println("Book Dto constructor");
    }

}
