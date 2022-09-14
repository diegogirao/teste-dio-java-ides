
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando");
		
		int idade = 18;
		int quantidadePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, "
						+ "pois esta acompanhado");
			} else {
				System.out.println("Infelizmente não pode entrar.");
			}
		}
	}
}
