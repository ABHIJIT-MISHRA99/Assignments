package com.abhijit.Assignment1.dto;

import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Data
public class AccountDTO {
    @NotNull
    private String accountID;
    @NotNull
    private String accountname;
    @NotNull
    private Float accountBalance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE,pattern = "yyyy-MM-dd")
    private LocalDate createDate;


}
