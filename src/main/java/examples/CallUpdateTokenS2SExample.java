package examples;

import it.gestpay.wss2s.model.CallUpdateTokenS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callUpdateTokenS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/update-tokens.html
 *
 * Api details: http://api.gestpay.it/#callupdatetokens2s
 *
 */
public class CallUpdateTokenS2SExample {

  private static Logger logger = Logger.getLogger("CallUpdateTokenS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = "GESPAY65987";
    String token = "54L76FXQNGTK1018";
    String withAuth = "Y";

    // credit card details
    String expiryMonth = "05";
    String expiryYear = "17";

    //call Gestpay ...
    CallUpdateTokenS2SResponse.CallUpdateTokenS2SResult callUpdateTokenS2SResult = wSs2SSoap.callUpdateTokenS2S(shopLogin,
        token, expiryMonth, expiryYear, withAuth);

    if (callUpdateTokenS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callUpdateTokenS2SResult.getContent().get(0);

    logNode(response);

  }
}
