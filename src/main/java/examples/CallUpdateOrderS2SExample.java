package examples;

import it.gestpay.wss2s.model.*;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callUpdateOrderS2S of WsS2S.
 *
 * To be used only by merchants adhering to Gestpay Guaranteed Checkout.
 *
 * Api details: http://api.gestpay.it/#callupdateorders2s
 *
 */
public class CallUpdateOrderS2SExample {

  private static Logger logger = Logger.getLogger("CallUpdateOrderS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = "GESPAY65987";
    String shopTransactionId = null;
    String bankTransactionId = "134";

    //write here a new OrderDetails object ...
    EcommGestpayPaymentDetails orderDetails = new EcommGestpayPaymentDetails();
    orderDetails.setCustomerDetail(new CustomerDetail());
    orderDetails.getCustomerDetail().setFirstName("Albert");
    orderDetails.getCustomerDetail().setLastname("Einstein");

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay ...
    CallUpdateOrderS2SResponse.CallUpdateOrderS2SResult callUpdateOrderS2SResult = wSs2SSoap.callUpdateOrderS2S(
        shopLogin, shopTransactionId, bankTransactionId, orderDetails, apiKey);

    if (callUpdateOrderS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callUpdateOrderS2SResult.getContent().get(0);

    logNode(response);

  }
}
