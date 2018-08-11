package Aplicacao;

import Dominio.Usuario;

public class Programa {

	public static void main(String[] args) {

		Usuario u1 = new Usuario(1, "Angelo", "admin");
		Usuario u2 = new Usuario(2, "Ronan", "adnon");
		Usuario u3 = new Usuario(3, "Dovakin", "Fus Roh Dah");
		
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());

	}

}
