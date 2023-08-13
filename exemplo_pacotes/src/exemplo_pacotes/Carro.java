package exemplo_pacotes;
public class Carro extends Veiculo{
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	private void confereCombustivel() {
		System.out.println("conferingo combustivel");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em P");
	}
}
