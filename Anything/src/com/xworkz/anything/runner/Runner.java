package com.xworkz.anything.runner;

import com.xworkz.anything.dto.BookDto;
import com.xworkz.anything.service.BookService;
import com.xworkz.anything.service.BookServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Runner {

        public static void main(String[] args) {
           BookDto bookDto = new BookDto();
            try (FileOutputStream fileOut = new FileOutputStream("bookDto.ser");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

                out.writeObject(bookDto);
                System.out.println("Object has been serialized to student.ser");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

