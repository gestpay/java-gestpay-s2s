# java-gestpay-s2s

This repository contains examples of Gestpay Server-to-Server capabilities (also called S2S).

It has been developed with one goal in mind: to be as clear as possible. That's why we don't use any external library.

These examples are compiled against Gestpay test endpoints; to switch endpoint and regenerate classes, see `Generate new
classes` section.

 All Gestpay S2S functions are discussed in the
 [docs](http://docs.gestpay.it/adv/integrating-with-your-custom-backend.html) and in the
 [API](http://api.gestpay.it/#wss2s-api).

## Prerequisites

- Java 7+
- Maven

Before running anything, check to:

- Have a Gestpay test account
- have added your external IP address to Gestpay configuration
- have modified all the input parameters of your example.

## How to run

`cd` in the project directory.

Compile everything:

```console
$ mvn clean install
```

Compiled classes are in `target/classes` directory.

So, to start an example, you could launch (from terminal):

```console
$ cd target/classes
$ java examples.CallIdealListS2SExample
```

that's it.

## Generate new classes

In case of changes to the endpoint, you might want to regenerate classes. You can do it with this command:

  ```terminal
  $ wsimport \
  -keep \
  -s src/main/java/ \
  -p it.gestpay.wss2s.model \
  -Xnocompile \
  https://sandbox.gestpay.net/gestpay/gestpayws/WSs2s.asmx?WSDL
  ```

If you want to generate classes for **production** endpoint, substitute last line with `https://ecomms2s.sella.it/gestpay/gestpayws/WSs2s.asmx?WSDL
`.

## Content of this repository

- `src/main/java`: contains all source code.
- `examples` package: contains examples, in the form of executable classes.
- `it.gestpay.wss2s.model` package: contains the webservice and Gestpay model classes.
- `util` package: contains a `Utils.java` file with some logging utilities.

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

