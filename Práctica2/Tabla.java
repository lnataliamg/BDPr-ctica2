import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;
import com.csvreader.CsvReader;

public class Tabla{
	public void crearTablaEmpleado(){
		int n = 11;
		int m = 1;
		int j = m*n;
		try{

			String [] contenido = {"empleado","nombre", "apellidoP", "apellidoM", "fechaNacimiento","sexo","estudios","vehiculo","horario","licencia","examenMedico"};

			String ruta = "Empleados.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaVehiculo(){
		int n = 16;
		int m = 1;
		int j = n*m ; //j va a ser igual al número de atributos porque la tabla estará vacía

		try{

			String [] contenido = {"id","fechaInicio","reparacion","fechaIngresoRepa","razonRepa","fechaSalidaRepa","tipoCombustible","capacidadPasajero","asignadoTarejtaSIM","tarjetaSIM","tallerReparacion","empleados","tipoVehiculo","ruta","linea","sitio"};
			String ruta = "Vehiculo.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaTarjetaSIM(){
		int n = 5;
		int m = 1;
		int j = 5;
		try{

			String [] contenido = {"id","idVehículo","tipoDeRed","estaAsignado","fechaAsignacion"};

			String ruta = "TarjetaSIM.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void crearTablaLinea(){
		int n = 10;
		int m = 1;
		int j = n*m ; //j va a ser igual al número de atributos porque la tabla estará vacía

		try{

			String [] contenido = {"nombre","direccion","estacion","tipoTransporte","horarioLinea","tiempoEstimadoReparacion","disponibilidad","razonDisponibilidad","fechaDisponibilidad","tiempoEstimadoAbordar"};
			String ruta = "Linea.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaRuta(){
		int n = 8;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"paradas","direccion","tipoTransporte","horarioEstacion","tiempoEstimadoReparacion","razonDisponibilidad","fechaDisponibilidad","tiempoEstimadoAbordar"};
			String ruta = "Ruta.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaSitio(){
		int n = 4;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"numeroSitio","telefono","direccion","disponibilidad"};
			String ruta = "Sitio.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void crearTablaEstacion(){
		int n = 9	;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"nombre","direccion","linea","transportes","horarioEstacion","disponibilidad","razonDisponibilidad","fechaDisponibilidad","tiempoEstimadoAbordar"};
			String ruta = "Estacion.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaHorario(){
		int n = 3;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"empleado","horaEntrada","horaSalida"};
			String ruta = "Horario.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaLicencia(){
		int n = 11;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"empleado","id","nombre","apellidoP","apellidoM","antiguedad","expedicion","nacionalidad","vigencia","RFC","tipoLicencia"};
			String ruta = "Licencia.csv";
			File file = new File(ruta);

			if (!file.exists()) {
                file.createNewFile();
      }
			FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
      	int h = i+1;
        if (i > 0) {
          if ((i % (n)) == 0) {
            bw.write("\n");
          }
        }
        bw.write(contenido[i]);
        bw.write(",");
      }
      bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void crearTablaExamenMedico(){
		int n = 7;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"id", "empleado","peso","talla","presion","fechaExamen","cedulaMedico"};
			String ruta = "ExamenMedico.csv";
			File file = new File(ruta);

			if (!file.exists()) {
								file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
				int h = i+1;
				if (i > 0) {
					if ((i % (n)) == 0) {
						bw.write("\n");
					}
				}
				bw.write(contenido[i]);
				bw.write(",");
			}
			bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void Usuario(){
		int n = 9;
		int m = 1;
		int j = n*m;
		try{

			String [] contenido = {"usuario","nombre","apellidoP","apellidoM","contraseña","dineroActualCuenta","tipoPago","estacionCercana","tiempoLlegada"};
			String ruta = "ExamenMedico.csv";
			File file = new File(ruta);

			if (!file.exists()) {
								file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < contenido.length ; i++) {
				int h = i+1;
				if (i > 0) {
					if ((i % (n)) == 0) {
						bw.write("\n");
					}
				}
				bw.write(contenido[i]);
				bw.write(",");
			}
			bw.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void agregarEmpleado(Empleado empleado){
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce los/el nombre del empleado");
		String nombre = s.nextLine();

		System.out.println("Introduce el apellido paterno del empleado");
		String apellidoP = s.nextLine();

		System.out.println("Introduce el apellido materno del empleado");
		String apellidoM = s.nextLine();

		System.out.println("Introduce la fecha de nacimiento del empleado");
		String fechaNacimiento = s.nextLine();

		System.out.println("Introduce el sexo del empleado");
		String sexo= s.nextLine();

		System.out.println("Introduce el máximo grado de estudios del empleado");
		String estudios= s.nextLine();


		System.out.println("Introduce la placa del vehículo que manejará");
		String placa = s.nextLine();

		System.out.println("Introduce el horario que tendrá el empleado");
		String horario= s.nextLine();

		System.out.println("Introduce la licencia que tiene el empleado");
		String licencia= s.nextLine();

		System.out.println("Introduce el examen médico que se le aplicó al empleado");
		String examenMedico= s.nextLine();


		int n = 11;
		int m = 1;
		int j = m*n;
		try{
			CSVWriter writer = new CSVWriter(new FileWriter("Empleado.csv"));
			List<String[]> data = new ArrayList<String[]>();
			data.add(new String[]{"id", nombre,apellidoP,apellidoM,fechaNacimiento, sexo, estudios,placa,horario,licencia,examenMedico});

			writer.writeAll(data);
			writer.close();

		}catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	public static void main(String[] args) {
		Tabla tabla = new Tabla();
		tabla.crearTablaEmpleado();
		tabla.crearTablaVehiculo();
	}
}
