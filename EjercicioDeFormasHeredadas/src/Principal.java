
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado();
		System.out.println(cuadrado.titulo());
		cuadrado.lado = 5;
		System.out.println("del cuadrado: " + cuadrado.area());
		
		Triangulo triangulo = new Triangulo();
		triangulo.lado = 5;
		triangulo.altura = 8;
		System.out.println("del triangulo: " + triangulo.area());
		
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.lado = 5;
		rectangulo.lado2 = 3;
		System.out.println("del rectangulo: " + rectangulo.area());
	}

}
