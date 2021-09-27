
package Application;

import java.net.Socket;
import java.sql.*;



public class BDD {
    
//    Declarations 
    Connection connection;
    Statement statement;
    String SQL;
    
    String url,username,password,Host;
    Socket client;
    int port;
    
    
//    Constructeur de la base de donnée
    public BDD(String url, String username, String password, String Host, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.Host = Host;
        this.port = port;
    }
    
    
//    fonction de connection à la base de donnée
    public Connection connexion_to_database(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return connection;
    }
    
    
//    fonction pour fermer la connnexion
    public Connection fermerConnexion(){
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connection;
        
    }
    
    
//    fonction d'execution des requetes
    public ResultSet executeMoi(String sql){
        
        connexion_to_database();
        ResultSet resultset = null;
        
        try {
            statement = connection.createStatement();
            resultset = (ResultSet) statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return resultset;
    }

    
    
//    fonction d'execution des requetes updates
    public String executeUpdate(String sql){
        connexion_to_database();
        String resultat = "";
        try {
            statement = connection.createStatement();
            statement.execute(sql);
            resultat = sql;
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return resultat;
    }
    
    
//    fonction pour tous afficher
    public ResultSet selecTout(String nom_table){
        
        connexion_to_database();
        SQL = "SELECT * FROM "+nom_table;
        System.out.println(SQL);
        return (ResultSet) this.executeMoi(SQL);
    }
    
    
//    fonction pour tout afficher mais avec conditions
    public ResultSet selecTout(String nom_table,String param){
        
        connexion_to_database();
        SQL = "SELECT * FROM "+nom_table+" WHERE "+param;
        System.out.println(SQL);
        return this.executeMoi(SQL);
    }
    
    
//    fonction pour selectionner les colonnes de la table
    
    public ResultSet select(String nom_colonne[],String nom_table){
        
        connexion_to_database();
        int i;
        SQL = "SELECT ";
        
        for(i = 0;i<= nom_colonne.length -1;i++){
            SQL +=nom_colonne[i];
            if(i<nom_colonne.length - 1){
                SQL += ",";
            }
        }
        SQL += " FROM " + nom_table;
        return (ResultSet) this.executeMoi(SQL);
    }
    
    
//    fonction pour selectionner les colonnes de la table mais avec conditions
    
    public ResultSet select(String nom_colonne[],String nom_table,String param){
        
        connexion_to_database();
        int i;
        SQL = "SELECT";
        
        for(i = 0;i<= nom_colonne.length -1;i++){
            SQL +=nom_colonne[i];
            if(i<nom_colonne.length - 1){
                SQL += ",";
            }
        }
        SQL += " FROM " + nom_table + "WHERE" + param;
        return (ResultSet) this.executeMoi(SQL);
    }
    
    
//    fonction dinsertion de donnée  dans la base 
    
    public String insert(String nom_table,String donne[]){
        
        connexion_to_database();
        int i;
        SQL = "INSERT INTO " + nom_table + "VALUES(";
        
        for(i=0;i<donne.length -1;i++){
            SQL += "'" + donne[i] + "'";
            if(i < donne.length -1){
                SQL +=",";
            }
        }
        
        SQL += ")";
        return this.executeUpdate(SQL);
        
    }
    
    
    //    fonction dinsertion de donnée  dans la base 
    
    public String insert(String nom_table,String nom_colonne[],String donne[]){
        
        connexion_to_database();
        int i;
        SQL = "INSERT INTO " + nom_table + "(";
        
        for(i=0;i<nom_colonne.length -1;i++){
            SQL += nom_colonne[i] ;
            if(i < nom_colonne.length -1){
                SQL +=",";
            }
        }
        
        SQL += "VALUES(";
        
        for(i=0;i<donne.length -1;i++){
            SQL += "'" + donne[i] + "'";
            if(i < donne.length -1){
                SQL +=",";
            }
        }
        
        SQL += ")";
        return this.executeUpdate(SQL);
        
    }
    
    
    //    fonction de modification de donnée  dans la base 
    
    public String modifier(String nom_table,String colonne[],String donne[],String etat){
        
        connexion_to_database();
        int i;
        SQL = "UPDATE " + nom_table + " SET ";
        
        for(i=0;i< colonne.length -1;i++){
            SQL += colonne[i]+ "= '" + donne[i] + "'";
            if(i < colonne.length -1){
                SQL +=",";
            }
        }
        
        SQL += "WHERE "+ etat;
        return this.executeUpdate(SQL);
        
    }
    
    
    
    //    fonction pour supprimer sans paramètre
    public String delete(String nom_table){
        
        connexion_to_database();
        SQL = "DELETE FROM "+ nom_table;
        
        return this.executeUpdate(SQL);
    }
 
    
 //    fonction pour supprimer avec paramètre
    public String delete(String nom_table,String param){
        
        connexion_to_database();
        SQL = "DELETE FROM "+ nom_table + "WHERE" +param;
        
        return this.executeUpdate(SQL);
    }
    
    
    
    
    
}




