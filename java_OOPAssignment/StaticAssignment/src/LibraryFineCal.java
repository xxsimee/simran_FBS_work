class LibraryUser{
	String userName;
	int dayLate;
	static double fine=10.5;
	
	LibraryUser() {
		this.userName = "Not Given";
		this.dayLate = 0;
	}
	LibraryUser(String userName, int dayLate) {
		this.userName = userName;
		this.dayLate = dayLate;
	}
	
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	int getDayLate() {
		return dayLate;
	}
	void setDayLate(int dayLate) {
		this.dayLate = dayLate;
	}
	static double getFine() {
		return fine;
	}
	static void setFine(double fine) {
		LibraryUser.fine = fine;
	}
	double calFine() {
		return dayLate*fine;
	}
	
	void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Days Late: " + dayLate);
        System.out.println("Fine Per Day: " + fine);
        System.out.println("Total Fine: " + calFine());
    }
}
class LibraryFineCal {

	public static void main(String[] args) {
		LibraryUser u1 = new LibraryUser("Simran", 4);
        LibraryUser u2 = new LibraryUser("Rita", 7);

        System.out.println("First User:");
        u1.display();

        System.out.println();

        System.out.println("Second User:");
        u2.display();

        System.out.println();

        LibraryUser.setFine(10.0);

        System.out.println("After Updating Fine as per day:");

        u1.display();

        System.out.println();

        u2.display();

	}

}
