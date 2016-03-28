package webapp.cxf.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "ProductService", portName = "ProductPort", targetNamespace = "http://com.tongtech.ti/test/product")
public interface ProductService {
    
    @WebMethod(operationName = "ReportProduct")
    public @WebResult
    String call(@WebParam(name = "payload") Product product);
    
}
