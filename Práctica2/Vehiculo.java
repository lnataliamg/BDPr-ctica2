import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
public class Vehiculo{
  private String id;
  private Date fechaInicio;
  private Boolean reparacion;
  private Date fechaIngresoRepa;
  private String razonRepa;
  private Date fechaSalidaRepa;
  private String tipoCombustible;
  private int capacidadPasajero;
  private Boolean asignadoTarejtaSIM;
  private TarjetaSIM tarjetaSIM;
  private TallerReparacion tallerReparacion;
  private ArrayList<Empleado> empleados;
  private int tipoVehiculo;
  private Ruta ruta;
  private Linea linea;
  private Sitio sitio;



	/**
	* Default empty Vehiculo constructor
	*/
	public Vehiculo() {
		super();
	}

	/**
	* Default Vehiculo constructor
	*/
	public Vehiculo(String id, Date fechaInicio, Boolean reparacion, Date fechaIngresoRepa, String razonRepa, Date fechaSalidaRepa, String tipoCombustible, int capacidadPasajero, Boolean asignadoTarejtaSIM, TarjetaSIM tarjetaSIM, TallerReparacion tallerReparacion, ArrayList<Empleado> empleados, int tipoVehiculo, Ruta ruta, Linea linea, Sitio sitio) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.reparacion = reparacion;
		this.fechaIngresoRepa = fechaIngresoRepa;
		this.razonRepa = razonRepa;
		this.fechaSalidaRepa = fechaSalidaRepa;
		this.tipoCombustible = tipoCombustible;
		this.capacidadPasajero = capacidadPasajero;
		this.asignadoTarejtaSIM = asignadoTarejtaSIM;
		this.tarjetaSIM = tarjetaSIM;
		this.tallerReparacion = tallerReparacion;
		this.empleados = empleados;
		this.tipoVehiculo = tipoVehiculo;
		this.ruta = ruta;
		this.linea = linea;
		this.sitio = sitio;
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
	* Returns value of fechaInicio
	* @return
	*/
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	* Sets new value of fechaInicio
	* @param
	*/
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	* Returns value of reparacion
	* @return
	*/
	public Boolean getReparacion() {
		return reparacion;
	}

	/**
	* Sets new value of reparacion
	* @param
	*/
	public void setReparacion(Boolean reparacion) {
		this.reparacion = reparacion;
	}

	/**
	* Returns value of fechaIngresoRepa
	* @return
	*/
	public Date getFechaIngresoRepa() {
		return fechaIngresoRepa;
	}

	/**
	* Sets new value of fechaIngresoRepa
	* @param
	*/
	public void setFechaIngresoRepa(Date fechaIngresoRepa) {
		this.fechaIngresoRepa = fechaIngresoRepa;
	}

	/**
	* Returns value of razonRepa
	* @return
	*/
	public String getRazonRepa() {
		return razonRepa;
	}

	/**
	* Sets new value of razonRepa
	* @param
	*/
	public void setRazonRepa(String razonRepa) {
		this.razonRepa = razonRepa;
	}

	/**
	* Returns value of fechaSalidaRepa
	* @return
	*/
	public Date getFechaSalidaRepa() {
		return fechaSalidaRepa;
	}

	/**
	* Sets new value of fechaSalidaRepa
	* @param
	*/
	public void setFechaSalidaRepa(Date fechaSalidaRepa) {
		this.fechaSalidaRepa = fechaSalidaRepa;
	}

	/**
	* Returns value of tipoCombustible
	* @return
	*/
	public String getTipoCombustible() {
		return tipoCombustible;
	}

	/**
	* Sets new value of tipoCombustible
	* @param
	*/
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	/**
	* Returns value of capacidadPasajero
	* @return
	*/
	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}

	/**
	* Sets new value of capacidadPasajero
	* @param
	*/
	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}

	/**
	* Returns value of asignadoTarejtaSIM
	* @return
	*/
	public Boolean getAsignadoTarejtaSIM() {
		return asignadoTarejtaSIM;
	}

	/**
	* Sets new value of asignadoTarejtaSIM
	* @param
	*/
	public void setAsignadoTarejtaSIM(Boolean asignadoTarejtaSIM) {
		this.asignadoTarejtaSIM = asignadoTarejtaSIM;
	}

	/**
	* Returns value of tarjetaSIM
	* @return
	*/
	public TarjetaSIM getTarjetaSIM() {
		return tarjetaSIM;
	}

	/**
	* Sets new value of tarjetaSIM
	* @param
	*/
	public void setTarjetaSIM(TarjetaSIM tarjetaSIM) {
		this.tarjetaSIM = tarjetaSIM;
	}

	/**
	* Returns value of tallerReparacion
	* @return
	*/
	public TallerReparacion getTallerReparacion() {
		return tallerReparacion;
	}

	/**
	* Sets new value of tallerReparacion
	* @param
	*/
	public void setTallerReparacion(TallerReparacion tallerReparacion) {
		this.tallerReparacion = tallerReparacion;
	}

	/**
	* Returns value of empleados
	* @return
	*/
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	* Sets new value of empleados
	* @param
	*/
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	* Returns value of tipoVehiculo
	* @return
	*/
	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	/**
	* Sets new value of tipoVehiculo
	* @param
	*/
	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	/**
	* Returns value of ruta
	* @return
	*/
	public Ruta getRuta() {
		return ruta;
	}

	/**
	* Sets new value of ruta
	* @param
	*/
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	/**
	* Returns value of linea
	* @return
	*/
	public Linea getLinea() {
		return linea;
	}

	/**
	* Sets new value of linea
	* @param
	*/
	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	/**
	* Returns value of sitio
	* @return
	*/
	public Sitio getSitio() {
		return sitio;
	}

	/**
	* Sets new value of sitio
	* @param
	*/
	public void setSitio(Sitio sitio) {
		this.sitio = sitio;
	}
}
