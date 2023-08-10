
public class SistemaCadastro {
	public static void main(String[] args) {
		//Criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("345874", "Fernandopolis");
		
		//definimos o endereço de marcos
		marcos.setEndereco("Rua DAS MARIAS");
		
		//e como definir o nome e cpf do marcos?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
