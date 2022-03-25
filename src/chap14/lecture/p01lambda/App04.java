package chap14.lecture.p01lambda;

public class App04 {

}


// functional interface : 추상 메소드가 1개인 인터페이스 . 검증 해준다. 
@FunctionalInterface
interface MyInerface41 {
	void method1();
}
//@FunctionalInterface  컴파일 에러
interface MyInerface42 {
	void method2();
	void method3();
	
}
//@FunctionalInterface 컴파일 에러 
interface MyInterface43 {
	
}