
package proyectocine;
import java.util.Scanner;

public class menuDatos {
    Scanner teclado = new Scanner(System.in);
    private short [][]sala;
    private short filas;
    private short columnas;
    private short sillasEjecutivas;
    private short sillasGenerales;
    private short sillasPreferenciales;

    public menuDatos() {
        solicitarDatos();
        registrarClientes();
    }
    
    private void solicitarDatos(){
        System.out.println("\t Bienvenido al cine \t");
        definirSala();
    }
    
     private void definirSala(){
        System.out.println("Digite el numero de filas de la sala: ");
        filas = teclado.nextShort();
        System.out.println("Digite el numero de columnas de la sala: ");
        columnas = teclado.nextShort();
        
        short [][]sala = new short [filas][columnas];
        
         System.out.println("...SALA DE CINE VACIA...");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(sala[i][j]);
            }
            System.out.print("\n");
        }
        
         System.out.println("¿Cuantas filas desea general?");
         sillasGenerales = teclado.nextShort();
            if(sillasGenerales == filas){
                System.out.println("TODA LA SALA SE ASIGNO CON SILLAS GENERALES");
            }
            else if(sillasGenerales < filas){
                System.out.println("¿Cuantas filas desea ejecutivas?");
                sillasEjecutivas = teclado.nextShort();
                
                if(sillasGenerales + sillasEjecutivas == filas){
                    System.out.println("Generales: "+sillasGenerales+"\nEjecutivas: "+sillasEjecutivas);
                }
                
                if(sillasEjecutivas + sillasGenerales < filas){
                    System.out.println("¿Cuantas filas preferenciales desea?");
                    sillasPreferenciales = teclado.nextShort();
                }
            
                if(sillasGenerales + sillasEjecutivas + sillasPreferenciales == filas){
                    System.out.println("generales: "+sillasGenerales+"\nEjecutivas: "+sillasEjecutivas+"\nPreferenciales: "+sillasPreferenciales);
        }
            }
   }
     
     private void registrarClientes(){
         
         while(true){
         System.out.println("\n REGISTRO DE CLIENTES \n");
         Pelicula pelicula = new Pelicula();
         pelicula.recojeDatos();
         
             System.out.println("1.REGISTRAR CLIENTES\n 2.SALIR");
              byte opcion = teclado.nextByte();
         if(opcion==1){
             System.out.println("Nombre:");
             String nombrePersona = teclado.nextLine();
             
             System.out.println("Edad: ");
             byte edadPersona = teclado.nextByte();
             System.out.println("Genero: ");
             String generoPersona = teclado.next();
             
             Cliente persona = new Cliente(nombrePersona, edadPersona, generoPersona);
      }
         if(opcion==2){
             break;
         }
    }
  }
}


