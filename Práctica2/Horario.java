import java.util.Date;
import java.text.SimpleDateFormat;

public class Horario{
private Empleado empleado;
private Date horaEntrada;
private Date horaSalida;


	/**
	* Default empty Horario constructor
	*/
	public Horario() {
		super();
	}

	/**
	* Default Horario constructor
	*/
	public Horario(Empleado empleado, Date horaEntrada, Date horaSalida) {
		super();
		this.empleado = empleado;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	/**
	* Sets new value of empleado
	* @param
	*/
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	/**
	* Returns value of horaEntrada
	* @return
	*/
	public Date getHoraEntrada() {
		return horaEntrada;
	}

	/**
	* Sets new value of horaEntrada
	* @param
	*/
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	/**
	* Returns value of horaSalida
	* @return
	*/
	public Date getHoraSalida() {
		return horaSalida;
	}

	/**
	* Sets new value of horaSalida
	* @param
	*/
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
}
