package fatec.poo.model;

/**
 *
 * @author Otavio
 */
public class Pessoa {
    private String nome, telefone;
    
    public Pessoa(String n, String t){
        nome = n;
        telefone = t;
    }
    
    public String getNome(){
       return nome;
    }
    public String getTelefone(){
        return telefone;
    }
}
