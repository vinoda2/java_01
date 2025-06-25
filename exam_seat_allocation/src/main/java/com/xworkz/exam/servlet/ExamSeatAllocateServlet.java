package com.xworkz.exam.servlet;

import com.xworkz.exam.dto.ExamSeatAllocationDto;
import com.xworkz.exam.service.ExamSeatAllocationService;
import com.xworkz.exam.service.ExamSeatAllocationServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/allocate")
public class ExamSeatAllocateServlet extends HttpServlet {


    // write the doPost() method
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // create a instance of DTO
        ExamSeatAllocationDto seatAllocationDto =   new ExamSeatAllocationDto();
        //retrive the values from request and set to dto
     String name =  request.getParameter("name");
     String usn = request.getParameter("usn");
     String subject = request.getParameter("subject");
     String roomNumber = request.getParameter("roomnumber");
     String seatNumber = request.getParameter("seatnumber");

        seatAllocationDto.setName(name);
        seatAllocationDto.setSubject(subject);
        seatAllocationDto.setUsn(usn);
        seatAllocationDto.setRoomNumber(Integer.parseInt(roomNumber));
        seatAllocationDto.setSeatNumber(Integer.parseInt(seatNumber));
        seatAllocationDto.setCreatedBy("your name");
        seatAllocationDto.setCreatedOn(LocalDateTime.now());

        //display the dto
        System.out.println(seatAllocationDto);
        //create a instance of service
        ExamSeatAllocationService service = new ExamSeatAllocationServiceImpl();
        service.validateData(seatAllocationDto);

        request.setAttribute("h","hello");
        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
        dispatcher.forward(request,response);

    }
}
