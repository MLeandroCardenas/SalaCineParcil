
package proyectocine;

public class Cliente {
    private String cliente;
    private int edad;
    private String genero;
    private byte ubicacion[][];
    private byte tipoSilla;

    public Cliente(String cliente, int edad, String genero) {
        this.cliente = cliente;
        this.edad = edad;
        this.genero = genero;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

