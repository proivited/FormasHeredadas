
public class Triangulo extends Figuras {

	
	float altura;
	
	
	@Override
	public float area() {
		return (lado * altura) / 2;
	}
}
