import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestClass {
	public String unusedVariable;
//	private String[] test123;
//	private static CallerTest1 callerTest1;
	protected Map<Set<String>, Integer> testMap1;
	protected HashMap testMap2;
	private TestInnerClass.TestInnerInnerClass testInnerInnerClass;

	public static void main(String[] args) {
		TestClass.TestInnerClass testInnerClass = new TestInnerClass();
		testInnerClass.innerString1 = "aaa";
		
	}
	private String[] testMethod1(Object str1){
		String[] ret = new String[]{"testt hihihi", "abcc" + str1.toString(), "ssss", "xxx", "bbbB", "czxczxc", "123123", "bbbbb", "aaaaaaaaaaaa", "dddddd"};
		return ret;
	}

	private static class TestInnerClass{
		private String innerString1;
		public String innerString2;
		private String[] innerString3;

		public TestInnerClass() {
		}

		public TestInnerClass(String innerString1, String innerString2) {
			this.innerString1 = innerString1;
			this.innerString2 = innerString2;
		}

		private class TestInnerInnerClass{
			private String innerInnerString1;

			public TestInnerInnerClass(String innerInnerString1) {
				this.innerInnerString1 = innerInnerString1;
			}
		}
	}
}