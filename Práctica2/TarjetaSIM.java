import java.util.Date;
import java.text.SimpleDateFormat;
public class TarjetaSIM{
 private String id;
 private Vehiculo vehiculo;
 private String tipoDeRed;
 private Boolean estaAsignado;
 private Date fechaAsignacion;



	/**
	* Default empty TarjetaSIM constructor
	*/
	public TarjetaSIM() {
		super();
	}

	/**
	* Default TarjetaSIM constructor
	*/
	public TarjetaSIM(String id, Vehiculo vehiculo, String tipoDeRed, Boolean estaAsignado, Date fechaAsignacion) {
		super();
		this.id = id;
		this.vehiculo = vehiculo;
		this.tipoDeRed = tipoDeRed;
		this.estaAsignado = estaAsignado;
		this.fechaAsignacion = fechaAsignacion;
	}

	/**
	* Returns value of id
	* @return
	*/
	public String getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(String id) {
		this.id = id;
	}

	/**
	* Returns value of vehiculo
	* @return
	*/
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	* Sets new value of vehiculo
	* @param
	*/
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	* Returns value of tipoDeRed
	* @return
	*/
	public String getTipoDeRed() {
		return tipoDeRed;
	}

	/**
	* Sets new value of tipoDeRed
	* @param
	*/
	public void setTipoDeRed(String tipoDeRed) {
		this.tipoDeRed = tipoDeRed;
	}

	/**
	* Returns value of estaAsignado
	* @return
	*/
	public Boolean getEstaAsignado() {
		return estaAsignado;
	}

	/**
	* Sets new value of estaAsignado
	* @param
	*/
	public void setEstaAsignado(Boolean estaAsignado) {
		this.estaAsignado = estaAsignado;
	}

	/**
	* Returns value of fechaAsignacion
	* @return
	*/
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	/**
	* Sets new value of fechaAsignacion
	* @param
	*/
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
}
