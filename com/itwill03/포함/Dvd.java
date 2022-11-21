package com.itwill03.포함;

public class Dvd {

  /*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 *
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 *
	 * <<기능>>
	 *   Dvd정보출력
	 *
	 */

    private int number;
    private String title;
    private String genre;


    public Dvd(int number, String title, String genre) {
        this.number = number;
        this.title = title;
        this.genre = genre;
    }

    public void print() {
        System.out.println(number + "\t" + title + "\t" + genre);
    }
}

