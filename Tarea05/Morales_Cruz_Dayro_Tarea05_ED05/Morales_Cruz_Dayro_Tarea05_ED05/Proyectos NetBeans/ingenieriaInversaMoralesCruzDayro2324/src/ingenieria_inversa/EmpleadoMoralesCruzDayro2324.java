package ingenieria_inversa;

public abstract class EmpleadoMoralesCruzDayro2324 implements PorPagarMoralesCruzDayro2324 {

    private String nombre;
    private String apellido;
    private String nss;

    public EmpleadoMoralesCruzDayro2324(String nombre, String apellido, String nss) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nnúmero seguridad social: %s",
                getNombre(), getApellido(), getNss());
    }

}
