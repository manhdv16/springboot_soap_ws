package com.dvm.soap_service.endpoint;

import com.dvm.soap_service.endpoint.dto.XacThucThongTinCongDanRequest;
import com.dvm.soap_service.endpoint.dto.XacThucThongTinCongDanResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InfoEndpoint {

    private final static String NAMESPACE_URI = "http://dancuquocgia.bca";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "XacThucThongTinCongDanRequest")
    @ResponsePayload
    public XacThucThongTinCongDanResponse getCountry(@RequestPayload XacThucThongTinCongDanRequest request) {
        XacThucThongTinCongDanResponse response = new XacThucThongTinCongDanResponse();
        response.setTonTai(true);
        return response;
    }
}
