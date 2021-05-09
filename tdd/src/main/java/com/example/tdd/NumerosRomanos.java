package com.example.tdd;


public class NumerosRomanos {

	public String convertirAromanos(int numeroNatural) {

		switch (numeroNatural) {
			case 4:
				return "IV";
			case 9:
				return "IX";
		}

		if(numeroNatural <=3)
			return sumarI(1,numeroNatural, "");

		if(numeroNatural <=8)
			return sumarI(6,numeroNatural, "V");
		return null;
	}

	private String sumarI(int inicioCuenta, int numeroNatural, String inicioNumeroRomano){
		for (int i = inicioCuenta; i <= numeroNatural ; i++) {
			inicioNumeroRomano += "I";
		}
		return inicioNumeroRomano;
	}

}
