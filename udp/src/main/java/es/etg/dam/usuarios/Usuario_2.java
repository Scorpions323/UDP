package es.etg.dam.usuarios;

import java.net.DatagramSocket;
import java.net.InetAddress;

import es.etg.dam.mensajes.Enviar;
import es.etg.dam.mensajes.Recibir;

public class Usuario_2 {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(Usuario_1.PUERTO_ENVIO);
        InetAddress destino = InetAddress.getByName(Usuario_1.HOST);

        Recibir recibir = new Recibir(socket, Usuario_1.MENSAJE_PROMPT);
        Enviar enviar = new Enviar(socket, destino, Usuario_1.PUERTO_ESCUCHA, Usuario_1.MENSAJE_PROMPT);
        recibir.start();
        enviar.start();
    }
}