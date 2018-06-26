package examples;

import it.gestpay.wss2s.model.CallDeleteS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callDeleteS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/withdrawal.html
 *
 * Api details: http://api.gestpay.it/#calldeletes2s
 *
 */
public class CallDeleteS2SExample {

  private static Logger logger = Logger.getLogger("CallDeleteS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = " GESPAY65987";
    String shopTransactionId = null;
    String bankTransactionId = "137";
    String cancelReason = "buyer wants his money back";

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay ...
    CallDeleteS2SResponse.CallDeleteS2SResult callDeleteS2SResult = wSs2SSoap.callDeleteS2S(shopLogin,
        shopTransactionId, bankTransactionId, cancelReason, apiKey, null); 

    if (callDeleteS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callDeleteS2SResult.getContent().get(0);

    logNode(response);

  }

}
