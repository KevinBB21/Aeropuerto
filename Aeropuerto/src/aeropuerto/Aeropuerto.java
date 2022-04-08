/*
 * Proyecto Aeropuerto - Archivo Aeropuerto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package aeropuerto;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 8 abr. 2022 15:58:26
 */
public class Aeropuerto {

    private int id;
    private int nvuelo;
    private String Companyia;
    private String destino;
    private String hora;
    private int num_pas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNvuelo() {
        return nvuelo;
    }

    public void setNvuelo(int nvuelo) {
        this.nvuelo = nvuelo;
    }

    public String getCompanyia() {
        return Companyia;
    }

    public void setCompanyia(String Companyia) {
        this.Companyia = Companyia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNum_pas() {
        return num_pas;
    }

    public void setNum_pas(int num_pas) {
        this.num_pas = num_pas;
    }

    public int getMax_pas() {
        return max_pas;
    }

    public void setMax_pas(int max_pas) {
        this.max_pas = max_pas;
    }
    private int max_pas;

    public Aeropuerto(int id, int nvuelo, String Companyia, String destino, String hora, int num_pas, int max_pas) {
        this.id = id;
        this.nvuelo = nvuelo;
        this.Companyia = Companyia;
        this.destino = destino;
        this.hora = hora;
        this.num_pas = num_pas;
        this.max_pas = max_pas;
    }

 
    
  

}
