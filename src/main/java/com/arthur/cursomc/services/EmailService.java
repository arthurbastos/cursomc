package com.arthur.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.arthur.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
