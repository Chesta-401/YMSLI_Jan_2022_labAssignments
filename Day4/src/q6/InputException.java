package q6;

public class InputException extends RuntimeException{
	public InputException(int n){
		super("Number can’t be greater than "+n);
	}
}
