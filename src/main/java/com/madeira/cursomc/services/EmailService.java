package com.madeira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.madeira.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
