package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.bank.Bank;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    private List<Bank> banks = new ArrayList<>(); // In-memory storage

    @PostMapping
    public String saveBank(@RequestBody Bank bank) {
        banks.add(bank); // Add bank to list
        return "Bank information is saved!";
    }

    @GetMapping("/{id}")
    public Bank getBank(@PathVariable Integer id) {
        return banks.stream()
                    .filter(bank -> bank.getId().equals(id))
                    .findFirst()
                    .orElse(null);
    }

    @GetMapping
    public List<Bank> getAllBanks() {
        return banks;
    }
    @DeleteMapping("/{id}")
    public String deleteBank(@PathVariable Integer id) {
        boolean removed = banks.removeIf(bank -> bank.getId().equals(id));
        if (removed) {
            return "Bank with ID " + id + " is deleted!";
        } else {
            return "Bank with ID " + id + " not found!";
        }
    }
}

