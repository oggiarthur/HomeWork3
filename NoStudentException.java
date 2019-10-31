package homeWork3_task1;

public class NoStudentException extends Exception {
		@Override
		public String getMessage() {
			return "This student does not exist";
		}
	}

