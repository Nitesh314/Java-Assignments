package Library_Managment_System;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books to the Library
        library.addBooks(new Books(101, "Java Programming", "John Doe"));
        library.addBooks(new Books(102, "Python Basics", "Jane Smith"));
        library.addBooks(new Books(103, "Data Structures and Algorithms", "Alice Johnson"));
        library.addBooks(new Books(101, "Java Programming", "John Doe")); // Duplicate book with ID 101

        // Adding Members to the Library
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse("2023-08-15");
            Date date2 = sdf.parse("2023-07-31");
            Date date3 = sdf.parse("2023-08-10");
            Date date4 = sdf.parse("2023-07-28");
            Date date5 = sdf.parse("2023-08-05");

            library.addMembers(new Members(501, "John", "MEM12345", date1));
            library.addMembers(new Members(502, "Alice", "MEM67890", date2));
            library.addMembers(new Members(503, "Bob", "MEM12345", date3)); // Duplicate memberId 501
            library.addMembers(new Members(504, "Sarah", "MEM45678", date4));
            library.addMembers(new Members(505, "Michael", "MEM55555", date5));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Displaying Books in the Library
        library.displayBooks();

        // Displaying Members whose membership is ending first
        System.out.println("Members whose membership is ending first:");
        for (Members member : library.getMembersByMembershipEndDateAscending()) {
            System.out.println(member.getMemberShipEndDate());
        }
    }
}

