package fr.IlannStefanovitch.Tp2.Exo3;

public class MyDate {

    private int year;
    private int month;
    private int day;
    public static String[] MONTHS ={"Jan","Feb","Mar", "Apr", "May", "Jun","Jul"
            , "Aug", "Sep", "Oct","Nov", "Dec" };
    public static  String[] DAY = {"Sunday","Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"} ;
    public static  int[] DaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public boolean isGoodDate(int year, int month, int day) {
        if (year <= 999 || year >= 1999) {
            if(month == 1 || month == 12 || month == 3 || month == 5 || month == 7 || month == 8) {
                return day <=31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day <= 30;
            }else {
                 return day <=28;
            }
        }else {
            return false;
        }

    }
    public int getDayOfWeek(int year, int month, int day) {
        //utilisation de la Congruence de Zeller
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int K = year % 100;
        int J = year / 100;

        int f = day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J;
        int dayOfWeek = f % 7;

        return (dayOfWeek + 5) % 7 + 1;
    }

    public void setDate(int year, int month, int day) {
        if (isGoodDate(year, month, day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else {
            System.out.println("Error");
        }
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public String toString() {
        return DAY[getDayOfWeek(year, month, day)] + "PPPP "+ day+" DDDDD" + MONTHS[month] + "CCCCC " + year ;

    }









}
