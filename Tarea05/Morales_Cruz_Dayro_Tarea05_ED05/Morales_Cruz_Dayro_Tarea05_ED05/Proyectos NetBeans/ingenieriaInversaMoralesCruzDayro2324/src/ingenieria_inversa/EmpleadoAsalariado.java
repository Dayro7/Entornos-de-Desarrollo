package ingenieria_inversa;

public class EmpleadoAsalariado extends EmpleadoMoralesCruzDayro2324 {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salario) {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(), "salario semanal", getSalarioSemanal());
    }
}
