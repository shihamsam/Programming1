package com.hallam;

import com.util.DateUtil;

public class Main {

    // Format Code Shortcut     Ctrl + Alt + L
    // Settings menu            Ctrl + Alt + S
    public static void main(String[] args) {

        Employee shiham = new Employee();
        shiham.setName("Shiham Samsudeen");
        String name = shiham.getName();

        System.out.print("My Name is: " + name);


    }
}
