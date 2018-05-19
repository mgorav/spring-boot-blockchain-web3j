package com.gm.bloackchain.web3j.blockchainweb3j.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;

import java.io.IOException;

@RestController
@RequestMapping(value = "/web3j")
public class Web3jController {

    @Autowired
    private Web3j web3j;

    @GetMapping("/version")
    String version() throws IOException {

        return web3j.web3ClientVersion().send().getWeb3ClientVersion();
    }
}
