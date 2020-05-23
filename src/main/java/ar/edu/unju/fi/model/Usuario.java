package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa un usuario socio de algun estadio con su respectivos
 * parametros: id, nombre, apellido fecha de nacimiento. dni,fecha de alta tipo
 * de usuario y contraseña
 * 
 * @author Josue Dario Alfaro
 *
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Usuario {
	/*
	 * --------Atributos--------
	 * 
	 */

	/**
	 * Atributo que representa el id de cada usuario
	 */
	private long id;
	/**
	 * Atributo que representa el nombre del usuario
	 */
	private String nombre;
	/**
	 * Atributo que representa el apellido del usuario
	 */
	private String apellido;
	/**
	 * Atributo que representa la fecha de nacimiento
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Atributo que representa su direccion de residencia
	 */
	private String direccion;
	/**
	 * Atributo que representa el numero de dni del usuario
	 */
	private long dni;
	/**
	 * Atributo que representa la fecha de alta como socio
	 */
	private LocalDate fechaAlta;
	/**
	 * Atributo que representa el tipo de usuario
	 */
	private String tipo;
	/**
	 * Atributo que representa su contraseña
	 */
	private String password;

	/*
	 * ---------Constructores---------
	 * 
	 */

	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Contructor Parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param id              valor asignado a la variable miembro id
	 * @param nombre          valor asignado a la variable miembro nombre
	 * @param apellido        valor asignado a la variable miembro apellido
	 * @param fechaNacimiento valor asignado a la variable miembro fechaNacimiento
	 * @param direccion       valor asignado a la variable miembro direccion
	 * @param dni             valor asignado a la variable miembro dni
	 * @param fechaAlta       valor asignado a la variable miembro fechaAlta
	 * @param tipo            valor asignado a la variable miembro tipo
	 * @param password        valor asignado a la variable miembro password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}

	/*
	 * -------Metodos Accesores------
	 * 
	 */

	/**
	 * Devuelve el valor que tiene asignado la variable miembro id
	 * 
	 * @return el valor de la variable id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Asigna un valor a la variable miembro id
	 * 
	 * @param id con el valor para la variable miembro privada id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro nombre
	 * 
	 * @return el valor de la variable nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor a la variable miembro nombre
	 * 
	 * @param nombre con el valor para la variable miembro privada nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro apellido
	 * 
	 * @return el valor de la variable apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Asigna un valor a la variable miembro apellido
	 * 
	 * @param apellido con el valor para la variable miembro privada apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro fechaNacimiento
	 * 
	 * @return el valor de la variable fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Asigna un valor a la variable miembro fechaNacimiento
	 * 
	 * @param fechaNacimiento con el valor para la variable miembro privada
	 *                        fechaNacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro direccion
	 * 
	 * @return el valor de la variable direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la variable miembro direccion
	 * 
	 * @param direccion con el valor para la variable miembro privada direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro dni
	 * 
	 * @return el valor de la variable dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * Asigna un valor a la variable miembro dni
	 * 
	 * @param dni con el valor para la variable miembro privada dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro fechaAlta
	 * 
	 * @return el valor de la variable fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Asigna un valor a la variable miembro fechaAlta
	 * 
	 * @param fechaAlta con el valor para la variable miembro privada fechaAlta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro tipo
	 * 
	 * @return el valor de la variable tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Asigna un valor a la variable miembro tipo
	 * 
	 * @param tipo con el valor para la variable miembro privada tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro password
	 * 
	 * @return el valor de la variable password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Asigna un valor a la variable miembro password
	 * 
	 * @param password con el valor para la variable miembro privada password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Sobreescribe el metodo para mostrar los datos del usuario, id, nombre y
	 * apellido, fecha de nacimiento, direccion, dni, fecha del alta, el tipo de
	 * socio y su password
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}

}
