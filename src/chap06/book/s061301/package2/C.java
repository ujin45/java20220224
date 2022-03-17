package chap06.book.s061301.package2;

import chap06.book.s061301.package1.B;

public class C {
	A a; //A클래스 package private여서 다른 패키지에 있는 C클래스에서 사용 불가
	B b; //B클래스 public여서  다른 패키지에 있는 c클래스에서 사용 가능 
}
