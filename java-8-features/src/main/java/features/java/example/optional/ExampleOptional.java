package features.java.example.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Curso{
	private String nome;
	private List<Aluno> listAluno;
	
	public Curso(String nome) {
		this.nome = nome;
		this.listAluno =  new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListAluno() {
		return listAluno;
	}

	public void setListAluno(List<Aluno> listAluno) {
		this.listAluno = listAluno;
	}
	
}

class Aluno{
	private Optional<Matricula> matricula;
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
		this.matricula = Optional.empty();
	}

	public Optional<Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = Optional.of(matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

class Matricula {
	private String numero;
	
	public Matricula(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}

public class ExampleOptional {

	public static void main (String[] args) {
		Curso curso = new Curso("ADS");
		
		Aluno jose = new Aluno("jose");
		jose.setMatricula(new Matricula("999"));
		curso.getListAluno().add(jose);
		
		Aluno maria = new Aluno("maria");
		maria.setMatricula(new Matricula("239"));
		curso.getListAluno().add(maria);
		
		Aluno ana = new Aluno("ana");
		//jose.setMatricula(new Matricula("123"));
		curso.getListAluno().add(ana);
		
		Aluno joao = new Aluno("joao");
		joao.setMatricula(new Matricula("564"));
		curso.getListAluno().add(joao);
		
		//curso.getListAluno().forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().getNumero()));
		curso.getListAluno().stream()
							.filter(a -> a.getMatricula().isPresent())
							.forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));
	}
	
}
