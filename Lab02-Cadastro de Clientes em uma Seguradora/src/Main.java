

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner de dados do teclado para interagir com um menu textual

		
		// cadastrar dois clientepf e um cliente pj
		ClientePF cPF1 = new ClientePF("Pedro", "Rua dos bobos n0", "2021/11/20", "Ensino Medio Completo", "Masculino", "Classe Media", "494.829.430-66","15/02/1970");
		ClientePF cPF2 = new ClientePF("Bino", "Rua Cilada n30", "2004/09/15", "Ensino Fundamental Completo", "Masculino", "Classe Media-baixa","504.056.330-25","21/06/1965");
		ClientePJ cPJ1 = new ClientePJ("sr. Joaquim", "Av: Faria Lima n521", "2018/07/12", "Ensino Superior Completo", "Masculino", "Classe Media-Alta", "12.345.678/0001-95","04/11/1958");

		//instanciar uma seguradora
		Seguradora s1 = new Seguradora("SP Seguro Auto","0800 884 8866","spseguros@auto.br","Rua Haddock Lobo, 354 Sao Paulo"); 
		
		//cadastrar os tres clientes na seguradora
		boolean cadastrocPF1 = s1.cadastrarCliente(cPF1);
			if (cadastrocPF1 == true) {
				System.out.println("O cliente"+cPF1.getNome()+"foi cadastrado com sucesso!");
			}
			else {
				System.out.println("erro ao cadastrar");
			}
		boolean cadastrocPF2 = s1.cadastrarCliente(cPF2);
			if (cadastrocPF2 == true) {
				System.out.println("O cliente"+cPF2.getNome()+"foi cadastrado com sucesso!");
			}
			else {
					System.out.println("erro ao cadastrar");
			}
		boolean cadastrocPJ1 = s1.cadastrarCliente(cPJ1);
			if (cadastrocPJ1 == true) {
				System.out.println("O cliente"+cPJ1.getNome()+"foi cadastrado com sucesso!");
			}
			else {
					System.out.println("erro ao cadastrar");
			}
		// remover um cliente pf
		s1.removerCliente("Bino");
		
		// funcao validar cpf e cnpj
		
		if (!cPF1.validarCPF(cPF1.getCpf())) {
			System.out.println("erro cpf");
		}
		if (!cPJ1.validarCNPJ(cPJ1.getCnpj())){
			System.out.println("erro cnpj");
		}
		
		
		//cadastro veiculos
		Veiculo veiculo1 = new Veiculo ("CVY-7526","GM","Prisma",2012);
		Veiculo veiculo2 = new Veiculo ("FPM-1687","VW","Polo",2017);
		Veiculo veiculo3 = new Veiculo ("BJI-9640","Jeep","Compass",2022);
		Veiculo veiculo4 = new Veiculo ("BKL-8094","Mercedes-Benz","L1113",1986);
		
		//adicionar um veiculo para cada cliente
		
		//listaVeiculoscPF1.add(veiculo1);
		//listaVeiculoscPJ1.add(veiculo2);
		//listaVeiculoscPJ1.add(veiculo3);
		//listaVeiculoscPF2.add(veiculo4);
		
		cPF1.adicionaVeiculo (veiculo1);
		cPF2.adicionaVeiculo (veiculo4);
		cPJ1.adicionaVeiculo (veiculo2);
		cPJ1.adicionaVeiculo (veiculo3);

	
		//gerar 1 sinistro
		s1.geraSinistro("15/07/2022", "rua dois", s1 ,veiculo1, cPF1);
		
		//chamar o metodo toString() de cada classe
		cPF1.toString();
		cPF2.toString();
		cPJ1.toString();
		veiculo1.toString();
		veiculo2.toString();
		veiculo3.toString();
		veiculo4.toString();
		s1.toString();
		//chamar os métodos listarClientes(String Cliente), visualizarSinistro(String cliente) e listarSinistros() da classe Seguradora
		System.out.println("------------------------------------------------------------");
		s1.listarClientes("Pedro");
		//visualizarSinistro(String cliente)
		System.out.println("------------------------------------------------------------");
		s1.visualizarSinistro("Pedro");
		System.out.println("------------------------------------------------------------");
		s1.listarSinistros();
		
		
	}
}

