
public class Principal {

	public static void main(String[] args) {
		Soma a = new Soma();
		a.setX(3);
		a.setY(7.4);
		System.out.println("A Soma � " + a.Adiciona());
		
		Subtracao b = new Subtracao();
		b.setX(10.5);
		b.setY(8.2);
		System.out.println("A diferen�a �: " + b.diminui());
		
		Multiplicar c = new Multiplicar();
		c.setX(2.8);
		c.setY(3.7);
		System.out.println("A multiplica��o � : "+ c.mult());
		
		Divisao d = new Divisao();
		d.setX(9);
		d.setY(3);
		System.out.println("A divis�o � "+ d.div());

	}

}
