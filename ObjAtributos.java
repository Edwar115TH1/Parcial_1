public class ObjAtributos {
    // Crear los atributos y que se necesiten capturar. (Get and Set)

    String productoNom;
    int cantidad,categoria;
    double precio;
    public ObjAtributos(String productoNom, int categoria, double precio, int cantidad) {
        this.productoNom = productoNom;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    public String getProductoNom() {
        return productoNom;
    }
    public void setProductoNom(String productoNom) {
        this.productoNom = productoNom;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
