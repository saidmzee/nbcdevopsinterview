package com.example.nbcdevopsspecialist.data.dao;

import com.example.nbcdevopsspecialist.data.request.TransferRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferRequest,Long> {
}
