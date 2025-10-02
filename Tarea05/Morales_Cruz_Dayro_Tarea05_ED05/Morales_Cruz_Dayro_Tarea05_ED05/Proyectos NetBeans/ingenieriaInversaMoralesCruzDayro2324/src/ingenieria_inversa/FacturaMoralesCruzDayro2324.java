package ingenieria_inversa;

public class FacturaMoralesCruzDayro2324 implements PorPagarMoralesCruzDayro2324 {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // constructor con cuatro argumentos
    public FacturaMoralesCruzDayro2324(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        setCantidad(cuenta); // valida y almacena la cantidad
        setPrecioPorArticulo(precio); // valida y almacena el precio por art�culo
    } // fin del constructor de FacturaMoralesCruzDayro2324 con cuatro argumentos

    // establece el n�mero de pieza
    public void setNumeroPieza(String pieza) {
        numeroPieza = pieza;
    } // fin del m�todo establecerNumeroPieza

    // obtener n�mero de pieza
    public String getNumeroPieza() {
        return numeroPieza;
    } // fin del m�todo obtenerNumeroPieza

    // establece la descripci�n
    public void setDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    } // fin del m�todo establecerDescripcionPieza

    // obtiene la descripci�n
    public String getDescripcionPieza() {
        return descripcionPieza;
    } // fin del m�todo obtenerDescripcionPieza

    // establece la cantidad
    public void setCantidad(int cuenta) {
        cantidad = (cuenta < 0) ? 0 : cuenta; // cantidad no puede ser negativa
    } // fin del m�todo establecerCantidad

    // obtener cantidad
    public int getCantidad() {
        return cantidad;
    } // fin del m�todo obtenerCantidad

    // establece el precio por art�culo
    public void setPrecioPorArticulo(double precio) {
        precioPorArticulo = (precio < 0.0) ? 0.0 : precio; // valida el precio
    } // fin del m�todo establecerPrecioPorArticulo

    // obtiene el precio por art�culo
    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    } // fin del m�todo obtenerPrecioPorArticulo
    // devuelve representaci�n String de un objeto FacturaMoralesCruzDayro2324

    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "factura", "numero de pieza", getNumeroPieza(), getDescripcionPieza(),
                "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
    } // fin del m�todo toString

    // m�todo requerido para realizar el contrato con la interfaz PorPagarMoralesCruzDayro2324
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo(); // calcula el costo total
    } // fin del m�todo obtenerMontoPago

}
