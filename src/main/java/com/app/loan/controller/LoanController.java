package com.app.loan.controller;

import com.app.loan.model.Client;
import com.app.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/register")
    public ResponseEntity<?> save(@RequestBody Client client){
        return new ResponseEntity<>(loanService.checkClient(client), HttpStatus.CREATED);
    }
}
