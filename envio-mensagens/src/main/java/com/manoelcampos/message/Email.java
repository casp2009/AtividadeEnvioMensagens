package com.manoelcampos.message;

/**
 * Envia mensagens de email.
 * @author Manoel Campos da Silva Filho & Bruno Pereira de Carvalho
 */
public class Email implements MessageService {
    @Override
    public void send(final String destination, final String msg) throws MessageSendException {
        System.out.printf("Enviando Email para %s: %s%n", destination, msg);
    }
}
