import java.util.*;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		중첩 if문
//		 if(조건식1) {
//			 조건식 1의 연산결과가 true 일때
//			if(조건식2) {
//				 조건식 2의 연산결과가 true 일때
//			 }else {조건식2일 false 일 때
//				 }
//		 }else {조건식1일 false 일 때
//		 }
//		 95점 이상이면 A+
//		 93~94 A
//		 92점 이하면 A-
		
		Scanner scan = new Scanner (System.in);
		
		int score = 0;
		String grade ="";
		
		
		System.out.println("점수를 입력하세요");
		
		score = scan.nextInt();
		
		
		if (score >= 90) {
			grade = "A-";
			if (score >= 93 && score < 95) {
				grade = "A";
			} else if (score >= 95 && score <= 100) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B-";
			if (score >= 83 && score < 85) {
				grade = "B";
			} else if (score >= 85 && score < 90) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C-";
			if (score >= 73 && score < 75) {
				grade = "C";
			} else if (score >= 75 && score < 80) {
				grade = "+";
			}
		} else { 
			grade = "F";
		}
		System.out.println(grade);
		
	}
}
