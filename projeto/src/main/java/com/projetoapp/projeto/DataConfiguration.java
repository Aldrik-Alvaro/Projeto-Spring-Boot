package com.projetoapp.projeto;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;



//CLASSE DE CONFIGURAÇÃO DO BANCO DE DADOS
@Configuration
public class DataConfiguration {
	
	@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //URL DO BANCO
        dataSource.setUrl("jdbc:mysql://localhost:3306/testealdrik");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		//SELECT / INSERT / UPDATE / DELETE - MOSTRA OS DADOS NO CONSOLE
		adapter.setShowSql(true);
		//PERMITE QUE HIRBENATE CRIE AS TABELAS AUTOMATICAMENTE
		adapter.setGenerateDdl(true);
		//DIALETO
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}

}
