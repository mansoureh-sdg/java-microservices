package ir.sadeghi.emulator.common.domain.valueobject;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String pan;
	private String pin;
	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String pan, String pin) {
		this.setPan(pan);
		this.setPin(pin);
	}

	/**
	 *
	 * @return card number
	 */
	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 *
	 * @return card pin (password)
	 */
	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}