package com.manoelcampos.message;

/**
 * Envia mensagens pelo Short Message Service (SMS)
 * @author Manoel Campos da Silva Filho & Bruno Pereira de Carvalho
 */
public class Sms implements MessageService {
    @Override
    public void send(final String destination, final String msg) throws MessageSendException {
        System.out.printf("Enviando msg Sms para %s: %s%n", destination, msg);
    }
}
