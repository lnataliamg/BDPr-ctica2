import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Ruta{
  public ArrayList<String> paradas;
  private String direccion;
  private String tipoTransporte;
  private Horario horarioEstacion;
  private String tiempoEstimadoReparacion;
  private String razonDisponibilidad;
  private Date fechaDisponibilidad;
  private String[] tiempoEstimadoAbordar;


	/**
	* Default empty Ruta constructor
	*/
	public Ruta() {
		super();
	}

	/**
	* Default Ruta constructor
	*/
	public Ruta(ArrayList<String> paradas, String direccion, String tipoTransporte, Horario horarioEstacion, String tiempoEstimadoReparacion, String razonDisponibilidad, Date fechaDisponibilidad, Strin g) {
		super();
		this.paradas = paradas;
		this.direccion = direccion;
		this.tipoTransporte = tipoTransporte;
		this.horarioEstacion = horarioEstacion;
		this.tiempoEstimadoReparacion = tiempoEstimadoReparacion;
		this.razonDisponibilidad = razonDisponibilidad;
		this.fechaDisponibilidad = fechaDisponibilidad;
		this.g = g;
	}



	/**
	* Returns value of paradas
	* @return
	*/
	public ArrayList<String> getParadas() {
		return paradas;
	}

	/**
	* Sets new value of paradas
	* @param
	*/
	public void setParadas(ArrayList<String> paradas) {
		this.paradas = paradas;
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
	* Returns value of horarioEstacion
	* @return
	*/
	public Horario getHorarioEstacion() {
		return horarioEstacion;
	}

	/**
	* Sets new value of horarioEstacion
	* @param
	*/
	public void setHorarioEstacion(Horario horarioEstacion) {
		this.horarioEstacion = horarioEstacion;
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
