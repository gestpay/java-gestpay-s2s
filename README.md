# java-gestpay-s2s

## Prerequisites

- Java 7+
- Maven

## Generate classes

In case of changes to the endpoint, you might want to regenerate classes. You can do it with this command:

  ```terminal
  $ wsimport \
  -keep \
  -s src/main/java/ \
  -p it.gestpay.wss2s.model \
  -Xnocompile \
  https://testecomm.sella.it/gestpay/gestpayws/WSs2s.asmx?WSDL
  ```

## Debugging
To see the actual `http` and `xml` data passing over the net, you can add this snippet at the top of the class to test:

 ```java

public class ClassToTest {

	static {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	}
	...
}
 ```

