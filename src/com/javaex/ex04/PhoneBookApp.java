package com.javaex.ex04;

import java.util.ArrayList;

public class PhoneBookApp {

	public static void main(String[] args) {
		
		//쓰기 빨대 쓰면 파일 다 지워짐
		
		//파일에서 읽은	 내용을 리스트로 관리
		ArrayList<Person> pList = new ArrayList<Person>();
		
		Person p01 = new Person("이효리","010-2222-3333","031-2323-4441");
		
		pList.add(p01);
		//(이름,핸드폰,회사)--->Person 클래스
		
		//자신의 정보 Person 리스트에 추가하고
		
		//리스트 전체내용을 PhoneDB.txt에 쓴다
		

	}

}
