package examples;

import it.gestpay.wss2s.model.CallRefundS2SResponse;
import it.gestpay.wss2s.model.RefundProductDetail;
import it.gestpay.wss2s.model.WSs2S;
import it.gestpay.wss2s.model.WSs2SSoap;
import org.w3c.dom.Element;

import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

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

    logNode(response);

  }
}
