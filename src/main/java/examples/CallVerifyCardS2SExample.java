package examples;

import it.gestpay.wss2s.model.CallVerifycardS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * This is an example of calling callVerifyCardS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/card-verification.html
 *
 * Api details: http://api.gestpay.it/#callverifycards2s
 *
 */
public class CallVerifyCardS2SExample {

  private static Logger logger = Logger.getLogger("CallVerifyCardS2SExample");

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

    //call Gestpay ...
    CallVerifycardS2SResponse.CallVerifycardS2SResult callVerifyCardS2SResult = wSs2SSoap.callVerifycardS2S(shopLogin,
        shopTransactionId, cardNumber, expMonth, expYear, cvv2);

    if (callVerifyCardS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callVerifyCardS2SResult.getContent().get(0);

    logNode(response, 0);

  }

  private static void logNode(Node node, int level) {
    String spacing = repeat("  ", level);

    if (node.getNodeType() == Node.ELEMENT_NODE) {
      System.out.println(spacing + node.getNodeName() + ": ");
    }


    if (node.getNodeType() == Node.TEXT_NODE) {
      System.out.println(spacing + "  => " + node.getTextContent());
    }


    else {
      for (int i=0; i<node.getChildNodes().getLength(); i++) {
        Node item = node.getChildNodes().item(i);
        logNode(item, level+1);
      }
    }
  }

  /**
   * Repeats the string s, count times.
   * We use it to indent stuff, so s = " ".
   * @param s
   * @param count
   * @return
   */
  private static String repeat(String s, int count) {
    return count > 0 ? s + repeat(s, --count) : "";
  }

  /**
   * Shows an error in case of problems. 
   */
  private static void showErrorMessage() {
    logger.severe("No response received from webservice.");
  }
}
