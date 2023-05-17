
public class ClientePF extends Cliente {
	private final String cpf;
	private String dataNascimento;
	
	//metodos construtores
	public ClientePF(String nome, String endereco, String dataLicenca, String educacao, String genero, String classeEconomica, String cpf, String dataNascimento ) {
		
		super(nome, endereco, dataLicenca, educacao, genero, classeEconomica);
	
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	// getters e setters
	public String getCpf() {
		return this.cpf;
	}

	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String obterIdentificador() {
		return cpf;
	}
	
	// metodo validar CPF
	public boolean validarCPF(String cpf) {
		 cpf = cpf.replaceAll("[.]","");
		 cpf = cpf.replaceAll("[-]",""); //apenas os numeros
		//System.out.println(cpf+"\n");
		 
		 // verifica se possui 11 digitos
		 
		 if (cpf.length()!= 11)
			 return false;
		 
		 // verifica se os 11 digitos são iguais
		 
		 if (cpf.equals("00000000000")||cpf.equals("11111111111")|| cpf.equals("22222222222")||cpf.equals("33333333333")||cpf.equals("44444444444")||cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")||cpf.equals("88888888888")||cpf.equals("99999999999"))
			 return false;
		 				 	
		 // calcula os digitos verificadores do cpf 

		 int dig1 = 0;
		 int dig2 = 0;
		 int n = 0;
		
		 //ultimos digitos do cpf para verificacao
		 String digitosCpf = cpf.substring(cpf.length()-2, cpf.length());
		
		 for (int i = 1; i<cpf.length()-1; i++) {
			//percorre individuos da string cpf e transforma em objetos do tipo Integer, e depois para int
			n = Integer.valueOf(cpf.substring(i-1, i)).intValue();
			//multiplica o primeiro int do cpf por 10, o segundo por 9...
			dig1 = n*(11 - i)+ dig1;
			//analogo ao anterior, adicionando o ultimo digito 
			dig2 = n*(12-i)+ dig2;
		 }
		 //variaveis para guardar os valores dos calculos 
		 int resto = 0;
		 int verificador1 = 0;
		 int verificador2 = 0;
		
		 // calculo do digito de verificação 1
		 resto = dig1%11;
		 if (resto <= 1)
			verificador1 = 0;
		 else
			verificador1 = 11 - resto;
		
		 // calculo do digito de verificação 2
		 dig2 += 2*verificador1;
		 resto = dig2%11;
		 if (resto <= 1)
			verificador2 = 0;
		 else
			verificador2 = 11 - resto;
		
		 // juntando os dois verificadores em uma string
		 String verificadores = String.valueOf(verificador1) + String.valueOf(verificador2);
		 
		 // verifica se os digitos verifiadores encontrados e os do cpf original conferem, retornando um booleano
		 return digitosCpf.equals(verificadores);
		
		}
	// metodo toString
	@Override
	public String toString() {
		return "CPF: " + this.cpf + 
				"\nData de Nascimento: " + this.dataNascimento + "\n";
	}
	
	
}
	
