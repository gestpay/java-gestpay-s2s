package examples;

import it.gestpay.wss2s.model.CallMyBankListS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callMyBankListS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/mybank-list.html
 *
 * Api details: http://api.gestpay.it/#callmybanklists2s
 *
 */
public class CallMyBankListS2SExample {

  private static Logger logger = Logger.getLogger("CallMyBankListS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = "GESPAY65987";
    String languageId = "1";

    //call Gestpay ...
    CallMyBankListS2SResponse.CallMyBankListS2SResult callMyBankListS2SResult = wSs2SSoap.callMyBankListS2S(shopLogin, languageId);

    if (callMyBankListS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callMyBankListS2SResult.getContent().get(0);

    logNode(response);

  }
}
