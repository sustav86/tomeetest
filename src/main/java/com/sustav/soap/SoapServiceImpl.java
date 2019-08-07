package com.sustav.soap;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "com.sustav.soap.SoapService")
public class SoapServiceImpl implements SoapService {
    @Override
    public String sayHello() {
        return "Hello SOAP";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8083/sayHello", new SoapServiceImpl());
    }
}
