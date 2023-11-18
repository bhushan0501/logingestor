package com.ingestor.logingestor.Controllers;

import com.ingestor.logingestor.Dto.Data;

import com.ingestor.logingestor.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PostController {
    private DataService dataService;
    @Autowired
    public PostController(DataService dataService) {
        this.dataService = dataService;
    }
    @PostMapping
    public ResponseEntity<Data> createData(@RequestBody Data data){
        Data savedData = dataService.createData(data);
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }


}