package com.workercompras.repository;

import com.workercompras.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "${viacep}",fallback = HystrixClientFallback.class)
public interface CepRepository {

    @GetMapping("/{cep}/json/")
    Endereco buscarPorCep(@PathVariable("cep") String cep);
}
