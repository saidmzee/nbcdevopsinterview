package com.example.nbcdevopsspecialist.controllers;

import com.example.nbcdevopsspecialist.data.dao.TransferRepository;
import com.example.nbcdevopsspecialist.data.request.TransferRequest;
import com.example.nbcdevopsspecialist.data.resposne.TransferResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/webservice/api/v1")
public class TransfersController {

    private final TransferRepository transferRepository;

    public TransfersController(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }


    @PostMapping("/transfers")
    public ResponseEntity<TransferResponse> createTransfer(@RequestBody TransferRequest request) {

        System.out.println("check logs" + request);

        if (isValidTransfer(request)) {
            TransferRequest savedTransfer = transferRepository.save(request);
            TransferResponse response = new TransferResponse("500", "Success");
            return ResponseEntity.ok(response);
        } else {
            TransferResponse response = new TransferResponse("506", "Failure");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    private boolean isValidTransfer(TransferRequest request) {

        return request.getFullName() != null &&
                request.getAmount() != null &&
                request.getAccountNumber() != null &&
                request.getReferenceNumber() != null;
    }

}
