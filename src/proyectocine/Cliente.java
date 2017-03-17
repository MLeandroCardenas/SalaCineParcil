
package proyectocine;

public class Cliente {
    private String cliente;
    private int edad;
    private String genero;
    private byte ubicacion[][];
    private byte tipoSilla;
    private int taquilla=5000;
    public Cliente(String cliente, int edad, String genero) {
        this.cliente = cliente;
        this.edad = edad;
        this.genero = genero;
    }
    public void determinarPago(){
        if ((edad<18)&&(edad>0)){
            System.out.println("USTED TIENE UN DESCUENTO DE 2000 PESOS");
            taquilla-=2000;
        }
        if (tipoSilla==2){
            taquilla+=1500;
        }
        if (tipoSilla==3){
            taquilla+=3000;
        }
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

