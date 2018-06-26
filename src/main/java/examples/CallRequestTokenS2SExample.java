package examples;

import it.gestpay.wss2s.model.CallRequestTokenS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callRequestTokenS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/request-tokens.html
 *
 * Api details: http://api.gestpay.it/#callrequesttokens2s
 *
 */
public class CallRequestTokenS2SExample {

  private static Logger logger = Logger.getLogger("CallRequestTokenS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = "GESPAY65987";
    String requestToken = "MASKEDPAN";
    String withAuth = "Y";

    // credit card details
    String cardNumber = "5412388800001018"; //test credit card
    String expMonth = "05";
    String expYear = "17";
    String cvv = "999";

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay ...
    CallRequestTokenS2SResponse.CallRequestTokenS2SResult callRequestTokenS2SResult = wSs2SSoap.callRequestTokenS2S(shopLogin,
        requestToken, cardNumber, expMonth, expYear, cvv, withAuth, null, null, apiKey);

    if (callRequestTokenS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callRequestTokenS2SResult.getContent().get(0);

    logNode(response);

  }
}
