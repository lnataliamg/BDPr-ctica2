public class Sitio{
  private String numeroSitio;
  private String telefono;
  private String direccion;
  private int disponibilidadTaxi;


	/**
	* Default empty Sitio constructor
	*/
	public Sitio() {
		super();
	}

	/**
	* Default Sitio constructor
	*/
	public Sitio(String numeroSitio, String telefono, String direccion, int disponibilidadTaxi) {
		super();
		this.numeroSitio = numeroSitio;
		this.telefono = telefono;
		this.direccion = direccion;
		this.disponibilidadTaxi = disponibilidadTaxi;
	}


	/**
	* Returns value of numeroSitio
	* @return
	*/
	public String getNumeroSitio() {
		return numeroSitio;
	}

	/**
	* Sets new value of numeroSitio
	* @param
	*/
	public void setNumeroSitio(String numeroSitio) {
		this.numeroSitio = numeroSitio;
	}

	/**
	* Returns value of telefono
	* @return
	*/
	public String getTelefono() {
		return telefono;
	}

	/**
	* Sets new value of telefono
	* @param
	*/
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	* Returns value of direccion
	* @return
	*/
	public String getDireccion() {
		return direccion;
	}

	/**
	* Sets new value of direccion
	* @param
	*/
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	* Returns value of disponibilidadTaxi
	* @return
	*/
	public int getDisponibilidadTaxi() {
		return disponibilidadTaxi;
	}

	/**
	* Sets new value of disponibilidadTaxi
	* @param
	*/
	public void setDisponibilidadTaxi(int disponibilidadTaxi) {
		this.disponibilidadTaxi = disponibilidadTaxi;
	}
}
