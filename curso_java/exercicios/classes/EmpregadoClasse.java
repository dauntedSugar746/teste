package curso_java.exercicios.classes;

public class EmpregadoClasse {

    private Integer id;
    private String nome;
    private Double salario;

    public EmpregadoClasse(Integer id, String nome, Double salario){

        this.id = id;
        this.nome = nome;
        this.salario = salario;

    }

    public Integer getId(){

        return id;

    }
    
    public String getNome(){

        return nome;

    }

    public Double getSalario(){

        return salario;

    }

    public Double setSalario(Double aumento){

        salario += (salario / 100) * aumento;

        return salario;

    }

}
