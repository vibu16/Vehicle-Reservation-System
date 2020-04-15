package com.cognizant.vehicle.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionHandler {
  public static Connection getConnection() {
                                Connection con = null;
                                try {
                                                Class current = ConnectionHandler.class;
                                                ClassLoader currentLoader = current.getClassLoader();
                                                InputStream input = currentLoader.getResourceAsStream("connection.properties");

                                                Properties pro = new Properties();
                                                pro.load(input);
                                                Class.forName(pro.getProperty("driver"));
                                                String url = pro.getProperty("connection-url");
                                                String user = pro.getProperty("user");
                                                String pass = pro.getProperty("password");

                                                con = DriverManager.getConnection(url, user, pass);

                                } catch (Exception ex) {
                                                System.out.println(ex);
                                }
                                return con;
                }


}
