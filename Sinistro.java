
public class Sinistro {
	private int id;
	private String data;
	private String endereco;
	static int geraID = 0;
	
	//construtores
	public Sinistro(int id, String data, String endereco) {
		this.id = id;
		this.data = data;
		this.endereco = endereco;
		
		// função de atribuição de ID´s unicos
		geraID = geraID + 1;
		id = geraID;
	}
	//getters e setters
	public int getId() {
		return id;
	}

	public void setId() {
		
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
	
}
