package org.garage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    //1
    List<NbrRepationVeh> CountTotalReparation(){
        List<NbrRepationVeh> liste = new ArrayList<>();
        String sql = """
        SELECT
            mv.marque,
            mv.modele,
            COUNT(r.id) AS nb_reparations
        FROM modele_voiture mv
        LEFT JOIN reparation r ON mv.id = r.id_modele_voiture
        GROUP BY mv.marque, mv.modele;    
""";
        try(Connection connection =  new DbConnection().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            ){
            while (resultSet.next()){
                NbrRepationVeh nbrRepationVeh = new NbrRepationVeh();
                nbrRepationVeh.setMarque(Marque.valueOf(resultSet.getString("marque")));
                nbrRepationVeh.setModele(Modele.valueOf(resultSet.getString("modele")));
                nbrRepationVeh.setNombre_reparation(resultSet.getInt("nb_reparations"));
                liste.add(nbrRepationVeh);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return liste;
    }
}
