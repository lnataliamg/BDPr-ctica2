import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Estacion{
  private String nombre;
  private String direccion;
  private ArrayList<Linea> linea;
  private ArrayList<Integer> transportes;
  private Horario horarioEstacion;
  private Boolean disponibilidad;
  private String razonDisponibilidad;
  private Date fechaDisponibilidad;
  private  String[] tiempoEstimadoAbordar;



	/**
	* Default empty Estacion constructor
	*/
	public Estacion() {
		super();
	}

	/**
	* Default Estacion constructor
	*/
	public Estacion(String nombre, String direccion, ArrayList<Linea> linea, ArrayList<Integer> transportes, Horario horarioEstacion, Boolean disponibilidad, String razonDisponibilidad, Date fechaDisponibilidad, Strin g) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.linea = linea;
		this.transportes = transportes;
		this.horarioEstacion = horarioEstacion;
		this.disponibilidad = disponibilidad;
		this.razonDisponibilidad = razonDisponibilidad;
		this.fechaDisponibilidad = fechaDisponibilidad;
		this.g = g;
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
	* Returns value of linea
	* @return
	*/
	public ArrayList<Linea> getLinea() {
		return linea;
	}

	/**
	* Sets new value of linea
	* @param
	*/
	public void setLinea(ArrayList<Linea> linea) {
		this.linea = linea;
	}

	/**
	* Returns value of transportes
	* @return
	*/
	public ArrayList<Integer> getTransportes() {
		return transportes;
	}

	/**
	* Sets new value of transportes
	* @param
	*/
	public void setTransportes(ArrayList<Integer> transportes) {
		this.transportes = transportes;
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

	/**
	* Returns value of g
	* @return
	*/
	public Strin getG() {
		return g;
	}

	/**
	* Sets new value of g
	* @param
	*/
	public void setG(Strin g) {
		this.g = g;
	}
}
