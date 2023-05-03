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

import com.sac.project.dto.FinanceDto;
import com.sac.project.dto.FinanceUserDto;
import com.sac.project.service.FinanceService;
import com.sac.project.util.AppResponse;

import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/finance")
@RestController
public class FinanceController {

    private final FinanceService service;
    
    @CrossOrigin
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewFinanc(@RequestBody FinanceDto dto) {

        final Integer sts = service.createNewFinance(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Report Created Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @CrossOrigin
    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewCustomerInvoice(@RequestBody FinanceUserDto dto) {

        final Integer sts = service.createNewFinance(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice Created Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<FinanceDto>>> allInvoices() {
        List<FinanceDto> invoices = service.all();

        AppResponse<List<FinanceDto>> response = AppResponse.<List<FinanceDto>>builder()
                                                            .sts("success")
                                                            .msg("Invoices")
                                                            .bd(invoices)
                                                            .build();

        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> deleteInvoice(@PathVariable Long id) {

        final Integer sts = service.deleteFinance(id);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
            .sts("success")
            .msg("Invoice Deleted Successfully")
            .bd(sts)
            .build();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<FinanceDto>> getInvoiceById(@PathVariable Long id) {

        final FinanceDto dto = service.fetchFinanceDetails(id);

        final AppResponse<FinanceDto> response = AppResponse.<FinanceDto>builder()
                                                        .sts("success")
                                                        .msg("Invoice Details")
                                                        .bd(dto)
                                                        .build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<FinanceDto>>> allCustomerInvoices(@PathVariable Long id) {
        List<FinanceDto> invoices = service.allUserFInances(id);

        AppResponse<List<FinanceDto>> response = AppResponse.<List<FinanceDto>>builder()
                                                            .sts("success")
                                                            .msg("Customer Invoices")
                                                            .bd(invoices)
                                                            .build();

        return ResponseEntity.ok().body(response);
    }

    @CrossOrigin
    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> updateNewInvoice(@RequestBody FinanceDto dto) {

        final Integer sts = service.updateFinance(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice Updated Successfully")
                                                    .bd(sts)
                                                    .build();

        return ResponseEntity.ok().body(response);
    }
}
