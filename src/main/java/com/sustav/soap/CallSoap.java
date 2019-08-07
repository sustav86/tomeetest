package com.sustav.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CallSoap {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8083/sayHello?wsdl");
        QName soapServiceService = new QName("http://soap.sustav.com/", "SoapServiceImplService");
        Service service = Service.create(url, soapServiceService);
        SoapService port = service.getPort(SoapService.class);
        System.out.println(port.sayHello());
    }
}
