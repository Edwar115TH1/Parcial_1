import java.util.Scanner;
public class Menu {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Metodos m = new Metodos();

    System.out.println("Ingrese el tamaño de la matriz: ");
    int n = sc.nextInt();
    ObjAtributos[][] Matriz1 = new ObjAtributos[n][n];
    sc.nextLine(); // Se usa para limpiar el escaner antes de llamar a llenar matriz
    m.LlenarMatriz(Matriz1, sc);

    System.out.println("¿Quieres imprimir la matriz? Si = 1 / No = 2");
    int R = sc.nextInt();
        if (R == 1){
            m.MostrarAlmacen(Matriz1);                     
        }else{
            System.out.println("Gracias por todo");
        }

    }
}






/*
while(continuar){
        System.out.println( "Bienvenido al Almacen de Productos");
        System.out.println("¿Qué desea realizar?");
        System.out.println("1)  ");
        System.out.println("2)  ");
        System.out.println("3)  ");
        System.out.println("4)  ");
        System.out.println("5) ");
        System.out.println("6) ");
        System.out.println("7)  ");
        System.out.println("8) Salir ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:                
                break;
            case 2:
                
                break;
            case 3:
               
                break;
            case 4:
               
                break;
            case 5:
                
                
                break;
            case 6:
                
                break;
            case 7:
              
                break;
            case 8:
                System.out.println("Gracias por usar el sistema. ");
                continuar = false;
                break;
            case 9:
                System.out.println("Opción no válida. ");
                break;

        }
    }


*/
