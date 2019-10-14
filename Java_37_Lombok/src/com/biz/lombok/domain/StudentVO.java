package com.biz.lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



/*
 * 
 * lombok.jar(롬복프로젝트)
 * 
 * domain, model 클래스에서 getter(), setter(), toString(), 생성자 등의 코드를 자동으로 생성해주는 3rd Party Library
 * 
 * 이클립스와 같은 IDE에서는 일단 agent(plugin)을 설치해주고 프로젝트에서는 build path로 lombok.jar 파일을 add해 사용할 수 있음
 * 
 */




@Getter			// Annotation Java확장 키워드 , Java 컴파일러가 해당 키워드로 작성된 클래스를 가져다 코드를 완성해 컴파일 시켜줌
@Setter
@ToString
@AllArgsConstructor	// feild 생성자
@NoArgsConstructor	// 기본 생성자
@Builder	// 빌더패턴
@Data			// @Data는 lombok에서 사용할 수 있는 모든 것을 enable하는 키워드이지만 실제 사용하지 않는 method들을 생성해
						// 코드 낭비하기도 함, @Data보다는 필요한 항목만 설정해 사용하는 것이 좋음
public class StudentVO {

	
	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;
	private String s_dept;
	
	
}
