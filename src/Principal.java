
public class Principal {

	public static void main(String[] args) {
		Soma a = new Soma();
		a.setX(3);
		a.setY(7.4);
		System.out.println("A Soma é " + a.Adiciona());
		
		Subtracao b = new Subtracao();
		b.setX(10.5);
		b.setY(8.2);
		System.out.println("A diferença é: " + b.diminui());
		
		Multiplicar c = new Multiplicar();
		c.setX(2.8);
		c.setY(3.7);
		System.out.println("A multiplicação é : "+ c.mult());
		
		Divisao d = new Divisao();
		d.setX(9);
		d.setY(3);
		System.out.println("A divisão é "+ d.div());

	}

}
