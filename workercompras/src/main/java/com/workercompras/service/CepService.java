package com.workercompras.service;

import com.workercompras.model.Endereco;
import com.workercompras.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private CepRepository repository;

    public void buscaCep(String cep){
      Endereco endereco = repository.buscarPorCep(cep);
      System.out.println(endereco);
    }
}
