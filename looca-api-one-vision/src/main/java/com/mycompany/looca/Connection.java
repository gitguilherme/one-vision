package com.mycompany.looca;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connection {
    private BasicDataSource dataSource;

    public Connection() {
        dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-projeto-onevision.database.windows.net:1433;database=bd-projeto-onevision;user=admin-projeto-onevision@svr-projeto-onevision;password={2ads@grupo1};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        //dataSource​.setUsername("root");
        //dataSource​.setPassword("YES");
        
        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://0.0.0.0:3306/onevision?autoReconnect=true&useSSL=false");
        dataSource​.setUsername("root");
        dataSource​.setPassword("guilherme");
        
    }
    
        public BasicDataSource getDataSource() {
        return dataSource;
    }
        
}
