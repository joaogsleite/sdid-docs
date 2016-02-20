
package pt.ulisboa.tecnico.sdis.store.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SDStore", targetNamespace = "urn:pt:ulisboa:tecnico:sdis:store:ws", wsdlLocation = "http://localhost:8090/sd-store/endpoint?WSDL")
@HandlerChain(file = "SDStore_Service_handler.xml")
public class SDStore_Service
    extends Service
{

    private final static URL SDSTORE_WSDL_LOCATION;
    private final static WebServiceException SDSTORE_EXCEPTION;
    private final static QName SDSTORE_QNAME = new QName("urn:pt:ulisboa:tecnico:sdis:store:ws", "SDStore");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/sd-store/endpoint?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SDSTORE_WSDL_LOCATION = url;
        SDSTORE_EXCEPTION = e;
    }

    public SDStore_Service() {
        super(__getWsdlLocation(), SDSTORE_QNAME);
    }

    public SDStore_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SDSTORE_QNAME, features);
    }

    public SDStore_Service(URL wsdlLocation) {
        super(wsdlLocation, SDSTORE_QNAME);
    }

    public SDStore_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SDSTORE_QNAME, features);
    }

    public SDStore_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SDStore_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SDStore
     */
    @WebEndpoint(name = "SDStoreImplPort")
    public SDStore getSDStoreImplPort() {
        return super.getPort(new QName("urn:pt:ulisboa:tecnico:sdis:store:ws", "SDStoreImplPort"), SDStore.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SDStore
     */
    @WebEndpoint(name = "SDStoreImplPort")
    public SDStore getSDStoreImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:pt:ulisboa:tecnico:sdis:store:ws", "SDStoreImplPort"), SDStore.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SDSTORE_EXCEPTION!= null) {
            throw SDSTORE_EXCEPTION;
        }
        return SDSTORE_WSDL_LOCATION;
    }

}
