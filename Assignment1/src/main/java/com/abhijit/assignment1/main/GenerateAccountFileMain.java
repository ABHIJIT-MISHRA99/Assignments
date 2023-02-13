package com.abhijit.assignment1.main;

import com.abhijit.assignment1.dto.AccountDTO;
import com.abhijit.assignment1.service.AccountFileService;
import com.abhijit.assignment1.service.CustomerNameGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;

@Service
public class GenerateAccountFileMain {

    @Autowired
    private AccountFileService accountFileService;
    @Autowired
    private CustomerNameGeneratorService customerNameGeneratorService;
    private static final DecimalFormat df=new DecimalFormat("0.00");



    @PostConstruct
    public void createAccountFile() throws IOException {
        accountFileService.generateFile();
        for (int i = 1; i < 100; i++) {
            // name
            String generateName = customerNameGeneratorService.generateName();
            // account id
            String accountId=String.format("%0d", i);
            // account balance
            Random rd=new Random();
            float input=rd.nextFloat();
            float finalNumber= Float.parseFloat(df.format(input));
            // create date
            LocalDate n = LocalDate.now();
            AccountDTO account = new AccountDTO(accountId,generateName,finalNumber,n);
            accountFileService.writeAccount(account);
        }
    }

}
