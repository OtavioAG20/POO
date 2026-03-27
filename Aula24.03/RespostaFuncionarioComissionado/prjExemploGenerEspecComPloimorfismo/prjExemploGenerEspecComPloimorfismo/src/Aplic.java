import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
/**
 *
 * @author 0030482421016
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "10/02/2020", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1111, "Otavio Augusto", "04/02/2004", 12.00);
        FuncionarioComissionado funcComi= new FuncionarioComissionado(2020, "Melissa", "28/01/1993", 0.10);
     
        funcMens.setCargo("Programador");
        funcHor.setCargo("Gerente");
        funcComi.setCargo("Vendedora");
        funcComi.setSalBase(2000);
        funcComi.addVendas(10001);
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Data de admissão: " + funcHor.getDtAdmissao());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Salario Bruto: " + funcHor.calcSalBruto());
        System.out.println("Gratificação: " + funcHor.calcGratificacao());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salario Liquido: " + funcHor.calcSalLiquido());
        
        funcMens.setNumSalMinimo(30);
        System.out.println("\nNome: " + funcMens.getNome());
        System.out.println("Registro: " + funcMens.getRegistro());
        System.out.println("Data de admissão: " + funcMens.getDtAdmissao());
        System.out.println("Cargo: " + funcMens.getCargo());
        System.out.println("Valor Salário Minimo: " + funcMens.calcSalBruto());
        System.out.println("Desconto: " + funcMens.calcDesconto());
        System.out.println("Salario Liquido: " + funcMens.calcSalLiquido());
        
        System.out.println("\nNome: " + funcComi.getNome());
        System.out.println("Registro: " + funcComi.getRegistro());
        System.out.println("Data de admissão: " + funcComi.getDtAdmissao());
        System.out.println("Cargo: " + funcComi.getCargo());
        System.out.println("Salário Bruto: " + funcComi.calcSalBruto());
        System.out.println("Desconto: " + funcComi.calcDesconto());
        System.out.println("Salario Liquido: " + funcComi.calcSalLiquido());
        System.out.println("Total de Vendas: " + funcComi.getTotalVendas());
        System.out.println("Taxa de Comissao:" + funcComi.getTaxaComissao());
        System.out.println("Salario base: " + funcComi.getSalBase());
        System.out.println("Gratificação: " + funcComi.calcGratificacao());
    }
    
}
