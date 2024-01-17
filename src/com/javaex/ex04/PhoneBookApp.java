package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {

		// 쓰기 빨대 쓰면 파일 다 지워짐
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		List<Person> pList = new ArrayList<Person>();
		Person p01 = new Person("박종희", "010-2322-3133", "031-2453-4111");
		pList.add(p01);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			// 파일에서 읽은 내용을 리스트로 관리
			String[] personInfo = str.split(",");
			
			Person p02 = new Person(personInfo[0], personInfo[1], personInfo[2]);
			pList.add(p02);
		}
		Writer wt = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wt);

		for (int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());
			bw.newLine();
			System.out.println(pList.get(i).getName() + "," + pList.get(i).getHp() + "," + pList.get(i).getCompany());

		}

		// 자신의 정보 Person 리스트에 추가하고

		// 리스트 전체내용을 PhoneDB.txt에 쓴다
		bw.close();
		br.close();

	}

}
