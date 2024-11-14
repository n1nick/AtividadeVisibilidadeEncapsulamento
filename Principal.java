
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            
            Funcionario func1 = new Funcionario();
            func1.setNome("João");
            func1.setDataAdmissao(sdf.parse("10/05/2020"));
            func1.setSalario(1500.00);
            
            Funcionario func2 = new Funcionario();
            func2.setNome("Maria");
            func2.setDataAdmissao(sdf.parse("15/08/2019"));
            func2.setSalario(2000.00);
            
            Funcionario func3 = new Funcionario();
            func3.setNome("Carlos");
            func3.setDataAdmissao(sdf.parse("22/11/2021"));
            func3.setSalario(1800.00);
            
            System.out.println("Funcionario 1: " + func1.getNome() + ", ID: " + func1.getIdentificador() +
                    ", Data de Admissão: " + sdf.format(func1.getDataAdmissao()) + ", Salário: " + func1.getSalario());

            System.out.println("Funcionario 2: " + func2.getNome() + ", ID: " + func2.getIdentificador() +
                    ", Data de Admissão: " + sdf.format(func2.getDataAdmissao()) + ", Salário: " + func2.getSalario());

            System.out.println("Funcionario 3: " + func3.getNome() + ", ID: " + func3.getIdentificador() +
                    ", Data de Admissão: " + sdf.format(func3.getDataAdmissao()) + ", Salário: " + func3.getSalario());

        } catch (ParseException e) {
            System.out.println("Erro ao converter data: " + e.getMessage());
        }
    }
}
