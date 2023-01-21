package ir.sadeghi.emulator.atm.dto;

import java.math.BigDecimal;

public class CashWithdrawResult {
    private String status;
    private BigDecimal amount;

    public CashWithdrawResult(String status, BigDecimal amount) {
        this.status = status;
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
