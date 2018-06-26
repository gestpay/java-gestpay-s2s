package examples;

import it.gestpay.wss2s.model.CallSettleS2SResponse;
import it.gestpay.wss2s.model.FullFillmentDetails;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callSettleS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/settlements.html
 *
 * Api details: http://api.gestpay.it/#callsettles2s
 *
 */
public class CallSettleS2SExample {

  private static Logger logger = Logger.getLogger("CallSettleS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = " GESPAY65987";


    //input
    String uicCode = "242";
    String amount = "15";
    String shopTransID = null;
    String bankTransID = "137";
    FullFillmentDetails fullFillment = null;

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay ...
    CallSettleS2SResponse.CallSettleS2SResult callSettleS2SResult = wSs2SSoap.callSettleS2S(shopLogin, uicCode, amount,
        shopTransID, bankTransID, fullFillment, apiKey, null);

    if (callSettleS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callSettleS2SResult.getContent().get(0);

    logNode(response);

  }
}
