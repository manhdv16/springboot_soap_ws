package com.dvm.soap_service.endpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

/**
 * Cấu hình WebServiceTemplate
 * - Cấu hình Jaxb2Marshaller để chuyển đổi giữa XML và Object Java và ngược lại
 * - Cấu hình WebServiceTemplate để gửi và nhận message từ WebService khác
 */
@Configuration
public class WebServiceConfig {

    // Định nghĩa đường dẫn package chứa các lớp được sinh ra từ WSDL
    private static final String PACKAGE_PATH = "com.dvm.soap_service.endpoint.dto";

    // Cấu hình Jaxb2Marshaller
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(PACKAGE_PATH);
        return marshaller;
    }

    // Cấu hình WebServiceTemplate
    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri("http://192.168.4.165:2026/vkakarlaService");
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        return webServiceTemplate;
    }
}
