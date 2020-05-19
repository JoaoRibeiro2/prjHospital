
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HospitalDAO {
     private final Connection con = new ConnectionFactory().getConnection();
  
     
     public void cadastrar(Hospital hospital){
        try{
             String query = "insert into hospital (nm_hospital,ds_endereco) values (?,?)";
             
             PreparedStatement preparedStmt = con.prepareStatement(query);
             preparedStmt.setString (1, hospital.getNome());
             preparedStmt.setString (2, hospital.getEndereco());
            
             preparedStmt.execute();
             
             con.close();
             
        }catch(Exception e){
             
        }
        
     }
     
     public void atualizar(Hospital hospital){
         try{
             String query ="update hospital set nm_hospital = ?, ds_endereco = ? where id_hospital = ?";
             
             PreparedStatement preparedStmt = con.prepareStatement(query);
             preparedStmt.setString (1, hospital.getNome());
             preparedStmt.setString (2, hospital.getEndereco());
             preparedStmt.setInt (3, hospital.getId()); 
             preparedStmt.execute();
             
             con.close();
             
         }catch(Exception e){
             
         }
     }
     
     public ArrayList<Hospital> buscar(){
         ArrayList<Hospital> ah = new ArrayList();
         try{
             String query = "select * from hopital";
             PreparedStatement preparedStmt = con.prepareStatement(query);
             ResultSet rs = preparedStmt.executeQuery(query);
             
             while(rs.next()){
                Hospital h = new Hospital(rs.getString("nm_hospital"));
               h.setId(rs.getInt("id_hospital"));
                
                ah.add(h);
                
             }
             con.close();
         }catch(Exception e){
             
      }
         return ah;   
     }
     
     public void deletar(int id){
         try{
             String query = "Delete from hospital where id_hospital = ?";
             PreparedStatement preparedStmt = con.prepareStatement(query);
             preparedStmt.setInt(1, id);
             
             preparedStmt.execute();
             
             con.close();
             
         }catch(Exception e){
             
         }
     }
}
