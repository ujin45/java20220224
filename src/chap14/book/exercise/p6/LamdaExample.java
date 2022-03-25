package chap14.book.exercise.p6;

import java.util.function.ToIntFunction;

public class LamdaExample {

	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	// avg() 메소드 작성

	public static double avg(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student student : students) {
			sum += f.applyAsInt(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}

	public static void main(String[] args) {

		double englishAvg = avg((Student s) -> {
			return s.getEnglishScore();
		});
		System.out.println("영어평균점수: " + englishAvg);

		//		double mathScoreAvg = avg(s-> s.getMathScore());
		// 위 람다식 한 줄 표현을 풀어쓰면 아래와 같다. 
		ToIntFunction<Student> a = new ToIntFunction<LamdaExample.Student>() {
			@Override
			public int applyAsInt(Student param) {
				return param.getMathScore();
			}
		};
		double mathAvg = avg(a);
		System.out.println("수학평균점수: " + mathAvg);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public int getMathScore() {
			return 0;
		}

		public int getEnglishScore() {
			return 0;
		}
	}

}