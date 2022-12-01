package com.workercompras.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void notificarCliente(String email){
        var msg = new SimpleMailMessage();
        msg.setTo(email);
        msg.setSubject("Compra recebida");
        msg.setText("Este é um e-mail de confirmação de compra recebida. " +
                "Agora vamos aprovar sua compra e brevemente você receberá um novo e-mail de confirmação." +
                "\nObrigado por comprar com a gente!!");
        javaMailSender.send(msg);
        log.info("Cliente notificado com sucesso!!");

    }
}
