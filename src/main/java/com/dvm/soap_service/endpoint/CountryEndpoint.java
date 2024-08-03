package com.dvm.soap_service.endpoint;

import com.dvm.soap_service.dto.Country;
import com.dvm.soap_service.dto.GetCountryRequest;
import com.dvm.soap_service.dto.GetCountryResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service",
            localPart = "getCountryRequest")
    @ResponsePayload
    public JAXBElement<GetCountryResponse> getCountry(@RequestPayload JAXBElement<GetCountryRequest> request) {
        System.out.println("Request received for country: " + request.getValue().getName());
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(new Country("India", 1000000000, "New Delhi"));
        return new JAXBElement<>(request.getName(), GetCountryResponse.class, response);
    }
}
