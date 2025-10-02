/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package cuenta;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Dayro Morales Cruz ED03
 */
public class CuentaMoralesCruzDayro2324Test extends TestCase {
    // Test límite superior válido
    @Test
    public void testRetirar_ValidoLimiteSuperior() throws Exception {
        System.out.println("Test de valor VÁLIDO LÍMITE SUPERIOR: retirar(2500).");
        double cantidad = 2500;
        CuentaMoralesCruzDayro2324 miCuenta = new CuentaMoralesCruzDayro2324("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500,0);
        try {
            miCuenta.retirar(cantidad);
            double saldoActual = miCuenta.estado();
            assertTrue(saldoActual == 0);
        } catch (Exception e) {
            System.out.println(e);
            fail("Excepción no esperada: " + e);
        }
    }

    // Test de limites inválidos
    @Test
    public void testRetirar_InvalidoLimiteSuperior() throws Exception {
        System.out.println("Test de valor INVÁLIDO LÍMITE SUPERIOR: retirar(saldo inicial + 1).");
        double cantidad = 2501;
        CuentaMoralesCruzDayro2324 miCuenta = new CuentaMoralesCruzDayro2324("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        try {
            miCuenta.retirar(cantidad); // Esto debería lanzar una excepción
            fail("Se permitió una retirada superior al saldo inicial.");
        } catch (Exception e) {
            System.out.println(e);
            double saldoActual = miCuenta.estado();
            assertTrue(saldoActual == 2500);
        }
    }

    @Test
    public void testRetirar_InvalidoLimiteInferior() throws Exception {
        System.out.println("Test de valor INVÁLIDO LÍMITE INFERIOR: retirar(-1).");
        double cantidad = -1;
        CuentaMoralesCruzDayro2324 miCuenta = new CuentaMoralesCruzDayro2324("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        try {
            miCuenta.retirar(cantidad); // Esto debería lanzar una excepción
            fail("Se permitió una retirada negativa.");
        } catch (Exception e) {
            System.out.println(e);
            double saldoActual = miCuenta.estado();
            assertTrue(saldoActual == 2500);
        }
    }

    @Test
    public void testRetirar_NoNumerico() throws Exception {
        System.out.println("Test de valor NO NUMÉRICO: retirar('abc').");
        String cantidad = "abc";
        CuentaMoralesCruzDayro2324 miCuenta = new CuentaMoralesCruzDayro2324("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        try {
            miCuenta.retirar(Double.parseDouble(cantidad)); // Esto debería lanzar una excepción
            fail("Se permitió una retirada no numérica.");
        } catch (NumberFormatException e) {
            System.out.println(e);
            double saldoActual = miCuenta.estado();
            assertTrue(saldoActual == 2500);
        } catch (Exception e) {
            System.out.println(e);
            fail("Excepción no esperada: " + e);
        }
    }
}
