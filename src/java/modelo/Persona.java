package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {
    String dui;
    String apellidos;
    String nombres;   
    
    Connection cnn;
    Statement state;
    ResultSet result;
    
    public Persona(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_recursos_humanos?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String getDui(){
    return dui;
    }
    
    public void setDui(String dui){
    this.dui = dui;
    }
    
    public String getApellidos(){
    return apellidos;
    }
    
    public void setApellidos(String apellidos){
    this.apellidos = apellidos;
    }
    
    public String getNombres(){
    return nombres;
    }
    
    public void setNombres(String nombres){
    this.nombres = nombres;
    }
    
    public Persona (String dui, String apellidos , String nombres){
    this.dui = dui;
    this.apellidos = apellidos;
    this.nombres = nombres ;
}

    
public boolean insertarDatos(){
try{
    String MiQuery = "insert into tb_persona values('" + dui + "', '" + apellidos + "', '" + nombres + "');";
    int estado = 0;
    state = cnn.createStatement();
    estado = state.executeUpdate(MiQuery);
    if(estado == 1){
    return true;
    }
} catch (SQLException ex){
Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
}
return false;
}

public ArrayList<Persona> consultarRegistros(){
    ArrayList<Persona> person =new ArrayList ();
    try{
    String miQuery = "select * from tb_persona:";
    state =cnn.createStatement();
    result = state.executeQuery(miQuery);
    while(result.next()){
    
        person.add(new Persona(result.getString("dui_persona"), result.getString("apellidos_persona"), result.getString("nombre_Persona")));
    }
    } catch (SQLException ex) {
        Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
    }
    return person;
}
}