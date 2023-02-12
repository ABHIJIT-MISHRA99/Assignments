package com.abhijit.assignment1.service;

import com.abhijit.assignment1.dto.AccountDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class AccountFileService {

    public void generateFile() throws IOException {
        Path file = Files.createFile(Paths.get("customer_accounts.txt"));
        System.out.println("file:"+file);
    }

    public void writeAccount(AccountDTO accountDTO) {
        // TODO
    }
}
