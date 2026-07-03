package associacao;

	import java.util.ArrayList;
	import java.util.List;

	public class Turma {

	    private String codigo;
	    private String nome;
	    private List<Aluno> alunos;

	    public Turma(String codigo, String nome) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.alunos = new ArrayList<>();
	    }

	    public void adicionarAluno(Aluno aluno) {
	        alunos.add(aluno);
	    }

	    public void removerAluno(Aluno aluno) {
	        alunos.remove(aluno);
	    }

	    public void listarAlunos() {
	        System.out.println("Turma: " + nome);
	        System.out.println("Código: " + codigo);
	        System.out.println("Lista de alunos:");

	        for (Aluno aluno : alunos) {
	            aluno.exibirDados();
	            
	        }
	    }
	}


