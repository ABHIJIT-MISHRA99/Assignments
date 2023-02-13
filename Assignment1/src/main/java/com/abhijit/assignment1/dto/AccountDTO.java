package com.abhijit.assignment1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/*
responsibility - capture account attributes
 */
@Data
@AllArgsConstructor
public class AccountDTO {

    @NonNull
    private String accountId;
    @NonNull
    private String customerName;
    @NonNull
    private Float accountBalance;
    @NonNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;


}
