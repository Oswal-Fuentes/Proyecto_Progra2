package proyecto_programación_ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class admin_Conexion implements Runnable {

    JTextArea bitacora;
    JTextField texto;
    BufferedReader entrada;
    PrintStream salida;
    Socket socket;

    public admin_Conexion() {
    }

    public admin_Conexion(JTextArea bitacora, JTextField texto, String IP, int puerto) throws IOException {
        try {
            this.bitacora = bitacora;
            this.texto = texto;
        } catch (Exception e) {
        }
        socket = new Socket(IP, puerto);
        entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        salida = new PrintStream(socket.getOutputStream());
    }

    public void run() {
        try {
            while (true) {
                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                salida = new PrintStream(socket.getOutputStream());
                Date date = new Date();
                SimpleDateFormat f = new SimpleDateFormat("HH:MM:SS");
                bitacora.append(f.format(date) + " " + entrada.readLine() + "\n");
            }
        } catch (Exception e) {
        }
    }
}
