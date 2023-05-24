package com.sac.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sac.project.dto.BudgetDto;
import com.sac.project.dto.BudgetUserDto;
import com.sac.project.service.BudgetService;
import com.sac.project.util.AppResponse;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RequestMapping(value = "/budget")
@RestController
public class BudgetController {
    
    private final BudgetService service;
    
    @CrossOrigin
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewSavings( @RequestBody BudgetDto dto) {

        final Integer sts = service.createNewBudget(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("budget added Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @CrossOrigin
    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewUSerBudget( @RequestBody BudgetUserDto dto) {

        final Integer sts = service.createNewBudget(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Budget added Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @CrossOrigin
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<BudgetDto>>> allBudgets() {
        List<BudgetDto> finances = service.all();

        AppResponse<List<BudgetDto>> response = AppResponse.<List<BudgetDto>>builder()
                                                            .sts("success")
                                                            .msg("this ones working")
                                                            .bd(finances)
                                                            .build();

        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> deleteBudget(@PathVariable Long id) {

        final Integer sts = service.deleteBudget(id);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
            .sts("success")
            .msg("Budget Deleted Successfully")
            .bd(sts)
            .build();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<BudgetDto>> getSavingsById(@PathVariable Long id) {

        final BudgetDto dto = service.fetchBudgetDetails(id);

        final AppResponse<BudgetDto> response = AppResponse.<BudgetDto>builder()
                                                        .sts("success")
                                                        .msg("Budget Details")
                                                        .bd(dto)
                                                        .build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<BudgetDto>>> allUserSavings(@PathVariable Long id) {
        List<BudgetDto> savings = service.allUserBudget(id);

        AppResponse<List<BudgetDto>> response = AppResponse.<List<BudgetDto>>builder()
                                                            .sts("success")
                                                            .msg("Users Budget")
                                                            .bd(savings)
                                                            .build();

        return ResponseEntity.ok().body(response);
    }

    @CrossOrigin
    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> updateNewSavings( @RequestBody BudgetDto dto) {

        final Integer sts = service.updateBudget(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Budget Updated Successfully")
                                                    .bd(sts)
                                                    .build();

        return ResponseEntity.ok().body(response);
    }
}
