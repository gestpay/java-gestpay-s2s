package examples;

import it.gestpay.wss2s.model.CallDeleteS2SResponse;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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

    //call Gestpay ...
    CallDeleteS2SResponse.CallDeleteS2SResult callDeleteS2SResult = wSs2SSoap.callDeleteS2S(shopLogin,
        shopTransactionId, bankTransactionId, cancelReason);

    if (callDeleteS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callDeleteS2SResult.getContent().get(0);

    logResponse(response);

  }

  /**
   * Shows data coming from Gestpay in a nice form.
   * @param response
   */
  private static void logResponse(Element response) {

    logger.info("Element " + response.getTagName() + ": ");
    NodeList nodeList = response.getChildNodes();

    List<Node> propertiesWithContent = new ArrayList<Node>();
    List<Node> propertiesWithoutContent = new ArrayList<Node>();

    for (int i=0; i<nodeList.getLength(); i++) {

      Node node = nodeList.item(i);
      logger.info("    " + node.getNodeName() + " => " + node.getTextContent());
    }
  }

  /**
   * Shows an error in case of problems. 
   */
  private static void showErrorMessage() {
    logger.severe("No response received from webservice.");
  }
}
