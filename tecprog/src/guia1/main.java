package guia1;

import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(1997, 1, 3);
		Calendar hoy = Calendar.getInstance();
		Persona p1 = new Persona(1,"A",fechaNac);
		Persona p2 = new Persona(1,"A",fechaNac);
		System.out.println(p1==p2);
		System.out.println(p1.mostrar());
		System.out.println(p1.equals(p2));
		System.out.println(p1.calcEdad());
		
	}

}
