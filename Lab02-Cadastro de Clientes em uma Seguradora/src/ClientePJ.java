

public class ClientePJ extends Cliente {
	private final String cnpj;
	private String dataFundacao;
	
	public ClientePJ(String nome, String endereco, String dataLicenca, String educacao, String genero, String classeEconomica, String cnpj, String dataFundacao ) {
		
		super(nome, endereco, dataLicenca, educacao, genero, classeEconomica);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	/*public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}*/

	public String getDataFundacao() {
		return dataFundacao;
	}
	
	public String obterIdentificador() {
		return cnpj;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	//funcao validar cnpj
	public boolean validarCNPJ(String cnpj) {
		cnpj = cnpj.replaceAll("[.]","");
		cnpj = cnpj.replaceAll("[-]","");
		cnpj = cnpj.replaceAll("[/]","");
		//apenas os numeros
		
		//System.out.println(cnpj+"\n");
		 
		 // verifica se possui 14 digitos
		 
		 if (cnpj.length()!= 14)
			 return false;
		 
		 // verifica se os 14 digitos são iguais
		 
		 if (cnpj.equals("00000000000000")||cnpj.equals("11111111111111")|| cnpj.equals("22222222222222")||cnpj.equals("33333333333333")||cnpj.equals("44444444444444")||cnpj.equals("55555555555555")||cnpj.equals("66666666666666")||cnpj.equals("77777777777777")||cnpj.equals("88888888888888")||cnpj.equals("99999999999999"))
			 return false;
		 				 	
		 //ultimos digitos do cnpj para verificacao
		 String digitosCnpj = cnpj.substring(cnpj.length()-2, cnpj.length());
		 //System.out.println(digitosCnpj+"\n");
		 // calcula os digitos verificadores do cnpj 

		 int dig1 = 0;
		 int dig2 = 0;
		 int n = 0;
		 int peso = 5;
		
		// mudar a funcao
		 for (int i = 0; i<cnpj.length()-2; i++) {
			//percorre individuos da string cnpj e transforma em objetos do tipo Integer, e depois para int
			n = Integer.valueOf(cnpj.substring(i, i+1)).intValue();
			//multiplica o 1º int do cnpj por 5, o 2º por 4...
			dig1 = n*(peso)+ dig1;
			peso = peso - 1;
			//System.out.println(dig1+"\n");
			//quando o peso for 1, retorna a 9
			if (peso <=1)
			peso = 9;
		 }
		 int peso2 = 6;
		 for (int i = 0; i<cnpj.length()-1; i++) {
				//percorre individuos da string cnpj e transforma em objetos do tipo Integer, e depois para int
				n = Integer.valueOf(cnpj.substring(i, i+1)).intValue();
				//multiplica o 1º int do cnpj por 6, o 2º por 5...
				dig2 = n*(peso2)+ dig2;
				peso2 = peso2 - 1;
				//System.out.println(dig2+"\n");
				
				//quando o peso for 10, retorna a 2
				if (peso2 <=1)
					peso2 = 9;
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
		 resto = dig2%11;
		 if (resto <= 1)
			verificador2 = 0;
		 else
			verificador2 = 11 - resto;
		
		 // juntando os dois verificadores em uma string
		 String verificadores = String.valueOf(verificador1) + String.valueOf(verificador2);
		 //System.out.println(verificadores+"\n");
		 // verifica se os digitos verifiadores encontrados e os do cnpj original conferem, retornando um booleano
		 return digitosCnpj.equals(verificadores);
		
		}
	//metodo toString
	@Override
	public String toString() {
		return "CNPJ: " + this.cnpj + 
				"\nData de Fundacao: " + this.dataFundacao + "\n";
	}
}
