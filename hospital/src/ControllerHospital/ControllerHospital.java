
package ControllerHospital;

import java.util.ArrayList;
import model.Hospital;
import model.HospitalDAO;

public class ControllerHospital {
    public void CadastrarHospital(Hospital hospital){
           HospitalDAO hDAO = new HospitalDAO();
           hDAO.cadastrar(hospital);
    }
    
    public ArrayList<Hospital> listarHospital (){
        HospitalDAO hDAO = new HospitalDAO();
        return hDAO.buscar();
    }
    public void atualizar(){
        HospitalDAO hDAO = new HospitalDAO();
      //  hDAO.atualizar(hospital);
    }    
}
