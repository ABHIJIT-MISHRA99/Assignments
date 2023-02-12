package com.abhijit.assignment1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
/*
responsibility - capture account attributes
 */
@Data
@AllArgsConstructor
public class AccountDTO {

    @NotNull
    private String  accountId;
    @NotNull
    private String customerName;
    @NotNull
    private Float accountBalance;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE,pattern = "yyyy-MM-dd")
    private LocalDate createDate;



}
