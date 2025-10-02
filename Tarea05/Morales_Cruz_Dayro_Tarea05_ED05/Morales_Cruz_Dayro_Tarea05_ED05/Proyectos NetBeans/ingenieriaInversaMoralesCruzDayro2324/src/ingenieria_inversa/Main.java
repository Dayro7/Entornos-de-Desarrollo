package ingenieria_inversa;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea array PorPagarMoralesCruzDayro2324 con cuatro elementos
        PorPagarMoralesCruzDayro2324 objetosPorPagar[] = new PorPagarMoralesCruzDayro2324[4];

        // llena el array con objetos que implementan la interfaz PorPagarMoralesCruzDayro2324
        objetosPorPagar[0] = new FacturaMoralesCruzDayro2324("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new FacturaMoralesCruzDayro2324("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Facturas y Empleados procesados en forma polimórfica:\n");

        // procesa en forma genérica cada elemento en el array objetosPorPagar
        for (PorPagarMoralesCruzDayro2324 porPagarActual : objetosPorPagar) {
            // imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(),
                    "pago vencido", porPagarActual.obtenerMontoPago());
        } // fin de for
    } // fin de main
}
