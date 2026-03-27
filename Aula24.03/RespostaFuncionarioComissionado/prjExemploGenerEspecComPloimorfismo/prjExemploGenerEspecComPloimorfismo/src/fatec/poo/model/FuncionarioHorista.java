package fatec.poo.model;

/**
 *
 * @author 0030482421016
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;
    
    
    public FuncionarioHorista(int r, String n, String da, double vht){
        super(r, n, da);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    //aplicação do polimorfismo
    public double calcSalBruto(){
        return valHorTrab * qtdeHorTrab;
    }
    
    public double calcGratificacao(){
        return 0.075 * calcSalBruto();
    }
    
    //Esse novo método vai substituir a programação da super classe, assim n preciso transformar o método calcsalliquido em um método abstrato e assim evito o reajuste do código na classe mensalista
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
