import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mensagem inicial
		System.out.println("Seja bem vindo!"+"\n"+"Antes de continuarmos o atendimento necessitamos de algumas informacoes do usuario."+"\n"+"Por gentileza, insira seu nome completo:");
		
		try (//funcao que escaneia uma entrada e armazena em suas respectivas variaveis
		Scanner input = new Scanner(System.in)) {
			String nome = input.nextLine();
			System.out.println("Seu CPF:");
			String cpf = input.nextLine();
			System.out.println("Sua data de nascimento:");
			String nascimento = input.nextLine();
			System.out.println("Sua idade:");
			int idade = input.nextInt();
			System.out.println("E seu endereço:");
			String endereco = input.next();
			
			//funcao que verifica se o cpf inserido é valido ou nao, por meio do metodo validar cpf e armazena o booleano retornado na variavel decisao
			Cliente Cliente1 = new Cliente(nome,cpf,nascimento,idade,endereco);
			boolean decisao = Cliente1.validarCPF(cpf);
			
			//print da decisao em seus dois cenarios possiveis
			if (decisao == false)
				System.out.println("o cpf: "+cpf+" de: "+nome+" é inválido");
			
			else
				System.out.println("o cpf: "+cpf+" de: "+nome+" é válido");
		}
	}

}
