package com.desenvcarlos.desenvback.services;

import org.springframework.mail.SimpleMailMessage;

import com.desenvcarlos.desenvback.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
