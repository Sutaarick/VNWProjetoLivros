import java.util.Date;

public class Livro {
	
	String nome;
	String Autor;
	Date dataDePublicacao;
	boolean alugado;
	
	public Livro() {
		
	}
	
	public Livro(String nome, String autor, Date dataDePublicacao, boolean alugado) {
		super();
		this.nome = nome;
		Autor = autor;
		this.dataDePublicacao = dataDePublicacao;
		this.alugado = alugado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public Date getDataDePublicacao() {
		return dataDePublicacao;
	}

	public void setDataDePublicacao(Date dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

    @Override
	public String toString() {
		return "Livro [Nome do livro: " + nome + ", nome do autor: " + Autor + ", data de publicação: " + dataDePublicacao + ", alugado: "
				+ alugado + "]";
	}
	
	
}