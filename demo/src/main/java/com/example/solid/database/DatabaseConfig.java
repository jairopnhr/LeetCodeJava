package com.example.solid.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 Classe que sera a configuração para acessar o Banco de dados 
 */
public class DatabaseConfig {
    private static DatabaseConfig instance;
    private DatabaseConfig(){}
    /**
     * 
     * Padrão de projeto Singleton 
     */
    public static DatabaseConfig getInstance()
    {
        if(instance == null){
            return instance = new DatabaseConfig();
        }else
        {
            return DatabaseConfig.instance;
        }
    }
    /**
    Para obter as informações você tb pode criar uma propeties e apos isso pegar essa informação.
    Mas preferi criar uma classe privada com as constantes necessarias
    @return Connection   
    */
    public Connection connection() 
    {
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(DatabaseInfor.URL, DatabaseInfor.USERNAME, DatabaseInfor.USERNAME);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Problema ao se conectar ao banco de dados ", JOptionPane
            .ERROR_MESSAGE);
        }
        return conne;
    }


}

