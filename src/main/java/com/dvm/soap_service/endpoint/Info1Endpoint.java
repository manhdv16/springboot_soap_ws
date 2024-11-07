package com.dvm.soap_service.endpoint;

import com.dvm.soap_service.endpoint.dto.KetQuaXacThuc;
import com.dvm.soap_service.endpoint.dto.XacThucThongTinCongDan;
import com.dvm.soap_service.endpoint.dto.XacThucThongTinCongDanRequest;
import com.dvm.soap_service.endpoint.dto.XacThucThongTinCongDanResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Info1Endpoint {

    private final static String NAMESPACE_URI = "http://dancuquocgia.bca";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "XacThucThongTinCongDan")
    @ResponsePayload
    public KetQuaXacThuc check(@RequestPayload XacThucThongTinCongDan request) {
        KetQuaXacThuc response = new KetQuaXacThuc();
        response.setTonTai(true);
        return response;
    }
}
