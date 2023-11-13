package br.com.ctsistemasbrasil.dal;
import java.sql.*;
public class ModuloConexao {
    //método responsavel por estabelece a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o drive mysql-connector
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://127.0.0.1:3306/dbinfox";
        String user = "root";
        String password = "25102010eE@@@";
        // estabelece conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;    
        } catch (Exception e){
            //exibir o ero
            System.out.println(e);
            return null;
        }
           
    }
}
