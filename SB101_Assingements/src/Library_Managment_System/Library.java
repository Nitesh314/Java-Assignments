package Library_Managment_System;

import java.util.*;

public class Library {
    private List<Books> books;
    private List<Members> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBooks(Books book) {
        if (!hasBookWithId(book.getBookId())) {
            books.add(book);
            System.out.println("Book added: " + book.getBookName());
        } else {
            System.out.println("Duplicate book with ID " + book.getBookId() + " not allowed.");
        }
    }

    public void addMembers(Members member) {
        if (!hasMemberWithId(member.getMemberId()) && !hasMemberWithMembershipNo(member.getMemberShipNo())) {
            members.add(member);
            System.out.println("Member added: " + member.getMemberName());
        } else {
            System.out.println("Duplicate member with ID " + member.getMemberId() + " or membershipNo " +
                    member.getMemberShipNo() + " not allowed.");
        }
    }

    private boolean hasBookWithId(int bookId) {
        for (Books book : books) {
            if (book.getBookId() == bookId) {
                return true;
            }
        }
        return false;
    }

    private boolean hasMemberWithId(int memberId) {
        for (Members member : members) {
            if (member.getMemberId() == memberId) {
                return true;
            }
        }
        return false;
    }

    private boolean hasMemberWithMembershipNo(String membershipNo) {
        for (Members member : members) {
            if (member.getMemberShipNo().equals(membershipNo)) {
                return true;
            }
        }
        return false;
    }

    public List<Members> getMembersByMembershipEndDateAscending() {
        List<Members> memberList = new ArrayList<>(members);
        memberList.sort(Comparator.comparing(Members::getMemberShipEndDate));
        return memberList;
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Books book : books) {
            System.out.println(book);
        }
    }
}

