package com.krish.iq;

//https://www.educative.io/m/is-the-number-valid
public class StringIsValidNumber1 {

	public static void main(String[] args) {

		String[] values = { "4.325", "4.325a", "x4.325", "4325", "1.", "1.1.", "1.1.1", "1.1.1.", "+1.1.", "-1.1.",
				"-1.1", "+23", "-23" };
		
		for(String val : values) 
			System.out.println(isValidNumber(val) ? val + " is valid" : val + " is not valid");
			
	}
	
	enum STATE { START, INTEGER, DECIMAL, UNKNOWN, AFTER_DECIMAL };
	
	public static boolean isValidNumber(String val) {
		
		if(null == val || val.isBlank())
			return false;
		
		int i = 0;
		if(val.charAt(i) == '+' || val.charAt(i) == '-')
			++i;
		
		STATE currentState = STATE.START;
		
		while (i < val.length()) {
			currentState = getNextState(val.charAt(i), currentState);
			
			if(currentState == STATE.UNKNOWN)
				return false;
			
			i = i + 1;
		}
		
		if(currentState == STATE.DECIMAL)
			return false;
		
		return true;
	}
	
	public static STATE getNextState(char ch, STATE currentState) {
		switch(currentState) {
			case START:
			case INTEGER:
				if(ch == '.')
					return STATE.DECIMAL;
				else if(ch >= '0' && ch <= '9')
					return STATE.INTEGER;
				else
					return STATE.UNKNOWN;
			case DECIMAL:
			case AFTER_DECIMAL:
				if(ch >= '0' && ch <= '9')
					return STATE.AFTER_DECIMAL;
				else
					return STATE.UNKNOWN;
			default:
				return STATE.UNKNOWN;
		}
		
	}

}
