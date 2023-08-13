package exemplo_pacotes;


public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("478455");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("4657754");
		z400.ligar();
	}
}
