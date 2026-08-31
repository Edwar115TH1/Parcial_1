import java.util.Scanner;

public class Metodos {
    //llenar Matriz Objetual (Con los atributos que necesitemos)
    public ObjAtributos[][] LlenarMatriz(ObjAtributos[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la cantidad del producto: ");
                int cantidad = sc.nextInt();                
                System.out.println("¿El producto tiene descuento? Si= 1/ No = 2");
                int R = sc.nextInt();
                double descuento = 0;
                if (R == 1) {
                    System.out.println("Ingrese el % del descuento del producto: ");
                    descuento = sc.nextDouble();
                }else{
                    descuento = 0.0;
                }
                System.out.println("Ingrese el valor del producto: ");
                double valor = sc.nextDouble();
                sc.nextLine(); // Limpiamos el escaner cada ciclo completo
                ObjAtributos o = new ObjAtributos(nombre, cantidad, descuento, valor);
                a[i][j] = o;
            }
        }
        return a;
    }

public void MostrarAlmacen(ObjAtributos[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j].getNombre() != null) { // Esto para validar que el campo sea diferente a Nulo o vacio
                    if(i==0 & j==0 ){
                    System.out.println("──────────────────────────────────────────");}
                    System.out.println("Nombre del Producto: " + a[i][j].getNombre());
                    System.out.println("Cantidad del Producto: " + a[i][j].getValor());
                    System.out.println("Precio del Producto: " + a[i][j].getCantidad());
                    System.out.println("El descuento otorgado es: " + a[i][j].getDescuento());
                    System.out.println("──────────────────────────────────────────");
                }
            }
        }
    }
        
}































/*
public void MostrarAlmacen(ObjAtributos[][] a) {
        int m = a.length;
        int b = a[0].length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j].getNombre() != null) { // Esto para validar que el campo sea diferente a Nulo o vacio
                    System.out.println("Nombre del Producto: " + a[i][j].getNombre());
                    System.out.println("Precio del Producto: " + a[i][j].getPrecio());
                    System.out.println("Cantidad del Producto: " + a[i][j].getCantidad());
                }
            }
        }
    }


*/