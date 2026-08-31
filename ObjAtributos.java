public class ObjAtributos {
    // Crear los atributos y que se necesiten capturar. (Get and Set)

    String nombre;
    int cantidad;
    double descuento, valor;

    public ObjAtributos(String nombre, int cantidad, double descuento, double valor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }







}
