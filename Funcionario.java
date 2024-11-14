import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataAdmissao;
    private double salario;
    private int identificador;

    private static int proximoIdentificador = 1;
        
    public Funcionario() {
        this.identificador = proximoIdentificador++;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        Date dataAtual = new Date();
        if (dataAdmissao.after(dataAtual)) {
            throw new IllegalArgumentException("A data de admissão não pode ser no futuro.");
        }
        this.dataAdmissao = dataAdmissao;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 1100.00) {
            throw new IllegalArgumentException("O salário não pode ser inferior a R$ 1.100,00.");
        }
        this.salario = salario;
    }

    
    public int getIdentificador() {
        return identificador;
    }
}
