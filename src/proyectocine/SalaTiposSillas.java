/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocine;

/**
 *
 * @author edgar
 */
public class SalaTiposSillas {
    int filas;
    int columnas;
    int sillasGenerales=0;
    int sillasPreferenciales=0;
    int sillasEjecutivas=0;
    char sala[][];
    public void sala(){
        int i;
        sala = new char [filas][columnas];
        for (i=0;i<sillasGenerales;i++){
            for (int j=0;j<columnas;j++){
                sala[i][j]='G';
            }
        }
        for (int g=0;g<sillasPreferenciales;i++){
            for (int j=0;j<columnas;j++){
                sala[i][j]='P';
            }
            i++;
        }
        for (int g=0;g<sillasEjecutivas;g++){
            for (int j=0;j<columnas;j++){
                    sala[i][j]='E';
                }
            }
        for (int h=0;h<filas;h++){
            for (int j=0;j<columnas;j++){
                System.out.println(sala[i][j]);
            }
            System.out.println("");
        }
        }
    private void generarSillasGenerales(){
        sala = new char [filas][columnas];
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    public void setSillasGenerales(int sillasGenerales) {
        this.sillasGenerales = sillasGenerales;
    }
    public void setSillasPreferenciales(int sillasPreferenciales) {
        this.sillasPreferenciales = sillasPreferenciales;
    }

    public void setSillasEjecutivas(int sillasEjecutivas) {
        this.sillasEjecutivas = sillasEjecutivas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getSillasGenerales() {
        return sillasGenerales;
    }

    public int getSillasPreferenciales() {
        return sillasPreferenciales;
    }

    public int getSillasEjecutivas() {
        return sillasEjecutivas;
    }
    
}
