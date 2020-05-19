
package prjHospital;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import view.CadHospital;
import view.TelaPrincipal;

public class PrjHospital {

    
   
    public static void main(String[] args) {
       
       /* try{
            Connection con = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado ao banco!");
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }+*/
       
       //CadHospital cadh = new CadHospital();
       //cadh.setVisible(true);
     TelaPrincipal t = new TelaPrincipal();
     t.setVisible(true);
    
    }
    
}
