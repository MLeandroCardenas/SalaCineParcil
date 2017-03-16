
package proyectocine;

public class Cliente {
    private String cliente;
    private byte edad;
    private String genero;

    public Cliente(String cliente, byte edad, String genero) {
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

    public byte getEdad() {
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

