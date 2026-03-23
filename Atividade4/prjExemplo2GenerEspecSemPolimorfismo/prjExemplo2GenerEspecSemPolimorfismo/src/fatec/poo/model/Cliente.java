
package fatec.poo.model;

/**
 *
 * @author Otavio
 */
    public class Cliente extends Pessoa{
    private String cpf;
    private double peso, altura;
    
    public Cliente(String c, String nm, String tf){
        super(nm,tf);
        cpf = c;
    }
    
    public void setPeso(double p){
        peso = p;
    }
     public void setAltura(double a){
        altura = a;
    }
    
     public String getCpf(){
         return cpf;
     }
     public double getPeso(){
         return peso;
     }
     public double getAltura(){
         return altura;
     }
     
}


