package com.example.client.service;

import com.example.client.model.Cheque;
import com.example.client.repository.ChequeRepository;
import org.springframework.stereotype.Service;

@Service
public class ChequeRestService extends CRUDRestService<Cheque, ChequeRepository> implements IChequeService{
}
