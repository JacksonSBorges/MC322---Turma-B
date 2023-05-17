
public class Sinistro {
	private int id;
	private String data;
	private String endereco;
	Seguradora seguradora;
	Veiculo veiculo;
	Cliente cliente;
	
	
	//construtores
	public Sinistro(String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		// função de atribuição de ID´s unicos
		this.id = (int) (Math.random() * 1000000 + 1);
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		
	}
	//getters e setters
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Seguradora getSeguradora() {
		return seguradora;
	}
	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	//metodo toString
	@Override
	public String toString() {
		return "Numero de Identificacao: " + this.id + 
			"\nData do Sinistro: " + this.data +
			"\nEndereco do Sinistro: " + this.endereco + 
			"\nSeguradora responsavel: " + this.seguradora.getNome()+
			"\nPlaca do Veiculo: " +this.veiculo.getPlaca()+
			"\nCliente: " +this.cliente.getNome()+ "\n";
			
	}
}
