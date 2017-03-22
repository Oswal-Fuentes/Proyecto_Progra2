package proyecto_programación_ii;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Correo_E implements Serializable {
    
    private String asunto, cuerpo, bandeja;
    private ArrayList<File> archivos = new ArrayList();
    private Correo destinatario,remitente;
    
    private static final long SerialVersionUID = 777L;
    
    public Correo_E() {
    }

    public Correo_E(String asunto, String cuerpo, String bandeja, Correo destinatario, Correo remitente) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.bandeja = bandeja;
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
    
    public ArrayList<File> getArchivos() {
        return archivos;
    }
    
    public void setArchivos(ArrayList<File> archivos) {
        this.archivos = archivos;
    }
    
    public void setArchivo(File f) {
        archivos.add(f);
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
    
    public String getBandeja() {
        return bandeja;
    }
    
    public void setBandeja(String bandeja) {
        this.bandeja = bandeja;
    }
    
    @Override
    public String toString() {
        return asunto;
    }
}

/*    public void op() {
        0  1  2  3   4    5  6

        arreglo[1][2][5][10][20][50][100]
        //cambio =0
        while (cambio = restante) {
            for (int i = 0; i < 150; i++) {
                if(restante<=100&&pos[100]=tiene dinero){
                 cambio+=100;   
                }else if(restante<=50){
                 cambio+=50;   
                }else if(restante<=20){
                    
                }else if(restante<=10){
                    
                }else if(restante<=5){
                    
                }else if(restante<=2){
                    
                }else if(restante<=1){
                    
                }else{
                    System.out.println("La maquina no tiene el dinero suficiente para dar el cambio");   
                }
            }
        }
    }
}
 */
