import java.util.ArrayList;
import java.util.List;

public class Cliente {
	protected String nome;
	protected String endereco;
	protected String dataLicenca;
	protected String educacao;
	protected String genero;
	protected String classeEconomica;
	protected List <Veiculo> listaVeiculos;
	
	//metodos construtores
	public Cliente(String nome, String endereco, String dataLicenca, String educacao, String genero, String classeEconomica) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.genero = genero;
		this.classeEconomica = classeEconomica;
		this.listaVeiculos = new ArrayList<Veiculo>();
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataLicenca() {
		return dataLicenca;
	}

	public void setDataLicenca(String dataLicenca) {
		this.dataLicenca = dataLicenca;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public List<Veiculo> getListaVeiculo() {
		return listaVeiculos;
	}

	public void adicionaVeiculo(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
	}
	
	public String obterIdentificador() {
		return "";
	}
	
	
	// toString
	
	@Override
	public String toString() {
		return "Nome: " + this.nome +
				"\nEndereco: " + this.endereco +
				"\nData de Licenca: " + this.dataLicenca +
				"\nEducacao : " + this.educacao + 
				"\nGenero: " + this.genero +
				"\n Classe Economica: " + this.classeEconomica +
				"\n Veiculos: " + this.listaVeiculos + "\n";
	}
	
}
	