package com.workercompras.repository;

import com.workercompras.model.Endereco;
import lombok.SneakyThrows;

public class HystrixClientFallback implements CepRepository {
    @SneakyThrows
    @Override
    public Endereco buscarPorCep(String cep)  {
        throw new Exception("cep não encontrado");
    }
}
