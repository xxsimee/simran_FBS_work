class Time {

    int hr;
    int min;
    int sec;

    Time() {
        super();
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    Time(int hr, int min, int sec) {
        super();
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void add(Time t) {

        int s = this.sec + t.sec;
        int m = this.min + t.min + s / 60;
        int h = this.hr + t.hr + m / 60;

        s = s % 60;
        m = m % 60;
        h = h % 24;

        System.out.print(h + ":");
        System.out.print(m + ":");
        System.out.println(s);
    }

    void add(int hr) {

        int h = (this.hr + hr) % 24;

        System.out.print(h + ":");
        System.out.print(this.min + ":");
        System.out.println(this.sec);
    }

    void add(int hr, int min) {

        int m = this.min + min;
        int h = this.hr + hr + m / 60;

        m = m % 60;
        h = h % 24;

        System.out.print(h + ":");
        System.out.print(this.min + ":");
        System.out.println(this.sec);
    }

    void add(int hr, int min, int sec) {

        int s = this.sec + sec;
        int m = this.min + min + s / 60;
        int h = this.hr + hr + m / 60;

        s = s % 60;
        m = m % 60;
        h = h % 24;

        System.out.print(h + ":");
        System.out.print(m + ":");
        System.out.println(s);
    }
}

class TimeTest {

    public static void main(String[] args) {

        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 30, 25);

        System.out.println("Add of two Time:");
        t1.add(t2);

        System.out.println("Add of hours:");
        t1.add(2);

        System.out.println("Add hours and minutes:");
        t1.add(2, 20);

        System.out.println("Add of hours, minutes and seconds:");
        t1.add(2, 20, 30);
    }
}