package homeWork3_task1;

public class FullGroupException extends Exception{
	@Override
	public String getMessage() {
		return "This group is full";
	}

}
