//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.04 at 05:13:58 PM ICT 
//


package com.dvm.soap_service.dto;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dvm.soap_service.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dvm.soap_service.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link AddCountryRequest }
     * 
     */
    public AddCountryRequest createAddCountryRequest() {
        return new AddCountryRequest();
    }

    /**
     * Create an instance of {@link CountryInfo }
     * 
     */
    public CountryInfo createCountryInfo() {
        return new CountryInfo();
    }

    /**
     * Create an instance of {@link PutCountryRequest }
     * 
     */
    public PutCountryRequest createPutCountryRequest() {
        return new PutCountryRequest();
    }

    /**
     * Create an instance of {@link DeleteCountryRequest }
     * 
     */
    public DeleteCountryRequest createDeleteCountryRequest() {
        return new DeleteCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

}
