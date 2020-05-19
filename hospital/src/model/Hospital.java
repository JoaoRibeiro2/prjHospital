/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author JO
 */
public class Hospital {
    private String nome;
    private int idHospital;
    private String endereco;
    private ArrayList<Funcionario> funcionario = new ArrayList();

    

    public Hospital(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return idHospital;
    }
    
    
    public void setId(int idHospital){
        this.idHospital = idHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    public ArrayList<Funcionario>  getFuncionario(){
        return funcionario;
    }
    
    
    
    
    public ArrayList<Funcionario> ListarTodosFuncionario(){
        for (Funcionario f :this.funcionario){
            System.out.println("Nome: "+f.getNome()+ "Marticula: "+f.getMatricula());
        }
        return null;
    }
    
    public void listarMedicos(){
       for(Funcionario f:this.funcionario){
           if(f instanceof Medico){
               System.out.println("Nome:"+ f.getNome() + ""+ f.getMatricula());
           }
        }
    }
    
    public void listarEnfermeiro(){
       for(Funcionario f:this.funcionario){
           if(f instanceof Enfermeiro){
               System.out.println("Nome:"+ f.getNome() + ""+ f.getMatricula());
           }
        }   
    }
       
    @Override
    public String toString(){
        return this.getNome();
    }

}
