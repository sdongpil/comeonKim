package com.itwill03.포함;

public class Book {
    /*
     * - 캡슐화하세요
     * - 생성자를 정의하세요
     *
     * <<속성>>
     *  책번호
     *  책제목
     *  책분류
     *  책설명
     *
     * <<기능>>
     *   책정보출력
     *
     */

    private int bookNumber;
    private String bookName;
    private String bookClassification;
    private String bookDescription;


    public Book(int bookNumber, String bookName, String bookClassification, String bookDescription) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookClassification = bookClassification;
        this.bookDescription = bookDescription;
    }


    public void print() {
        System.out.println(bookNumber + "\t" + bookName + "\t" + bookClassification + "\t" + bookDescription);
    }

}
