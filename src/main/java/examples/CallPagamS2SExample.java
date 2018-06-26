package examples;

import it.gestpay.wss2s.model.*;
import org.w3c.dom.Element;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static util.Utils.logNode;
import static util.Utils.showErrorMessage;

/**
 * This is an example of calling callPagamS2S of WsS2S.
 *
 * More info here: http://docs.gestpay.it/adv/authorization-request.html
 *
 * Api details: http://api.gestpay.it/#callpagams2s
 *
 */
public class CallPagamS2SExample {

  private static Logger logger = Logger.getLogger("CallPagamS2SExample");

  public static void main(String... args) {

    //writes logs on a single line
    System.setProperty("java.util.logging.SimpleFormatter.format",
        "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");

    //instantiate the webservice
    WSs2S wSs2S = new WSs2S(); 
    WSs2SSoap wSs2SSoap = wSs2S.getWSs2SSoap();

    //input data
    String shopLogin = " GESPAY65987";
    String uicCode = "242"; //euro
    String amount = "42";
    DateFormat df = new SimpleDateFormat("_yyyy-MM-dd-HH-mm-ss-SSS");
    String shopTransactionId = "MYSHOP_" + df.format(new Date());

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
    String subMerchantId = null;
    PaymentTypes paymentTypes = null;
    PaymentDeviceDetails paymentDeviceDetails = null;
    ShippingDetails shippingDetails = null;
    ApplePayRequest applePay = null;
    EcommGestpayPaymentDetails orderDetails = null;

    //set a value if you use apiKey authentication
    String apiKey = null; 

    //call Gestpay...
    CallPagamS2SResponse.CallPagamS2SResult callPagamS2SResult = wSs2SSoap.callPagamS2S(
      shopLogin, 
      uicCode, 
      amount, 
      shopTransactionId, 
      cardNumber, 
      expiryMonth, 
      expiryYear,
      buyerName, 
      buyerEmail, 
      languageId, 
      cvv, 
      null, 
      transKey, 
      paRes, 
      customInfo, 
      null, 
      requestToken, 
      tokenValue,
      clientIP, 
      itemType, 
      recurrent,
      subMerchantId, 
      paymentTypes,
      paymentDeviceDetails,
      shippingDetails, 
      null, 
      null, 
      null, 
      null, 
      null, 
      null, 
      null, 
      applePay, 
      null, 
      orderDetails, 
      apiKey); 

    if (callPagamS2SResult.getContent() == null) {
      showErrorMessage();
    }

    // use DOM api to retrieve data from webservice
    Element response = (Element) callPagamS2SResult.getContent().get(0);

    logNode(response);

  }

}
