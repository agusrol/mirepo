package guia2ej1;

import java.util.Calendar;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fechaFac1 = Calendar.getInstance();
		fechaFac1.set(1997, 1, 3);
		Calendar fechaFac2 = Calendar.getInstance();
		fechaFac2.set(2015, 5, 8);
		
		Empresa e1 = new Empresa("IVA Monotribuo","Mayorista S.A.");
		
		Cliente c1 = new Cliente(1,"Monotributo","Marangoni S.A.");
		Cliente c2 = new Cliente(2,"R.I.","Gilcomat SRL");
		
		Factura p1 = new Factura(fechaFac2,1,c2,e1);
	/**	Factura p2 = new Factura(fechaFac1,2,c1,e1);
		Factura p3 = new Factura(fechaFac1,3,c2,e1);
		Factura p4 = new Factura(fechaFac2,4,c1,e1);
		Factura p5 = new Factura(fechaFac1,5,c1,e1);*/
		
		Producto a1 = new Producto("Porcelanato 45x45",6);
		Producto a2 = new Producto("Globos",3);
		Producto a3 = new Producto("Guantes",2);
		Producto a4 = new Producto("Grifería FV 6 piezas",400);
		
		Detalle d1 = new Detalle(100,a1,p1);
		Detalle d2 = new Detalle(200,a2,p1);
		
	/**	Detalle d3 = new Detalle(200,a3,p2);
		
		Detalle d4 = new Detalle(200,a4,p3);
		
		Detalle d5 = new Detalle(10,a4,p4);
		
		Detalle d6 = new Detalle(10,a4,p5);
		Detalle d7 = new Detalle(10,a3,p5);
		Detalle d8 = new Detalle(10,a2,p5);
		p5.addDetalle(d1);*/
		
		//COMPORTAMIENTO SOLICITADO:
		e1.verSumTotalFacturas();
		
	}

}
