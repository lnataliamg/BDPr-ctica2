import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Linea{
  private String nombre;
  private String direccion;
  private  ArrayList<Estacion> estacion;
  private String tipoTransporte;
  private Horario horarioLinea;
  private String tiempoEstimadoReparacion;
  private Boolean disponibilidad;
  private String razonDisponibilidad;
  private Date fechaDisponibilidad;
  private  String[] tiempoEstimadoAbordar;

	/**
	* Default empty Linea constructor
	*/
	public Linea() {
		super();
	}

	/**
	* Default Linea constructor
	*/
	public Linea(String nombre, String direccion, ArrayList<Estacion> estacion, String tipoTransporte, Horario horarioLinea, String tiempoEstimadoReparacion, Boolean disponibilidad, String razonDisponibilidad, Date fechaDisponibilidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estacion = estacion;
		this.tipoTransporte = tipoTransporte;
		this.horarioLinea = horarioLinea;
		this.tiempoEstimadoReparacion = tiempoEstimadoReparacion;
		this.disponibilidad = disponibilidad;
		this.razonDisponibilidad = razonDisponibilidad;
		this.fechaDisponibilidad = fechaDisponibilidad;
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
	* Returns value of estacion
	* @return
	*/
	public ArrayList<Estacion> getEstacion() {
		return estacion;
	}

	/**
	* Sets new value of estacion
	* @param
	*/
	public void setEstacion(ArrayList<Estacion> estacion) {
		this.estacion = estacion;
	}

	/**
	* Returns value of tipoTransporte
	* @return
	*/
	public String getTipoTransporte() {
		return tipoTransporte;
	}

	/**
	* Sets new value of tipoTransporte
	* @param
	*/
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	/**
	* Returns value of horarioLinea
	* @return
	*/
	public Horario getHorarioLinea() {
		return horarioLinea;
	}

	/**
	* Sets new value of horarioLinea
	* @param
	*/
	public void setHorarioLinea(Horario horarioLinea) {
		this.horarioLinea = horarioLinea;
	}

	/**
	* Returns value of tiempoEstimadoReparacion
	* @return
	*/
	public String getTiempoEstimadoReparacion() {
		return tiempoEstimadoReparacion;
	}

	/**
	* Sets new value of tiempoEstimadoReparacion
	* @param
	*/
	public void setTiempoEstimadoReparacion(String tiempoEstimadoReparacion) {
		this.tiempoEstimadoReparacion = tiempoEstimadoReparacion;
	}

	/**
	* Returns value of disponibilidad
	* @return
	*/
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	/**
	* Sets new value of disponibilidad
	* @param
	*/
	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	/**
	* Returns value of razonDisponibilidad
	* @return
	*/
	public String getRazonDisponibilidad() {
		return razonDisponibilidad;
	}

	/**
	* Sets new value of razonDisponibilidad
	* @param
	*/
	public void setRazonDisponibilidad(String razonDisponibilidad) {
		this.razonDisponibilidad = razonDisponibilidad;
	}

	/**
	* Returns value of fechaDisponibilidad
	* @return
	*/
	public Date getFechaDisponibilidad() {
		return fechaDisponibilidad;
	}

	/**
	* Sets new value of fechaDisponibilidad
	* @param
	*/
	public void setFechaDisponibilidad(Date fechaDisponibilidad) {
		this.fechaDisponibilidad = fechaDisponibilidad;
	}


}
