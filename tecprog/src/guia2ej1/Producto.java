package guia2ej1;

public class Producto {

	private String nombre;
	private int precio;


	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getPrecio(){
		return precio;
	}

	public void verProducto(){
		System.out.println(nombre);
	}
}//end Producto
