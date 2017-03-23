package examples;

import it.gestpay.wss2s.model.CallRefundS2SResponse;
import it.gestpay.wss2s.model.RefundProductDetail;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This is an example of calling callRefundS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/withdrawal.html
 *
 * Api details: http://api.gestpay.it/#callrefunds2s
 *
 */
public class CallRefundS2SExample {

  private static Logger logger = Logger.getLogger("CallRefundS2SExample");

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
    String uicCode = "242"; // euro code
    String amount = "8.31"; // the amount to refund
    RefundProductDetail orderDetail = null;
    String refundReason = "item out of stock";
    String chargeBackFraud = "N";

    //call Gestpay ...
    CallRefundS2SResponse.CallRefundS2SResult callRefundS2SResult = wSs2SSoap.callRefundS2S(shopLogin,
        uicCode, amount, shopTransactionId, bankTransactionId, orderDetail, refundReason, chargeBackFraud);

    if (callRefundS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callRefundS2SResult.getContent().get(0);

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
