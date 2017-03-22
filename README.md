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
  https://ecomms2s.sella.it/gestpay/gestpayws/WSs2s.asmx\?WSDL
  ```

