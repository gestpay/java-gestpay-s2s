package examples;

import it.gestpay.wss2s.model.CallCheckCartaS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callCheckCartaS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/card-check.html
 *
 * Api details: http://api.gestpay.it/#callcheckcartas2s
 *
 */
public class CallCheckCartaS2SExample {

  private static Logger logger = Logger.getLogger("CallCheckCartaS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = " GESPAY65987";
    DateFormat df = new SimpleDateFormat("_yyyy-MM-dd-HH-mm-ss-SSS");
    String shopTransactionId = "MYSHOP_" + df.format(new Date());
    String withAuth = "Y";

    // credit card details
    String cardNumber = "5412388800004012"; //test credit card
    String expMonth = "05";
    String expYear = "27";
    String cvv2 = "841";

    // pass a Token to check if it is still valid.
    String tokenValue = null;

    //call Gestpay ...
    CallCheckCartaS2SResponse.CallCheckCartaS2SResult callCheckCartaS2SResult = wSs2SSoap.callCheckCartaS2S(shopLogin,
        shopTransactionId, cardNumber, expMonth, expYear, cvv2, withAuth, tokenValue);

    if (callCheckCartaS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callCheckCartaS2SResult.getContent().get(0);

    logNode(response);

  }
}
