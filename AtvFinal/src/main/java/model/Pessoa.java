package model;
import javax.persistence.*;


@Entity
@Table(name = "pessoa")
public class Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "cpf")
    private String cpf;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "nascimento")
    private String nascimento;
    
    @Column(name = "formacao")
    private String formacao;    

    public Pessoa(){
        
    }
    
    public Pessoa(Integer id, String cpf, String nome, String nascimento, String formacao) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.formacao = formacao;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", nascimento=" + nascimento + ", formacao=" + formacao + '}';
    }


   
    
    
    
    
    
    }
