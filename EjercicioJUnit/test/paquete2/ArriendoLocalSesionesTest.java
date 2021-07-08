/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nixon
 */
public class ArriendoLocalSesionesTest {

    ArriendoLocalSesiones instance = null;

    public ArriendoLocalSesionesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new ArriendoLocalSesiones("De salud", 100);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerValorSillas() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerValorSillas");
        double x = 10.0;
        instance.establecerValorSillas(x);
        Field field = instance.getClass().getDeclaredField("valorSillas");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10.0);
    }

    @Test
    public void testEstablecerValorAmplificacion() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerValorAmplificacion");
        double x = 0.0;
        instance.establecerValorAmplificacion(x);
        Field field = instance.getClass().getDeclaredField("valorAmplificacion");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0.0);

    }

    @Test
    public void testEstablecerArriendoMensual() {
        System.out.println("establecerArriendoMensual");
        instance.establecerCuotaBase(5.0);
        instance.establecerValorSillas(6.0);
        instance.establecerValorAmplificacion(7.0);
        double expResult = 18.0;
        instance.establecerArriendoMensual();
        double result = instance.obtenerArriendoMensual();
        assertEquals(expResult, result, 0.1);

    }

    @Test
    public void testObtenerValorSillas() {
        System.out.println("obtenerValorSillas");
        double expResult = 10.0;
        instance.establecerValorSillas(expResult);
        double result = instance.obtenerValorSillas();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obtenerValorAmplificacion method, of class ArriendoLocalSesiones.
     */
    @Test
    public void testObtenerValorAmplificacion() {
        System.out.println("obtenerValorAmplificacion");
        double expResult = 5.0;
        double result = instance.obtenerValorAmplificacion();
        assertEquals(expResult, result, 5.0);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        instance.establecerNombreArrendatario("Nixon");
        instance.establecerCuotaBase(5.0);
        instance.establecerValorSillas(6.0);
        instance.establecerValorAmplificacion(7.0);
        instance.establecerArriendoMensual();
        String cadena = String.format("Ariendo de Local Sesiones\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n",
                "Nixon",
                5.0,
                6.0,
                7.0,
                18.0);
        String result = instance.toString();
        assertEquals(cadena, result);
    }

}
