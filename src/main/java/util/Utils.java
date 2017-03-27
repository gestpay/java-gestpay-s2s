package util;

import org.w3c.dom.Node;

import java.util.logging.Logger;

/**
 * Created by michelenasti on 27/03/17.
 */
public class Utils {

  private static final Logger logger = Logger.getLogger("GestpayExample");

  public static void logNode(Node node) {
    logNode(node, 0);
  }

  public static void logNode(Node node, int level) {
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

  private static String repeat(String s, int count) {
    return count > 0 ? s + repeat(s, --count) : "";
  }

  /**
   * Shows an error in case of problems.
   */
  public static void showErrorMessage() {
    logger.severe("No response received from webservice.");
  }
}
