package com.myorganization.sprocket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class JPAManagerConfig {

    @Autowired
    private DataSource dataSource;

    @Value("${spring.jpa.properties.hibernate.database:POSTGRESQL}")
    private String hibernateDatabase;

    @Value("${spring.jpa.properties.hibernate.dialect:org.hibernate.dialect.PostgreSQL95Dialect}")
    private String hibernateDialect;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        final LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setPackagesToScan("com.myorganization.sprocket.models.entities");

        factoryBean.setJpaVendorAdapter(vendorAdapter());
        factoryBean.setJpaProperties(additionalProperties());

        return factoryBean;
    }

    @Bean
    public JpaVendorAdapter vendorAdapter() {

        final String showSql = "true";
        final HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        adapter.setDatabasePlatform(hibernateDialect);
        adapter.setGenerateDdl(false);
        adapter.setShowSql(Boolean.valueOf("true"));
        adapter.setDatabase(Database.valueOf(hibernateDatabase));

        return adapter;
    }

    private Properties additionalProperties() {

        final Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.cache.use_second_level_cache", "true");
        jpaProperties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.jcache.JCacheRegionFactory");
        jpaProperties.put("hibernate.javax.cache.provider", "org.ehcache.jsr107.EhcacheCachingProvider");

        //https://www.boraji.com/hibernate-5-jcache-ehcache-3-configuration-example
        //hibernate.cache.use_second_level_cache = true
        //hibernate.cache.region.factory_class = org.hibernate.cache.jcache.JCacheRegionFactory
        //hibernate.javax.cache.provider = org.ehcache.jsr107.EhcacheCachingProvider
        return jpaProperties;
    }

}
