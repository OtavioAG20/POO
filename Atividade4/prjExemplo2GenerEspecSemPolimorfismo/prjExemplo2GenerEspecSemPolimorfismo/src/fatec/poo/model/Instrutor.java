package fatec.poo.model;
/**
 *
 * @author Otavio
 */
public class Instrutor extends Pessoa{
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int id, String nm,String tf){
        super(nm, tf);
        identificacao = id;
    }
    
    public void setAreaAtuacao(String at){
        areaAtuacao= at;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
}
