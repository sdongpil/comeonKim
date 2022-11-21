package com.itwill03.포함;

public class DvdShopMain {
    public static void main(String[] args) {
        /*
         * 회원객체생성
         */
        DvdMember dongpilSon = new DvdMember(1, "손동필", "010-5555-1234");


        /*
         * Dvd객체생성
         */
        Dvd myMister = new Dvd(15, "나의 아저씨", "드라마");



        /*
         * 회원이Dvd을 대여
         *
         * Dvd객체참조변수를 회원의 멤버변수에대입
         */

        dongpilSon.setRentDvd(myMister);


        /*
         * 회원정보출력(회원이빌린Dvd정보출력)
         */

        dongpilSon.print();
    }

}
