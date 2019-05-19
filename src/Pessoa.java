
public class Pessoa {

    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(String Nom,String Ende,String Tele){
        setNome(Nom);
        setEnd(Ende);
        setTel(Tele);
    }
    
    
    void setNome(String Nom){
        this.nome=Nom;
    }
    void setEnd(String Ende){ 
        this.endereço=Ende;
    }
    void setTel(String Tele){ 
        this.telefone=Tele;
    }
    
    String getNome(){ 
        return this.nome;
    }
    String getEndereco(){ 
        return this.endereço;
    }
    String getTelefone(){ 
        return this.telefone;
    }
}    
    

