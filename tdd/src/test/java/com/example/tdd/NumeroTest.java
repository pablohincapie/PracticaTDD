package com.example.tdd;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
public class NumeroTest {
    @Before
    public void setUp() {
    }

    @Test
    public void pasarIAnatural() {
        String romano = "I";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("1", resultado);
    }

    @Test
    public void pasarVAnatural() {
        String romano = "V";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("5", resultado);
    }

    @Test
    public void pasarXAnatural() {
        String romano = "X";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("10", resultado);
    }

    @Test
    public void pasarXXAnatural() {
        String romano = "XX";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("20", resultado);
    }

    @Test
    public void pasarDDAnatural() {
        String romano = "DD";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarXXCAnatural() {
        String romano = "XXC";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarXXIIIAnatural() {
        String romano = "XXIII";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("23", resultado);
    }

    @Test
    public void pasarXXLVIIAnatural() {
        String romano = "XXLVII";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarVLAnatural() {
        String romano = "VL";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarCMMAnatural() {
        String romano = "CMM";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarIXVIAnatural() {
        String romano = "IXVI";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarICAnatural() {
        String romano = "IC";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarIXLAnatural() {
        String romano = "IXL";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarXILAnatural() {
        String romano = "XIL";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarVIVAnatural() {
        String romano = "VIV";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("el numero es invalido", resultado);
    }

    @Test
    public void pasarCDXLAnatural() {
        String romano = "CDXL";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("440", resultado);
    }

    @Test
    public void pasarXXIIIAnaturalAleatorio() {
        String romano = "XXIII";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("23", resultado);
    }

    @Test
    public void pasarLXXXVIIIAnaturalAleatorio() {
        String romano = "LXXXVIII";
        Numeros numeros = new Numeros();
        String resultado = numeros.convertANatural(romano);
        Assert.assertEquals("88", resultado);
    }



}
