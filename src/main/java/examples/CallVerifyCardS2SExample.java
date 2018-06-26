package examples;

import it.gestpay.wss2s.model.CallVerifycardS2SResponse;
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
 * This is an example of calling callVerifycardS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/card-verification.html
 *
 * Api details: http://api.gestpay.it/#callverifycards2s
 *
 */
public class CallVerifyCardS2SExample {

  private static Logger logger = Logger.getLogger("CallVerifycardS2SExample");

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
    String cardNumber = "5412388800004012"; //test credit card 
    String expMonth = "05";
    String expYear = "27";
    String cvv2 = "841";

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay ...
    CallVerifycardS2SResponse.CallVerifycardS2SResult callVerifycardS2SResult = wSs2SSoap.callVerifycardS2S(shopLogin,
        shopTransactionId, cardNumber, expMonth, expYear, cvv2, apiKey);

    if (callVerifycardS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callVerifycardS2SResult.getContent().get(0);

    logNode(response);

  }
}
