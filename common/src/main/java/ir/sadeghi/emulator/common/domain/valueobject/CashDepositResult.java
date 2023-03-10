package ir.sadeghi.emulator.common.domain.valueobject;

import java.math.BigDecimal;

public class CashDepositResult {
    private BigDecimal balance;
    private String pan;

    public CashDepositResult(BigDecimal balance, String pan) {
        this.balance = balance;
        this.pan = pan;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
