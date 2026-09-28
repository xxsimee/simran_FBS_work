class Date
{	
	int day;
	int month;
	int year;
	String dow;
	
	Date() {
		this.day = 0;
		this.month =0;
		this.year = 0;
		this.dow="Not Given";
	}
	Date(int day, int month, int year,String dow) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow=dow;
	}
	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		this.month = month;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getDow() {
		return dow;
	}
	void setDow(String dow) {
		this.dow = dow;
	}
	public String toString() {
		return"\nDay: "+this.day+"\nMonth: "+this.month+"\nYear:"+this.year+"\nDay of the week:"+this.dow;
	}
}

class DateTest {

	public static void main(String[] args) {
		Date d1;
		d1=new Date(13,3,2026,"Friday");
		System.out.println(d1);
		
		System.out.println("Hashcode: "+d1.hashCode());
		

	}

}
