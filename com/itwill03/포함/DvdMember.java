package com.itwill03.포함;

public class DvdMember {
    /*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	/*
	<<기능>>
	  회원정보출력
	 */

    private int memberNumber;
    private String memberName;
    private String phoneNumber;
    private Dvd rentDvd;

    public DvdMember(int memberNumber, String memberName, String phoneNumber) {
        this.memberNumber = memberNumber;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;

    }

    public void setRentDvd(Dvd dvd) {
        this.rentDvd = dvd;
    }

    public void print() {
        System.out.println(memberNumber + "\t" + memberName + "\t" + phoneNumber);
        this.rentDvd.print();
    }
}
