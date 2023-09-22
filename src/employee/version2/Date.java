package employee.version2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        String date = this.day + "-" + this.month + "-" + this.year;
        return date;
    }
}
