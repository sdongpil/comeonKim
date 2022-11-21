package com.itwill03.포함;

public class BookLibraryMain {
    public static void main(String[] args) {

        /*
         * 회원객체생성
         */
        BookMember dongpil = new BookMember(01, "손동필", "010-666-666");


        /*
         * 책객체생성
         */
        Book javaBook = new Book(11, "객체지향", "자바", "캡,상,추,다");

        /*
         * 회원이 책들 대여
         *
         * 책객체참조변수를 회원의 멤버변수에대입
         */
        dongpil.setRentBook(javaBook);


        /*
         * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
         */
        dongpil.print();

    }
}
