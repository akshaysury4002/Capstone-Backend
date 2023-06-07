// package com.sac.project.controller;

// import org.apache.tomcat.util.http.parser.MediaType;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestAttribute;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.sac.project.dto.LinkedAccountsUserDto;
// import com.sac.project.service.LinkedAccountsService;
// import com.sac.project.util.AppResponse;

// @RequestMapping(value = "/accounts")
// @RestController
// public class LinkedAccountsController{

//     private final LinkedAccountsService  service;

//     @CrossOrigin
//     @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
//     public ResponseEntity<AppResponse<Integer>> createNewAccount(@RequestBody LinkedAccountsUserDto dto){
//         final Integer sts =  service.createNewAccount(dto);

//         final AppResponse<Integer> response = AppResponse.<Integer>builder()
//         .sts("success")
//         .msg("finance added Successfully")
//         .bd(sts)
//         .build();
//         return ResponseEntity.status(HttpStatus.CREATED).body(response);
//     }



// }