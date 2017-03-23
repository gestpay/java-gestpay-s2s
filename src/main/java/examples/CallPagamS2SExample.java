package examples;

import it.gestpay.wss2s.model.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by michelenasti on 22/03/17.
 */
public class CallPagamS2SExample {

  private static Logger logger = Logger.getLogger("CallPagamS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    WSs2S wSs2S = new WSs2S();
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = " GESPAY65987";
    String uicCode = "242"; //euro
    String amount = "42";
    DateFormat df = new SimpleDateFormat("_yyyy-MM-dd-HH-mm-ss-SSS");
    String shopTransactionId = "MYSHOP_" + df.format(new Date());

    //credit card data
    String cardNumber = "4775718800002026";
    String expiryMonth = "05";
    String expiryYear = "27";
    String cvv = "999";

    //optional data
    String buyerName = null;
    String buyerEmail = null;
    String languageId = null;
    String transKey = null;
    String paRes = null;
    String customInfo = null;
    String requestToken = null;
    String tokenValue = null;
    String clientIP = null;
    String itemType = null;
    String recurrent = null;
    ShippingDetails shippingDetails = null;
    ApplePayRequest applePay = null;
    EcommGestpayPaymentDetails orderDetails = null;

    CallPagamS2SResponse.CallPagamS2SResult callPagamS2SResult = wSs2SSoap.callPagamS2S(shopLogin, uicCode, amount, shopTransactionId, cardNumber, expiryMonth, expiryYear,
        buyerName, buyerEmail, languageId, cvv, null, transKey, paRes, customInfo, null, requestToken, tokenValue,
        clientIP, itemType, recurrent, shippingDetails, null, null, null, null, null, null, null, applePay, orderDetails);

    if (callPagamS2SResult.getContent() == null) {
      showErrorMessage();
    }

    Element response = (Element) callPagamS2SResult.getContent().get(0);

    logResponse(response);

  }

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

  private static void showErrorMessage() {
    logger.severe("No response received from webservice.");
  }
}
