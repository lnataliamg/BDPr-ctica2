import java.util.Date;
import java.text.SimpleDateFormat;

public class ExamenMedico{

private String id;
private Empleado empleado;
private float peso;
private float talla;
private String presion;
private Date fechaExamen;
private String cedulaMedico;



	/**
	* Default empty ExamenMedico constructor
	*/
	public ExamenMedico() {
		super();
	}

	/**
	* Default ExamenMedico constructor
	*/
	public ExamenMedico(String id, Empleado empleado, float peso, float talla, String presion, Date fechaExamen, String cedulaMedico) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.peso = peso;
		this.talla = talla;
		this.presion = presion;
		this.fechaExamen = fechaExamen;
		this.cedulaMedico = cedulaMedico;
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
	* Returns value of peso
	* @return
	*/
	public float getPeso() {
		return peso;
	}

	/**
	* Sets new value of peso
	* @param
	*/
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	* Returns value of talla
	* @return
	*/
	public float getTalla() {
		return talla;
	}

	/**
	* Sets new value of talla
	* @param
	*/
	public void setTalla(float talla) {
		this.talla = talla;
	}

	/**
	* Returns value of presion
	* @return
	*/
	public String getPresion() {
		return presion;
	}

	/**
	* Sets new value of presion
	* @param
	*/
	public void setPresion(String presion) {
		this.presion = presion;
	}

	/**
	* Returns value of fechaExamen
	* @return
	*/
	public Date getFechaExamen() {
		return fechaExamen;
	}

	/**
	* Sets new value of fechaExamen
	* @param
	*/
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	/**
	* Returns value of cedulaMedico
	* @return
	*/
	public String getCedulaMedico() {
		return cedulaMedico;
	}

	/**
	* Sets new value of cedulaMedico
	* @param
	*/
	public void setCedulaMedico(String cedulaMedico) {
		this.cedulaMedico = cedulaMedico;
	}
}
