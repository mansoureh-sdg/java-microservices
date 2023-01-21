package ir.sadeghi.emulator.atm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.apache.log4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;


import ir.sadeghi.emulator.atm.dto.*;
import ir.sadeghi.emulator.atm.service.CardService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin()
public class ATMController {
    @Autowired
    private CardService cardService;
    
    @Autowired
    DiscoveryClient client;

    @RequestMapping("/service")
    public List<String> home() {
        return client.getServices();
    }

    @RequestMapping({ "/checkCard" })
    public ResponseEntity<CardVerification> checkCard(@RequestBody String pan){
        CardVerification  cardVerification = cardService.checkCard(pan);
        return new ResponseEntity<>(cardVerification, HttpStatus.OK);
    }

    @RequestMapping({ "/cashDeposit" })
    public ResponseEntity<CashDepositResult> cashDeposit(@RequestBody String pan, BigDecimal amount){
        CashDepositResult cashDepositResult = cardService.cashDeposit(pan, amount);
        return new ResponseEntity<>(cashDepositResult, HttpStatus.OK);
    }

    @RequestMapping({ "/cashWithdraw" })
    public ResponseEntity<CashWithdrawResult> cashWithdraw(@RequestBody String pan, BigDecimal amount){
        CashWithdrawResult cashWithdrawResult = cardService.cashWithdraw(pan, amount);
        return new ResponseEntity<>(cashWithdrawResult, HttpStatus.OK);
    }

}
