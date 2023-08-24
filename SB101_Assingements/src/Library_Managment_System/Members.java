package Library_Managment_System;

import java.util.Date;

public class Members {
	
	private int memberId; //unique
	private String memberName;
	private String memberShipNo; //unique
	private Date memberShipEndDate;
	
	public Members(int memberId, String memberName, String memberShipNo, Date memberShipEndDate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberShipNo = memberShipNo;
		this.memberShipEndDate = memberShipEndDate;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberShipNo() {
		return memberShipNo;
	}

	public void setMemberShipNo(String memberShipNo) {
		this.memberShipNo = memberShipNo;
	}

	public Date getMemberShipEndDate() {
		return memberShipEndDate;
	}

	public void setMemberShipEndDate(Date memberShipEndDate) {
		this.memberShipEndDate = memberShipEndDate;
	}
	
}
