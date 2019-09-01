import java.util.Date;
import java.text.SimpleDateFormat;

public class Licencia{
private Empleado empleado;
private String id;
private String nombre;
private String apellidoP;
private String apellidoN;
private Date antiguedad;
private Date expedicion;
private String nacionalidad;
private Date vigencia;
private String RFC;
private String tipoLicencia;



	/**
	* Default empty Licencia constructor
	*/
	public Licencia() {
		super();
	}

	/**
	* Default Licencia constructor
	*/
	public Licencia(Empleado empleado, String id, String nombre, String apellidoP, String apellidoN, Date antiguedad, Date expedicion, String nacionalidad, Date vigencia, String RFC, String tipoLicencia) {
		super();
		this.empleado = empleado;
		this.id = id;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoN = apellidoN;
		this.antiguedad = antiguedad;
		this.expedicion = expedicion;
		this.nacionalidad = nacionalidad;
		this.vigencia = vigencia;
		this.RFC = RFC;
		this.tipoLicencia = tipoLicencia;
	}

  /**
	* Returns value of empleado
	* @return
	*/
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	* Sets new value of empleado
	* @param
	*/
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of apellidoP
	* @return
	*/
	public String getApellidoP() {
		return apellidoP;
	}

	/**
	* Sets new value of apellidoP
	* @param
	*/
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	/**
	* Returns value of apellidoN
	* @return
	*/
	public String getApellidoN() {
		return apellidoN;
	}

	/**
	* Sets new value of apellidoN
	* @param
	*/
	public void setApellidoN(String apellidoN) {
		this.apellidoN = apellidoN;
	}

	/**
	* Returns value of antiguedad
	* @return
	*/
	public Date getAntiguedad() {
		return antiguedad;
	}

	/**
	* Sets new value of antiguedad
	* @param
	*/
	public void setAntiguedad(Date antiguedad) {
		this.antiguedad = antiguedad;
	}

	/**
	* Returns value of expedicion
	* @return
	*/
	public Date getExpedicion() {
		return expedicion;
	}

	/**
	* Sets new value of expedicion
	* @param
	*/
	public void setExpedicion(Date expedicion) {
		this.expedicion = expedicion;
	}

	/**
	* Returns value of nacionalidad
	* @return
	*/
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	* Sets new value of nacionalidad
	* @param
	*/
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	* Returns value of vigencia
	* @return
	*/
	public Date getVigencia() {
		return vigencia;
	}

	/**
	* Sets new value of vigencia
	* @param
	*/
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	/**
	* Returns value of RFC
	* @return
	*/
	public String getRFC() {
		return RFC;
	}

	/**
	* Sets new value of RFC
	* @param
	*/
	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	/**
	* Returns value of tipoLicencia
	* @return
	*/
	public String getTipoLicencia() {
		return tipoLicencia;
	}

	/**
	* Sets new value of tipoLicencia
	* @param
	*/
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
}
