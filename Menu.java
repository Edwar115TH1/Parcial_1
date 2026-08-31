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
