package com.atm.ATM.AccountController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    public double currentBalance = 0.00;

    @GetMapping("/balance")
    public int balance() {
        return (int) currentBalance;
    }

    @PostMapping("/deposit")
    public String deposit(@RequestBody AmountRequest amountRequest) {
        currentBalance += amountRequest.getAmount();
        return "Success";
    }

        @PostMapping("/withdraw")
        public String withdraw(@RequestBody AmountRequest amountRequest) {
            currentBalance -= amountRequest.getAmount();
            return "Success";
        }
    }


