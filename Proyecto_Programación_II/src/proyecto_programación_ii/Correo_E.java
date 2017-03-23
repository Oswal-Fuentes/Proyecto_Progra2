package proyecto_programación_ii;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Correo_E implements Serializable {

    private String asunto, cuerpo;
    private Correo destinatario, remitente;

    private static final long SerialVersionUID = 777L;

    public Correo_E() {
    }

    public Correo_E(String asunto, String cuerpo, Correo destinatario, Correo remitente) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.destinatario = destinatario;
        this.remitente = remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Correo getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Correo destinatario) {
        this.destinatario = destinatario;
    }

    public Correo getRemitente() {
        return remitente;
    }

    public void setRemitente(Correo remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return asunto;
    }
}
