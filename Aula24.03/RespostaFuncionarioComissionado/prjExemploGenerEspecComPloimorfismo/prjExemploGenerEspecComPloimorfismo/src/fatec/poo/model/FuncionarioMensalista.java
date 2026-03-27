package fatec.poo.model;

/**
 *
 * @author 0030482421016
 */
public class FuncionarioMensalista extends Funcionario {
        private double valSalMin, numSalMin;
        
        public FuncionarioMensalista(int r, String n, String da, double val){
            super(r, n, da);
            valSalMin = val;    
        }
        
        public void setNumSalMinimo(double nsm){
            numSalMin = nsm;
        }
        
        public double calcSalBruto(){
            return numSalMin * valSalMin;
        }
       
        
}
