package guia2ej1;

public class Detalle{

	private int cant;
	private Producto m_Producto;
	private Factura m_Factura;



	public Detalle(int cant, Producto m_Producto, Factura m_Factura) {
		super();
		this.cant = cant;
		this.m_Producto = m_Producto;
		this.m_Factura = m_Factura;
		m_Factura.addDetalle(this);
	}

	public int getTotal(){
		return m_Producto.getPrecio()*cant;
	}

	public void verDetalle(){
		m_Producto.verProducto();
		System.out.println(cant+"Total item: "+getTotal());
	}
}//end Detalle