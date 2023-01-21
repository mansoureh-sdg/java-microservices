package ir.sadeghi.emulator.common.domain.exception;

public class UserAuthenticationFailureException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2163041062940956985L;

	public UserAuthenticationFailureException(String pan) {
        super(pan);
    }
}
