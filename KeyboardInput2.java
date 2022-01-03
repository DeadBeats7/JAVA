import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		String name = stdIn.next();		//앞 예시와 같이 키보드로부터 문자열로 입력받는다.
		int i = stdIn.nextInt();		//여기선 키보드로부터 나이를 정수로 입력받는다. int를 사용해서 정수로 받는다.
		double d = stdIn.nextDouble();		//double을 사용했다. 키보드로부터 몸무게를 실수로 입력받는다. 
		System.out.println(name + "씨의 나이는 " + i + "세이고");
		System.out.println("몸무게는 " + d + "Kg 입니다");
	}
}