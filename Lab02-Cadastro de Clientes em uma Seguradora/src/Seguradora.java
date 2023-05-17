import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seguradora {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	protected List <Sinistro> listaSinistros = new ArrayList<Sinistro>();
	protected List <Cliente> listaClientes = new ArrayList<Cliente>();
	
	//construtores
	public Seguradora(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaClientes = new ArrayList<Cliente>();

		
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Sinistro> getListSinistro() {
		return this.listaSinistros;
	}

	public void adicionaSinistro(Sinistro sinistro) {
		this.listaSinistros.add(sinistro);
	}
	public List<Cliente> getListaCliente() {
		return this.listaClientes;
	}

	public void adicionaCliente(Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	//Cadastrar Cliente
	
	
	public boolean cadastrarCliente(Cliente cliente) {
		List<Cliente> listaFiltrada = this.listaClientes.stream().filter(cte -> cte.obterIdentificador() == cliente.obterIdentificador()).collect(Collectors.toList());
		//System.out.println(listaFiltrada);
			if (listaFiltrada.size() == 0) {
			    this.adicionaCliente(cliente);
			return true;
			}
		return false;
	}
		
	//Remover Cliente
	public boolean removerCliente(String nome) {
		
		if (this.listaClientes.isEmpty()){
			return false;
		}
		else {
			for (Cliente percorre : this.listaClientes) {
				if (percorre.getNome().equals(nome)) {
					this.listaClientes.remove(percorre);
				return true;
				}
			}
			return false;
		}
	}
	
	//Listar Clientes
	public void listarClientes(String obterIdentificador) {
		if (this.listaClientes.isEmpty()){
			System.out.println("Sem clientes cadastrados");		
		}
		else {
			for (Cliente percorre : this.listaClientes) {
			System.out.println(percorre.toString());
			}
		}
	}
	//Gerar Sinistro
	public boolean geraSinistro(String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		Sinistro sinistro = new Sinistro( data, endereco,  seguradora,  veiculo, cliente);
		adicionaSinistro(sinistro);
		
		return true;
	}
	
	//Visualizar Sinistro
	public boolean visualizarSinistro(String cliente) {
		List<Sinistro> listaFiltrada = this.listaSinistros.stream().filter(cte -> cte.getCliente().getNome() == cliente).collect(Collectors.toList());
		if (!listaFiltrada.isEmpty()) {
			for (Sinistro sinistro : listaFiltrada) {
				System.out.println(sinistro.toString());
			}
		return true;
		}
		System.out.println("Nao ha Sinistros registrados para este Cliente");
	return false;
	}
	
	//Listar Sinistros
	public boolean listarSinistros() {
		for (Sinistro sinistro : this.listaSinistros) {
			System.out.println(sinistro.toString());
		}
		
		
		return true;
	}

	@Override
	public String toString() {
		return "Seguradora [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco
				+ ", listaSinistros=" + listaSinistros + ", listaClientes=" + listaClientes + "]";
	}
	
}
