
package model;


public class ProntoSocorro {
    Hospital matriz;
    int idFilial;
    String endereco;
    
    public void setMatriz(Hospital matriz){
        this.matriz = matriz;
    }
    public Hospital getMatriz(){
        return matriz;
    }
    
    public void setIdFilial(int idFilial){
        this.idFilial = idFilial;
    }
    public String getEndereco(){
        return endereco;
    }
}
