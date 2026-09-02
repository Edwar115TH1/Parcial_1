import java.util.Scanner;
public class Menu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        System.out.println("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        ObjAtributos[][] Almacen = new ObjAtributos[n][n];
        //sc.nextLine(); // Se usa para limpiar el escaner antes de llamar a llenar matriz
        while(continuar){
            System.out.println( "Bienvenido al Almacen de Productos");
            System.out.println("¿Qué desea realizar?");
            System.out.println("1| Ingresar Inventario ");
            System.out.println("2| Mostrar Inventario: ");
            System.out.println("3| Salir ");
          
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    sc.nextLine();
                    m.LlenarMatriz(Almacen, sc);
                    break;                
                case 2:
                    m.MostrarAlmacen(Almacen);
                    break;               
                case 3:
                    System.out.println("Gracias por usar el sistema. ");
                    continuar = false;
                    break;
                case 4:
                    System.out.println("Opción no válida. ");
                    break;

            }
        }

    }
}