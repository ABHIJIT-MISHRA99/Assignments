package com.abhijit.Assignment1.service;

import com.abhijit.Assignment1.dto.AccountDTO;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveAccount {

        public static void main(String[] args)
        {
            // Creating an instance of file
            Path path
                    = Paths.get("out.txt");

            // Custom string as an input
            String str
                    = "Geeks for Geeks \nWelcome to computer science portal \nHello Geek!";


            byte[] arr = str.getBytes();

            try {

                Files.write(path, arr);
            }
            catch (IOException ex) {
                System.out.print("Invalid Path");
            }
        }

}
