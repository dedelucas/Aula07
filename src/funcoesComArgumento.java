import java.util.Scanner;

public class funcoesComArgumento {
	//public static String nome; //Declarar um variavel global
	public static void exibirMensagem() {
		System.out.println("Hoje é um belo dia!");
	}
	
	public static void exibirSaudacao(String nome) {
		System.out.println("Bom dia, " + nome);
	}

	public static void main(String[] args) {
		String nomeMain;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nomeMain = leitor.next();
		
		String nomes[] = {"Elton", "Felipe", "Ricardo", "Thalita", "Jose", "Karen"};
		for(int i=o; i<nomes.length; i++) {
			
		}
		
		System.out.println("Mensagem da main antes de chamar a função");
		exibirMensagem();
		System.out.println("Mensagem da main depois de chamar a função");
		exibirSaudacao(nomeMain);
		leitor.close();

	}

}
