
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		학점을 등급으로 표현하는 프로그램
//		90<= 학점 <=100 이면 A
//		80<= 학점 <=89 이면 B
//		70<= 학점 <=79 이면 C	
//		60<= 학점 <= 
//			조건식2의 연산결과가 true일 때 수행될 문장
//		}else if (조건식3) { 
//			조건식3의 연산결과가 true일 때 수행될 문장
//		}else {위의 어느 조건식도 만족하지 않을 때 수행될 문장들
		int score = 0;
		String gradeStr = "";
			
		if (score >= 90) {
			gradeStr = "A";
		} else if (score >= 80) {
			gradeStr = "B";
		} else { 
			gradeStr = "F"; 
		}
	
		
		System.out.println("당신의 학점은" + gradeStr + "입니다");
	}
}