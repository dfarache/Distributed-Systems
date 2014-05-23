
package flightHotelCar;

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
@WebService(name = "TXLFlightPort", targetNamespace = "TXLFlight")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TXLFlightPort {


    /**
     * 
     * @param gcdRequestParamA
     * @return
     *     returns int
     */
    @WebMethod(operationName = "TXLFlightcalc")
    @WebResult(name = "TXLFlightResponse", partName = "TXLFlightResponse")
    @Action(input = "TXLFlight/TXLFlightPort/TXLFlightcalcRequest", output = "TXLFlight/TXLFlightPort/TXLFlightcalcResponse")
    public int txlFlightcalc(
        @WebParam(name = "GCDRequest_paramA", partName = "GCDRequest_paramA")
        String gcdRequestParamA);

}
