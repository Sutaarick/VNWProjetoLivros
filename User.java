
public class User {

	private String nome;
	private String cpf;
	private String telefone;
	private boolean cadastrado;
	
	public User(String nome, String cpf, String telefone, boolean cadastrado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cadastrado = cadastrado;
	}
	
	public User() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	public boolean isCadastrado() {
		return cadastrado;
	}

	public void setCadastrado(boolean cadastrado) {
		this.cadastrado = cadastrado;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +  "cpf: " + cpf + "\n" +  "telefone: " + telefone + "\n" + "Cadastrado: " + cadastrado + "\n";
	}
	
	
}
