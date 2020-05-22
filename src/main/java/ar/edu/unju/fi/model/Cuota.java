package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Cuota {

	private long id;
	private LocalDate fechaPago;
	private String period;
	private double monto;
	private String estado;
	private Usuario usuario;

	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	public Cuota(long id, LocalDate fechaPago, String period, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.period = period;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", period=" + period + ", monto=" + monto + ", estado="
				+ estado + ", usuario=" + usuario + "]";
	}

}
