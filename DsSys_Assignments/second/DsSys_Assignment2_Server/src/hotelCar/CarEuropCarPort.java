
package hotelCar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CarEuropCarPort", targetNamespace = "CarEuropCar")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarEuropCarPort {


    /**
     * 
     * @param gcdRequestParamA
     * @return
     *     returns int
     */
    @WebMethod(operationName = "CarEuropCarcalc")
    @WebResult(name = "CarEuropCarResponse", partName = "CarEuropCarResponse")
    @Action(input = "CarEuropCar/CarEuropCarPort/CarEuropCarcalcRequest", output = "CarEuropCar/CarEuropCarPort/CarEuropCarcalcResponse")
    public int carEuropCarcalc(
        @WebParam(name = "GCDRequest_paramA", partName = "GCDRequest_paramA")
        String gcdRequestParamA);

}
