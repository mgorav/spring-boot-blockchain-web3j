## Block Chain Using web3j + ethereum

First step to build decentralized application using block chain (web3j + ethereum) is by creating contract (example votting.sol -  decentralized voting protocol) using contract oriented language solidity and we are ready to enter into new architecture style, design thinking & development - termed [decentralization](https://en.wikipedia.org/wiki/Blockchain).

IntelliJ solidity support is good and is highly recommended.  Also thanks to web3j maven solidity plugin to bring us back to java world by generating java based contract :-) The programming model and ease of development is key to success of any technology. Spring BOOT + web3j make it ease to build blockchain based applications. 

Block chain will be one of the disruptive technology in near future.Some of the potential use cases of BlockChain technologies:
1. Financial Service - [Payment services](https://lnkd.in/eckdDHm) etc
2. Health Insurance - Potential solutions for interoperability and data exchange and for more details [read article](https://lnkd.in/eyP6qSv)
3. Subscriptions management 
5. Vehicles registration/history - to avoid vehicle fraud, checkout super [article](https://lnkd.in/e2san5f)
6. ......

NOTE: java9+ is not supported by web3j solidity compiler contract generation

### Pre-requisite

Run ethereum node using geth (google go client)

```
brew tap ethereum/ethereum
brew install ethereum
geth --rpcapi personal,db,eth,net,web3 --rpc --rinkeb
```

## Sending request via HTTP

To send http synchronous requests using [httpie](https://httpie.org)

http :4020/web3j/version

### Convert voting.sol to java
 
 ```
  mvn web3j:generate-sources
 ```

Vola!!! Ready to enter in de-centralized application building.