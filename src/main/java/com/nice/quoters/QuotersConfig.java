package com.nice.quoters;

import ebay.EbayService;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan(basePackages = "com.nice.quoters")
public class QuotersConfig {
    @Autowired
    private NameFactory nameFactory;

    @Bean
    @Scope("prototype")
    public String randomName(){
        return nameFactory.getRandomName();
    }

    @Bean
    public EbayService ebayService
            (@Book List<Quoter> quoterList){
        EbayService ebayService = new EbayService();
        ebayService.setQuoters(quoterList);
        return ebayService;
    }

    /*@Bean  // you don't need this one since 4.3
    public static PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
