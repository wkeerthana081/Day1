class UniversityMember {
    int memberId;
    void checkIn() {
        System.out.println("Member checked in");
    }
}
class Staff extends UniversityMember {
    String department;
    void attendMeeting() {
        System.out.println(department + " staff is attending meeting");
    }
}
class Professor extends Staff {
    String subject;
    void conductLecture() {
        System.out.println("Professor is teaching " + subject);
    }
}
class AdminOfficer extends Staff {
    String officeRoom;
    void processFiles() {
        System.out.println("Processing files in " + officeRoom);
    }
}
class emp3 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.memberId = 101;
        p.department = "CSE";
        p.subject = "Java";
        AdminOfficer a = new AdminOfficer();
        a.memberId = 102;
        a.department = "Administration";
        a.officeRoom = "Room 10";
        p.checkIn();
        p.attendMeeting();
        p.conductLecture();
        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}