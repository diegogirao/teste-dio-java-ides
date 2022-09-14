
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando");

		int idade = 20;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhando = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("Infelizmente não pode entrar.");
		}
	}
}