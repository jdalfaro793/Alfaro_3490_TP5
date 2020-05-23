package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa el pago de la cuota del usuario en una fecha
 * determinada, su periodo, el monto pagado y el estado
 * 
 * @author Josue Dario Alfaro
 *
 */

/*
 * Estereotipo general @Component, para marcar la clase como un bean de spring y
 * se utilice como uno de sus objetos
 */
@Component
public class Cuota {

	/*
	 * ------Atributos------
	 */

	/**
	 * Atributo que representa el id de la transaccion
	 */
	private long id;
	/**
	 * Atributo que representa la fecha de pago
	 */
	private LocalDate fechaPago;
	/**
	 * Atributo que representa el periodo
	 */
	private String period;
	/**
	 * Atributo que representa el monto pagado
	 */
	private double monto;
	/**
	 * Atributo que representa el estado
	 */
	private String estado;
	/**
	 * Atributo que representa el usuario
	 */

	/*
	 * Anotación @Autowired para aplicar la inyección de dependencia en el objeto
	 * socio.
	 */
	@Autowired
	private Usuario usuario;

	/*
	 * ------Constructores------
	 *
	 */

	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado que recibe los siguientes datos como parametros
	 * 
	 * @param id        valor asignado a la variable miembro id
	 * @param fechaPago valor asignado a la variable miembro fechaPago
	 * @param period    valor asignado a la variable miembro period
	 * @param monto     valor asignado a la variable miembro monto
	 * @param estado    valor asignado a la variable miembro estado
	 * @param usuario   valor asignado a la variable miembro usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String period, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.period = period;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	/*
	 * -------Metodos Accesores-------
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
	 * Devuelve el valor que tiene asignado la variable miembro fechaPago
	 * 
	 * @return el valor de la variable fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Asigna un valor a la variable miembro fechaPago
	 * 
	 * @param fechaPago con el valor para la variable miembro privada fechaPago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro period
	 * 
	 * @return el valor de la variable period
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * Asigna un valor a la variable miembro period
	 * 
	 * @param period con el valor para la variable miembro privada period
	 */
	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro monto
	 * 
	 * @return el valor de la variable monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Asigna un valor a la variable miembro monto
	 * 
	 * @param monto con el valor para la variable miembro privada monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro estado
	 * 
	 * @return el valor de la variable estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Asigna un valor a la variable miembro estado
	 * 
	 * @param estado con el valor para la variable miembro privada estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el valor que tiene asignado la variable miembro usuario
	 * 
	 * @return el valor de la variable usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Asigna un valor a la variable miembro usuario
	 * 
	 * @param usuario con el valor para la variable miembro privada usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Sobreescribe el metodo para mostrar el id, la fecha de pago, el periodo de
	 * pago, el monto pagado, el estado de la transaccion y el usuario
	 * correspondiente
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", period=" + period + ", monto=" + monto + ", estado="
				+ estado + ", usuario=" + usuario + "]";
	}

}
