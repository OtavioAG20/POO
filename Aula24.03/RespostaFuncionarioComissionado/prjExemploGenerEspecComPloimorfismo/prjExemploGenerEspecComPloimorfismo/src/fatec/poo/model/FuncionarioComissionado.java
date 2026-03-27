package fatec.poo.model;

/**
 *
 * @author 0030482421016
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase, taxaComissao, totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dt, double tx){
        super(r,n, dt);
        taxaComissao = tx;
    }
    
    
    public void setSalBase(double sl){
        salBase = sl;
    }
    
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double addVendas(double venda){
        return totalVendas += venda;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
        
   public double calcSalBruto(){
        return salBase + (taxaComissao * totalVendas); 
    }    
  
   public double calcGratificacao(){
       if(totalVendas <= 5000){
           return 0;
       }
       else{
           if(totalVendas > 5000 && totalVendas <= 10000){
               return 0.03 * calcSalBruto();
           }
           else{
               return 0.05 * calcSalBruto();
           }
       }
   }
   public double calcSalLiquido(){
       return (super.calcSalLiquido() + calcGratificacao());
   }
    
}
