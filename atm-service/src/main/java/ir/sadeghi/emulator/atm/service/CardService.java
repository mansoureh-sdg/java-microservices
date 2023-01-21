package ir.sadeghi.emulator.atm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ir.sadeghi.emulator.common.domain.valueobject.*;
import java.math.BigDecimal;
import java.util.logging.Logger;

@Service
public class CardService {
    static Logger logger = Logger.getLogger(CardService.class.getName());

    //@Qualifier("userInfoRestTemplate")
    @Autowired
    private RestTemplate restTemplate;
    
    public CardVerification checkCard(String pan) {
        String url = "http://bank-service/v1/bank/" +pan;
        ResponseEntity<CheckingCardRes> result = restTemplate.getForEntity(url, CheckingCardRes.class);

        logger.info(pan+"verified");
        return new CardVerification();
    }

    public CashDepositResult cashDeposit(String pan, BigDecimal amount) {
        logger.info("cash deposit "+pan);
        return new CashDepositResult(amount, pan);
    }

    public CashWithdrawResult cashWithdraw(String pan, BigDecimal amount) {
        logger.info("cash deposit "+pan);
        return new CashWithdrawResult(amount, pan);
    }
}
