package com.abhijit.assignment1.main;

import com.abhijit.assignment1.dto.AccountDTO;
import com.abhijit.assignment1.service.AccountFileService;
import com.abhijit.assignment1.service.CustomerNameGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.time.LocalDate;

@Service
public class GenerateAccountFileMain {

    @Autowired
    private AccountFileService accountFileService;
    @Autowired
    private CustomerNameGeneratorService customerNameGeneratorService;


    @PostConstruct
    public void createAccountFile() throws IOException {
        accountFileService.generateFile();
        for (int i = 1; i < 100; i++) {
            // name
            String generateName = customerNameGeneratorService.generateName();
            // account id
            String accountId=String.format("%0d", i);
            // account balance

            // create date
            LocalDate now = LocalDate.now();
            AccountDTO accountDTO = new AccountDTO(accountId, generateName, 0.0F, now);
            accountFileService.writeAccount(accountDTO);
        }
    }

}
