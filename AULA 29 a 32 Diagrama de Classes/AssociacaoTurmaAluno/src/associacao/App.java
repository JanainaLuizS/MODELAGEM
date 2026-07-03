package associacao;

public class App {

	public static void main(String[] args) {
		
		       Turma turma = new Turma("Tec26", "Tec. Desenvolvimento de Sistemas");

		        Aluno aluno1 = new Aluno("202601", "Maria");
		        Aluno aluno2 = new Aluno("202602", "João");
		        Aluno aluno3 = new Aluno("202603", "Ana");

		        turma.adicionarAluno(aluno1);
		        turma.adicionarAluno(aluno2);
		        turma.adicionarAluno(aluno3);

		        turma.listarAlunos();
		    }
		}
	
