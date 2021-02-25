package guia2ej1;

import java.util.Calendar;
import java.util.Vector;

public class Factura {

	private Calendar fecha;
	private int nro;
	private Cliente m_Cliente;
	private Empresa m_Empresa;
	private Vector<Detalle> detalles;


	public Factura(Calendar fecha, int nro, Cliente m_Cliente, Empresa m_Empresa) {
		super();
		this.fecha = fecha;
		this.nro = nro;
		this.m_Cliente = m_Cliente;
		this.m_Empresa = m_Empresa;
		this.detalles = new Vector<Detalle>();
		this.m_Empresa.addFactura(this);
	}

	public void addDetalle(Detalle d) {
		detalles.add(d);
	}
	public int getTotal() {
		int tot = 0;
		for (Detalle detalle : detalles) {
			tot+=detalle.getTotal();
		}
		return tot;
	};
	
	public void verFactura(){
		m_Cliente.verCliente();
		int i = 0;
		for (int j = 0; j < detalles.size(); j++) {
			System.out.print("Detalle "+j+": ");
			detalles.get(j).verDetalle();
		}
	}
}//end Factura