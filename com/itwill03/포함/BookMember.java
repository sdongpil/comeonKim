package com.itwill03.포함;

public class BookMember {
    /*
	- 캡슐화
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
//    private Book rentBook;
	/*
	<<기능>>
	  회원정보출력
	 */


    private int memberNumber;
    private String memberName;
    private String phoneNumber;
    private Book rentBook;


    public BookMember(int memberNumber, String memberName, String phoneNumber) {
        this.memberNumber = memberNumber;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;
    }

    public void setRentBook(Book rentBook) {
        this.rentBook = rentBook;
    }

    public void print() {
        System.out.println(this.memberNumber + "\t" + this.memberName + "\t" + this.phoneNumber);
        this.rentBook.print();
    }

}
