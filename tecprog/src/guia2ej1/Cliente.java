package guia2ej1;

public class Cliente {

	private int CUIT;
	private String IVA;
	private String nombre;
	public Cliente(int cUIT, String iVA, String nombre) {
		super();
		CUIT = cUIT;
		IVA = iVA;
		this.nombre = nombre;
	}
	public int getCUIT() {
		return CUIT;
	}
	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}
	public String getIVA() {
		return IVA;
	}
	public void setIVA(String iVA) {
		IVA = iVA;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void verCliente() {
		System.out.print(nombre + "-"+IVA +"-"+CUIT);
	}


}//end Cliente