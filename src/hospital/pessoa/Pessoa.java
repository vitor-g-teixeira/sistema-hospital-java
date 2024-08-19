package hospital.pessoa;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	
	protected Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNascimento() {
		return this.dataNascimento;
	}
}
