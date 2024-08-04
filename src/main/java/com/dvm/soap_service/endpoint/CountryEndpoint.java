package com.dvm.soap_service.endpoint;

import com.dvm.soap_service.dto.*;
import com.dvm.soap_service.entity.Country;
import com.dvm.soap_service.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class CountryEndpoint {
    private final static String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final CountryService countryService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country country = countryService.findByName(request.getName());
        if(country == null) {
            return response;
        }
        CountryInfo countryInfo = new CountryInfo(country.getId(), country.getName(), country.getCapital(), country.getCurrency());
        response.setCountryInfo(countryInfo);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "addCountryRequest")
    @ResponsePayload
    public ResponseStatus postCountry(@RequestPayload AddCountryRequest request) {
        countryService.save(request.getCountryInfo());

        ServiceStatus status = new ServiceStatus("SUCCESS", "Country is added");
        return new ResponseStatus(status);
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteCountryRequest")
    @ResponsePayload
    public ResponseStatus deleteCountry(@RequestPayload DeleteCountryRequest request) {
        ServiceStatus status = new ServiceStatus();
        if (countryService.findById(request.getId()) != null) {
            countryService.delete(request.getId());
            status.setStatus("SUCCESS");
            status.setMessage("Country is deleted");
        } else {
            status.setStatus("FAIL");
            status.setMessage("Country is not found");
        }
        return new ResponseStatus(status);
    }
}
