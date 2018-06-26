package examples;

import it.gestpay.wss2s.model.CallIdealListS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callIdealListS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/ideal-list.html
 *
 * Api details: http://api.gestpay.it/#callideallists2s
 *
 */
public class CallIdealListS2SExample { 

  private static Logger logger = Logger.getLogger("CallIdealListS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = "GESPAY65987";
    String apiKey = null;

    //call Gestpay ...
    CallIdealListS2SResponse.CallIdealListS2SResult callIdealListS2SResult = wSs2SSoap.callIdealListS2S(shopLogin, apiKey);

    if (callIdealListS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callIdealListS2SResult.getContent().get(0);

    logNode(response);

  }
}
