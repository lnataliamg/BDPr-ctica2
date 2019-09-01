import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public class Empleado{
private String id;
private String nombre;
private String apellidoP;
private String apellidoM;
private Date fechaNacimiento;
private String sexo;
private String estudios;
private Vehiculo vehiculo;
private Horario horario;
private Licencia licencia;
private ExamenMedico examenMedico;

/**
* Default empty Empleado constructor
*/
public Empleado() {
  super();
}

/**
* Default Empleado constructor
*/
public Empleado(String id, String nombre, String apellidoP, String apellidoM, Date fechaNacimiento, String sexo, String estudios, Vehiculo vehiculo, Horario horario, Licencia licencia, ExamenMedico examenMedico) {
  super();
  this.id = id;
  this.nombre = nombre;
  this.apellidoP = apellidoP;
  this.apellidoM = apellidoM;
  this.fechaNacimiento = fechaNacimiento;
  this.sexo = sexo;
  this.estudios = estudios;
  this.vehiculo = vehiculo;
  this.horario = horario;
  this.licencia = licencia;
  this.examenMedico = examenMedico;
}

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
	* Returns value of apellidoM
	* @return
	*/
	public String getApellidoM() {
		return apellidoM;
	}

	/**
	* Sets new value of apellidoM
	* @param
	*/
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	/**
	* Returns value of fechaNacimiento
	* @return
	*/
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	* Sets new value of fechaNacimiento
	* @param
	*/
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	* Returns value of sexo
	* @return
	*/
	public String getSexo() {
		return sexo;
	}

	/**
	* Sets new value of sexo
	* @param
	*/
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	* Returns value of estudios
	* @return
	*/
	public String getEstudios() {
		return estudios;
	}

	/**
	* Sets new value of estudios
	* @param
	*/
	public void setEstudios(String estudios) {
		this.estudios = estudios;
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
	* Returns value of horario
	* @return
	*/
	public Horario getHorario() {
		return horario;
	}

	/**
	* Sets new value of horario
	* @param
	*/
	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	/**
	* Returns value of licencia
	* @return
	*/
	public Licencia getLicencia() {
		return licencia;
	}

	/**
	* Sets new value of licencia
	* @param
	*/
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	/**
	* Returns value of examenMedico
	* @return
	*/
	public ExamenMedico getExamenMedico() {
		return examenMedico;
	}

	/**
	* Sets new value of examenMedico
	* @param
	*/
	public void setExamenMedico(ExamenMedico examenMedico) {
		this.examenMedico = examenMedico;
	}

	/**
	* Create string representation of Empleado for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", estudios=" + estudios + ", vehiculo=" + vehiculo + ", horario=" + horario + ", licencia=" + licencia + ", examenMedico=" + examenMedico + "]";
	}

}
