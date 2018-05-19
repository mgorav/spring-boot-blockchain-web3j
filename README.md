## Block Chain Using web3j + ethereum

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