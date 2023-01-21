package ir.sadeghi.emulator.common.domain.exception;

public class CashWithdrawFailureException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4148205990784966586L;

	public CashWithdrawFailureException() {
    }

    public CashWithdrawFailureException(String message) {
        super(message);
    }
}
