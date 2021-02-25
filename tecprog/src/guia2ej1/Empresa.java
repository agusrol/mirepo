package guia2ej1;

import java.util.Vector;
import java.util.concurrent.SynchronousQueue;

import guia1ej3a5.Alumno;

public class Empresa {

	private String IVA;
	private String nombre;
	private Vector<Factura> facturas;
	
	
	public void verFacturas(){
		System.out.println("Nombre de la empresa: " + nombre);
		for(Factura f : facturas) {
			f.verFactura();
		}
	}
	
	public void addFactura(Factura f) {
		facturas.add(f);
	}

	public void setFacturas(Vector<Factura> facturas) {
		this.facturas = facturas;
	}

	public void verSumTotalFacturas(){
		int tot=0;
		for(Factura f : facturas) {
			tot+=f.getTotal();
		}
		System.out.println("El total es: "+tot);
	}

	public Empresa(String iVA, String nombre) {
		super();
		IVA = iVA;
		this.nombre = nombre;
		this.facturas = new Vector<Factura>();
	}
}//end Empresa
