package ENTOR_EVA;

public class Producto {

	private String nombre;
	private int cantidad;
	private double precio;

	public Producto(String nombre, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void aumentarCantidad(int cantidadExtra) {
		if (cantidadExtra > 0) {
			this.cantidad += cantidadExtra;
		}
	}

	public void quitarCantidad(int cantidadEliminar) {
		if (cantidadEliminar > 0 && cantidadEliminar <= this.cantidad) {
			this.cantidad -= cantidadEliminar;
		}

	}

	public double calcularValorTotal() {
		return cantidad * precio;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "";
	}
}
