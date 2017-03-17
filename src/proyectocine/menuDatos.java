
package proyectocine;
import java.util.Scanner;

public class menuDatos {
    SalaTiposSillas silla1 = new SalaTiposSillas();
    Scanner teclado = new Scanner(System.in);
    private short [][]sala;
    Cliente vector[];
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
        silla1.setFilas(filas);
        System.out.println("Digite el numero de columnas de la sala: ");
        columnas = teclado.nextShort();
        silla1.setColumnas(columnas);
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
         silla1.setSillasGenerales(sillasGenerales);
            if(sillasGenerales == filas){
                System.out.println("TODA LA SALA SE ASIGNO CON SILLAS GENERALES");
            }
            else if(sillasGenerales < filas){
                System.out.println("¿Cuantas filas desea ejecutivas?");
                sillasEjecutivas = teclado.nextShort();
                silla1.setSillasEjecutivas(sillasEjecutivas);
                
                if(sillasGenerales + sillasEjecutivas == filas){
                    System.out.println("Generales: "+sillasGenerales+"\nEjecutivas: "+sillasEjecutivas);
                }
                
                if(sillasEjecutivas + sillasGenerales < filas){
                    System.out.println("¿Cuantas filas preferenciales desea?");
                    sillasPreferenciales = teclado.nextShort();
                    silla1.setSillasGenerales(sillasGenerales);
                }
                if(sillasGenerales + sillasEjecutivas + sillasPreferenciales == filas){
                    System.out.println("generales: "+sillasGenerales+"\nEjecutivas: "+sillasEjecutivas+"\nPreferenciales: "+sillasPreferenciales);
                }
          }
   }
     private void registrarClientes(){
         silla1.sala();
         int i=0;
         Cliente vector[]= new Cliente[filas*columnas];
         while(true){
         System.out.println("\n REGISTRO DE CLIENTES \n");
         Pelicula pelicula = new Pelicula();
         pelicula.recojeDatos();
             System.out.println("1.REGISTRAR CLIENTES\n 2.SALIR");
             byte opcion = teclado.nextByte();
         if(opcion==1){
             Scanner sc = new Scanner(System.in);
             Scanner sc1 =new Scanner (System.in);
             String nombre;
             String genero;
             int edad;      
             System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
             nombre=sc.nextLine();
             System.out.println("INGRESE EL GENERO");
             genero= sc.nextLine();
             System.out.println("INGRESE EDAD");
             edad= sc1.nextInt();
             vector[i]= new Cliente(nombre,edad,genero);
             i++;
           }
         if(opcion==2){
             break;
         }
    }
  }
}


