package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa los resultados de un partido entre 2 equipos, la fecha
 * del partido, y el resultado de cada uno
 * 
 * @author Josue Dario Alfaro
 *
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Resultado {
	/*
	 * --------Atributos--------
	 * 
	 */

	/**
	 * Atributo que representa la fecha del partido
	 */
	private LocalDate fecha;
	/**
	 * Atributo que representa el nombre del primer equipo
	 */

	/*
	 * Anotación @Autowired para aplicar la inyección de dependencia en el objeto
	 * socio.
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Atributo que representa el nombre del segundo equipo
	 */

	/*
	 * Anotación @Autowired para aplicar la inyección de dependencia en el objeto
	 * socio.
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Atributo que representa los goles marcados por el primer equipo
	 */
	private int golesEquipo1;
	/**
	 * Atributo que representa los goles marcados por el segundo equipo
	 */
	private int golesEquipo2;

	/*
	 * ---------Constructores---------
	 * 
	 */

	/**
	 * Constructor por defecto
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param fecha        valor asignado a la variable miembro fecha
	 * @param equipo1      valor asignado a la variable miembro equipo1
	 * @param equipo2      valor asignado a la variable miembro equipo2
	 * @param golesEquipo1 valor asignado a la variable miembro golesEquipo1
	 * @param golesEquipo2 valor asignado a la variable miembro golesEquipo2
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	/*
	 * -------Metodos Accesores------
	 * 
	 */

	/**
	 * Devuelve el valor que tiene asignado la variable miembro fecha
	 * 
	 * @return el valor de la variable fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la variable miembro fecha
	 * 
	 * @param fecha con el valor para la variable miembro privada fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro equipo1
	 * 
	 * @return el valor de la variable equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * Asigna un valor a la variable miembro equipo1
	 * 
	 * @param equipo1 con el valor para la variable miembro privada equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro equipo2
	 * 
	 * @return el valor de la variable equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * Asigna un valor a la variable miembro equipo2
	 * 
	 * @param equipo2 con el valor para la variable miembro privada equipo2
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro golesEquipo1
	 * 
	 * @return el valor de la variable golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * Asigna un valor a la variable miembro golesEquipo1
	 * 
	 * @param golesEquipo1 con el valor para la variable miembro privada
	 *                     golesEquipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro golesEquipo2
	 * 
	 * @return el valor de la variable golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * Asigna un valor a la variable miembro golesEquipo2
	 * 
	 * @param golesEquipo2 con el valor para la variable miembro privada
	 *                     golesEquipo2
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	/**
	 * Sobreescribe el metodo para mostrar la fecha del partido, el nombre de cada
	 * equipo y su resultado
	 */
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}

}
