
package it.gestpay.wss2s.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSs2s", targetNamespace = "https://ecomms2s.sella.it/", wsdlLocation = "https://ecomms2s.sella.it/gestpay/gestpayws/WSs2s.asmx?WSDL")
public class WSs2S
    extends Service
{

    private final static URL WSS2S_WSDL_LOCATION;
    private final static WebServiceException WSS2S_EXCEPTION;
    private final static QName WSS2S_QNAME = new QName("https://ecomms2s.sella.it/", "WSs2s");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ecomms2s.sella.it/gestpay/gestpayws/WSs2s.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSS2S_WSDL_LOCATION = url;
        WSS2S_EXCEPTION = e;
    }

    public WSs2S() {
        super(__getWsdlLocation(), WSS2S_QNAME);
    }

    public WSs2S(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSS2S_QNAME, features);
    }

    public WSs2S(URL wsdlLocation) {
        super(wsdlLocation, WSS2S_QNAME);
    }

    public WSs2S(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSS2S_QNAME, features);
    }

    public WSs2S(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSs2S(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSs2SSoap
     */
    @WebEndpoint(name = "WSs2sSoap")
    public WSs2SSoap getWSs2SSoap() {
        return super.getPort(new QName("https://ecomms2s.sella.it/", "WSs2sSoap"), WSs2SSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSs2SSoap
     */
    @WebEndpoint(name = "WSs2sSoap")
    public WSs2SSoap getWSs2SSoap(WebServiceFeature... features) {
        return super.getPort(new QName("https://ecomms2s.sella.it/", "WSs2sSoap"), WSs2SSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSS2S_EXCEPTION!= null) {
            throw WSS2S_EXCEPTION;
        }
        return WSS2S_WSDL_LOCATION;
    }

}
