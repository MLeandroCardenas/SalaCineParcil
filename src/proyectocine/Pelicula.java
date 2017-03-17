
package proyectocine;

public class Pelicula {
    private String nombrePelicula;
    private String generoPelicula;
    private String sinopsis;
    private String duracion;
    static final short  Menores = 5000;
    static final short Mayores = 8000; 

    public Pelicula(String nombrePelicula, String generoPelicula, String duracion, String sinopsis) {
        this.nombrePelicula = nombrePelicula;
        this.generoPelicula = generoPelicula;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
    }
    
    public Pelicula(){
        
    }
    
    public void recojeDatos(){
        Pelicula();
        genero();
        sinopsis();
        duracion();
    }
    
     private String Pelicula(){
        return "MI VILLANO FAVORITO 2";
    }
     
     private String genero(){
         return "COMEDIA";
     }
     
     private String sinopsis(){
         return "Un vehículo misterioso usando un enorme imán roba un mutágeno muy"
                 + "potente conocido como PX-41 de un"
                 + " laboratorio secreto en el Círculo Polar Ártico. "
                 + "La Liga Anti-Villanos (LAV) intenta reclutar al ex supervillano,"
                 + " Gru, para encontrar quien robó el mutágeno. Para eso, "
                 + "la agente de la LAV Lucy Wilde va en busca de él y se lo lleva a la fuerza, "
                 + "pero en la sede de la LAV, "
                 + "Gru se niega, alegando que él es un hombre de negocios "
                 + "legítimo ahora, así como el padre de Margo, Edith y Agnes.";
     }
     
     private String duracion(){
         return "120 MINUTOS... 2 HORAS";
     }
     
}




