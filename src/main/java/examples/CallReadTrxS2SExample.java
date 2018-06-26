package examples;

import it.gestpay.wss2s.model.CallReadTrxS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callReadTrxS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/query-transaction-status.html
 *
 * Api details: http://api.gestpay.it/#callreadtrxs2s
 *
 */
public class CallReadTrxS2SExample {

  private static Logger logger = Logger.getLogger("CallReadTrxS2SExample");

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
    
    //set a value if you use apiKey authentication
    String apiKey = null; 

    
    //call Gestpay ...
    CallReadTrxS2SResponse.CallReadTrxS2SResult callReadTrxS2SResult = wSs2SSoap.callReadTrxS2S(shopLogin,
        shopTransactionId, bankTransactionId, apiKey, null);

    if (callReadTrxS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callReadTrxS2SResult.getContent().get(0);

    logNode(response);

  }


}
