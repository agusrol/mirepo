package guia1ej3a5;

import java.util.Calendar;

//import guia1.Persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(1997, 1, 3);
		Calendar fechaIns = Calendar.getInstance();
		fechaNac.set(2015, 5, 8);
		Calendar hoy = Calendar.getInstance();
		Persona p1 = new Persona(1,"Al1",fechaNac,"a");
		Persona p2 = new Persona(2,"Al2",fechaNac,"abc");
		Persona p3 = new Persona(3,"Al3",fechaNac,"mas122");
		Persona p4 = new Persona(4,"Al4",fechaNac,"sdfads");
		Persona p5 = new Persona(5,"Al5",fechaNac,"passsss");
		
		Facultad f1 = new Facultad("FICH");
		Carrera c1 = new Carrera("Ing. informática",f1);
		Carrera c2 = new Carrera("Ing. ambien",f1);
		Alumno a1 = new Alumno(fechaIns,p1,c1);
		Alumno a2 = new Alumno(fechaIns,p2,c2);
		Alumno a3 = new Alumno(fechaIns,p3,c2);
		Alumno a4 = new Alumno(fechaIns,p4,c1);
		Alumno a5 = new Alumno(fechaIns,p5,c1);
		f1.mostrarCarrerasyAlumnos();
		
		//ej.5
		System.out.println(p5.validar("asdf"));
		System.out.println(p5.validar("passsss"));
	}

}
