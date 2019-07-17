package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

    @Autowired
    private CompanyRepository companyRepository;


    @GetMapping(produces = {"application/json"})
    public ResponseEntity list() {
        List<Company> companies = companyRepository.findAll();
        return ResponseEntity.ok().body(companies);
    }
    
    @PostMapping(produces = {"application/json"})
    public ResponseEntity add(@RequestBody Company company) {
        Company companySaved = companyRepository.saveAndFlush(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(companySaved);
    }
}
