package homeWork3_task1;

public class StudentException extends Exception {
	@Override
	public String getMessage() {
		return "Student already exsist";
	}
}
