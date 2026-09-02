import java.util.Scanner;

    public class Metodos {
        //llenar Matriz Objetual (Con los atributos que necesitemos)
        public ObjAtributos[][] LlenarMatriz(ObjAtributos[][] a, Scanner sc) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la cantegoria del producto:\n "+" 1>Lacteos, 2>Carnes, 3>Enlatados, 4>Granos");
                    int categoria = sc.nextInt();
                    System.out.println("Ingrese el valor del producto: ");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese la cantidad actual del prodcuto "+nombre+":");
                    int cantidad = sc.nextInt();
                    sc.nextLine(); // Limpiamos el escaner cada ciclo completo
                    ObjAtributos o = new ObjAtributos(nombre,categoria, precio, cantidad);
                    a[i][j] = o;
                }
            }
            return a;
        }

    public void MostrarAlmacen(ObjAtributos[][] a) {
        int contaLacteos=0, contaCarnes=0, contaEnlatados=0, contaGranos=0; 
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j].getProductoNom() != null) { // Esto para validar que el campo sea diferente a Nulo o vacio
                        if(i==0 & j==0 ){
                        System.out.println("──────────────────────────────────────────");}
                        System.out.println("Nombre del Producto: " +     a[i][j].getProductoNom());
                        System.out.println("Categoria: " +   a[i][j].getCategoria());
                        System.out.println("Precio -->  " +     a[i][j].getPrecio());
                        System.out.println("Cantidad actual --> "+ a[i][j].getCantidad());                        
                        System.out.println("──────────────────────────────────────────");
                        if (a[i][j].getCategoria() == 1) {
                            contaLacteos ++;
                        }if (a[i][j].getCategoria() == 2) {
                            contaCarnes++;
                        }if (a[i][j].getCategoria() == 3){
                            contaEnlatados++;
                        }if (a[i][j].getCategoria() == 4) {
                            contaGranos++;
                        }
                    }
                    
                }
            }
            System.out.println("Cantidad por de productos por categoria: \n"+ "Lacteos: "+contaLacteos+"\nCarnes: "+contaCarnes+"\nEnlatados: "+contaEnlatados+"\nGranos: "+contaGranos);
        }           
         
        




    }