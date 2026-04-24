package ENTOR_EVA;

public class Main {
	
public static void main(String[] args) {
		
		Producto p = new Producto("Teclado",20,2.0);
		
		p.aumentarCantidad(-50);
		p.quitarCantidad(10);
		System.out.println(p.toString());
		System.out.println("Total:"+p.calcularValorTotal());
		
		
		Producto p1 = new Producto("Raton",10,15.5);
		p.aumentarCantidad(-100);
		
	}
}
