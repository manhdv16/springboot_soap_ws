package com.dvm.soap_service.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfig {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean
    public XsdSchema userSchema() {
        return new SimpleXsdSchema(new ClassPathResource("info.xsd"));
    }

    @Bean(name = "info")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(userSchema);
        definition.setLocationUri("/ws");
        definition.setPortTypeName("InfoServicePort");
        definition.setTargetNamespace("http://dancuquocgia.bca");
        return definition;
    }

//    @Bean
//    public XsdSchema userSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
//    }
//
//    @Bean
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {
//
//        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
//        definition.setSchema(userSchema);
//        definition.setLocationUri("/ws");
//        definition.setPortTypeName("CountryServicePort");
//        definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
//        return definition;
//    }
}
