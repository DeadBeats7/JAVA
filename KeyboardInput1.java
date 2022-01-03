import java.util.Scanner;	//라이브러리 클래스를 포함한다.

public class KeyboardInput1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		//키보드로 입력하기 위해 Scanner 객체를 생성해준다. 밑에 몇번째 프로그램인지 키보드로 적어넣을 수 있다.
		System.out.print("몇 번째 프로그램인지 입력하세요 : ");
		String s = stdIn.next();	//앞에서 받은 입력을 문자열로 받는다. String 사용
		System.out.println(s + " 번째로 작성해 보는 자바 프로그램 입니다.");
	}
}
