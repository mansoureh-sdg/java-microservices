package ir.sadeghi.emulator.common.domain.exception;

public class AccountBusinessException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7106259031944690929L;

	public AccountBusinessException() {
    }

    public AccountBusinessException(String message) {
        super(message);
    }
}
