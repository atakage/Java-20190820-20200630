package com.biz.gp.domain;



/*
 * 
 *  객체를 생성하면서 필드 값을 주입하는 생성자의 기능 + 필드 이름과 같은 setter() method를 통해서 값을 주입하는 기능의 장점을 모아 만든 패턴
 *	
 *	1. 생성자를 통해 주입할 때 어떤 필드에 값을 주입하는지 불명확할 때
 * 
 * 
 * 
 * 
 * 
 * 
 * 	일일이 vo 객체를 별도 생성해서 add()를 수행하는 자바빈즈의 패턴의 비효율성을 줄이고
 * 	생성자를 사용할 때 발생하는 필드변수에 잘못된 값이 추가되는 잠재적 오류를 줄이는
 * 
 * 	많은 객체를 List에 추가할 때 사용할 수 있는 패턴
 * 
 */
public class ScoreVO {

	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;

	public ScoreVO() {
		// TODO Auto-generated constructor stub

	}

	

	private ScoreVO(Builder builder) {						// Builder 클래스는 현재 ScoreVO가 가지고 있는 Inner class
		// TODO Auto-generated constructor stub
		

		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
	}

	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}

	public static class Builder {
		
		
		
		/*
		 * 1. Builder 클래스를 선언
		 * 2. 실제 클래스(ScoreVO)의 필드변수를 복사하여 붙이기
		 * 3. 
		 */

		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;

		public Builder() {
			// TODO Auto-generated constructor stub
		}

		public Builder s_num(String s_num) {		// 객체 메서드 chaining 방법으로 코딩하기 위한 (ex Builder().s_num("001").s_kor(90).s_eng(80).s_math(70).build()...)
													
			this.s_num = s_num;
			return this;
		}

		public Builder s_kor(int s_kor) {
			this.s_kor = s_kor;
			return this;
		}

		public Builder s_eng(int s_eng) {
			this.s_eng = s_eng;
			return this;
		}

		public Builder s_math(int s_math) {
			this.s_math = s_math;
			return this;
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
		
		
	}

}
