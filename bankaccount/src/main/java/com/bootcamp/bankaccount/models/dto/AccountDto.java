package com.bootcamp.bankaccount.models.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {

    @Id
    private String id;

    private String accountNumber;

    private double balance;

    private String currency;

    private String accountType;

    private String canBeDeposit;

    private LocalDateTime operationDate = LocalDateTime.now();

    private ClientCommand client;

    private int movementPerMonth;

    private int maxLimitMovementPerMonth;

    private String clientIdNumber;

    private Double minimumOpeningAmount;

    private Double minimumDailyAverageAmountEachMonth;

    private int maxLimitTransaction;

}
