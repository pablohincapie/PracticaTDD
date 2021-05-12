package com.example.tdd;

public class Numeros {
    private boolean invalidReplicable = false;
    private int restaUno = 0;
    private int restaDos = 0;
    private String resultado;
    private static final String INVALID= "el numero es invalido";

    /**
     * Metodo principal para convertir los numeros
     * @param romano: parametro romano a convertir
     * @return el numero convertido a decimal
     */
    public String convertANatural(String romano) {

        int digitoInicial;
        int result=0;
        int previo=0;
        int contador=0;
        int auxiliar=0;
        int mayor=10000;
        int resta=10000;
        boolean restaPrevia = false;
        boolean isSustraido = false;


        for (Character digito: romano.toUpperCase().toCharArray()){
            invalidReplicable = false;
            digitoInicial = changeLetterByNumber(digito);

            //Si es el primer digito
            if (previo == 0){
                previo = digitoInicial;
                auxiliar = digitoInicial;
                contador++;
                restaPrevia=invalidReplicable;
                isSustraido=false;

                //Si el digito ingresado es igual al anterior
            }else if (previo == digitoInicial && contador<=3){
                //Validaciones
                if (!invalidReplicable || isSustraido){
                    resultado= INVALID;
                    return resultado;
                }
                previo = digitoInicial;
                auxiliar += digitoInicial;
                restaPrevia=invalidReplicable;
                contador++;
                isSustraido=false;

                //Si el numero ingresado es mayor que el anterior
            }else if (previo < digitoInicial){
                //Validaciones
                if (!restaPrevia || contador >1 || digitoInicial >= mayor ||
                        (restaUno!=digitoInicial && restaDos!=digitoInicial) ){
                    resultado= INVALID;
                    return resultado;
                }

                resta=previo;
                isSustraido=true;
                previo = digitoInicial;
                auxiliar = digitoInicial - auxiliar;
                contador = 0;
                restaPrevia=invalidReplicable;

                //Si el numero ingresado es menor que el anterior
            }else if (previo > digitoInicial){
                //Validaciones
                if (digitoInicial>resta){
                    resultado= INVALID;
                    return resultado;
                }

                mayor=previo;
                previo = digitoInicial;
                restaPrevia=invalidReplicable;
                contador=0;
                result += auxiliar;
                auxiliar = digitoInicial;
                isSustraido=false;
            }
        }
        result += auxiliar;
        return String.valueOf(result);
    }

    /**
     * Metodo para cambiar un caracter por un numero
     * @param digito equivalente al numero romano.
     * @return retorna el valor decimal correspondiente al carater enviado
     */
    public int changeLetterByNumber(Character digito){
        int digitNatural=0;

        switch (digito){

            case 'I':
                digitNatural = 1;
                invalidReplicable=true;
                restaUno=5;
                restaDos=10;
                break;
            case 'V':
                digitNatural = 5;
                break;
            case 'X':
                digitNatural = 10;
                invalidReplicable=true;
                restaUno=50;
                restaDos=100;
                break;
            case 'L':
                digitNatural = 50;
                break;
            case 'C':
                digitNatural = 100;
                invalidReplicable=true;
                restaUno=500;
                restaDos=1000;
                break;
            case 'D':
                digitNatural = 500;
                break;
            case 'M':
                digitNatural = 1000;
                invalidReplicable = true;
                break;
            default:
                resultado= INVALID;
        }
        return digitNatural;
    }

}
