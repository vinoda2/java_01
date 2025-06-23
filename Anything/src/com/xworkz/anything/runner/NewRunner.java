package com.xworkz.anything.runner;

import com.xworkz.anything.dto.BookDto;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NewRunner {

    public static void main(String[] args) {
        // try -with -resource
        Random random = new Random();
        System.out.println(random.nextInt(10,20));

    }
}
