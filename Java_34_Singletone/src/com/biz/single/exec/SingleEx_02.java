package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SafeSingleClassV1 ssc = SafeSingleClassV1.getInstance();
		
		ssc.setName("홍길동");
		ssc.setNation("Republic of Korea");
		
		SafeSingleClassV1 ssc1 = SafeSingleClassV1.getInstance();
		
		System.out.println("너느 누눅냐 " + ssc1.getName());
		System.out.println("너느고향이 어디냐 " + ssc1.getNation());

	}

}
