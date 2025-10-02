package cuenta;


public class Main {

    
    public static void main(String[] args) {
        CuentaMoralesCruzDayro2324 miCuentaMoralesCruzDayro2324;
        double saldoActual;
        int x;
        
        miCuentaMoralesCruzDayro2324 = new CuentaMoralesCruzDayro2324("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaMoralesCruzDayro2324.estado()+"€");
        try 
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaMoralesCruzDayro2324.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaMoralesCruzDayro2324.ingresar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuentaMoralesCruzDayro2324.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
}
