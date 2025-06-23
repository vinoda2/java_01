package com.xworkz.anything.service;

import com.xworkz.anything.dto.BookDto;
import com.xworkz.anything.exception.LengthCheckException;

public class BookServiceImpl implements BookService{
    @Override
    public boolean validate(BookDto bookDto) {
        if(bookDto!=null){
            //validation
            try{
                if(bookDto.getBookName().length()<2){
                    throw  new LengthCheckException("Name length is <2");
                } else if (bookDto.getBookName()==null) {
                    throw new NullPointerException("Name is Null");
                }
            }catch (LengthCheckException exception){
                System.out.println(exception.getMessage());
            }
        }
        return false;
    }
}
