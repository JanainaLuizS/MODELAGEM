package associacao;

public class Cliente {
	
	    private String nome;
	    private String cpf;

	    public Cliente(String nome, String cpf) {
	        this.nome = nome;
	        this.cpf = cpf;
	    }

	    public void atualizarNome(String novoNome) {
	        this.nome = novoNome;
	    }

	    public void exibirDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + cpf);
	    }

	    // Getters
	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }
	}

