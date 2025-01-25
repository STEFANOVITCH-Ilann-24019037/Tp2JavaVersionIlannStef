package fr.IlannStefanovitch.Tp2.Exo3;

public class MyTime {
    private int hour = 0 ;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public MyTime(){}

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(hour < 10) {

            sb.append("0").append(hour);
        }
        else {
            sb.append(hour);
        }
        if (minute < 10) {
            sb.append(":0").append(minute);
        }
        else {
            sb.append(":").append(minute);
        }
        if (second < 10) {
           sb.append(":0").append(second);
        }
        else {
            sb.append(":").append(second);
        }
        return sb.toString();
    }
    public MyTime nexSecond() {

        if (second == 59) {
            second = 0;
            minute++;
        }
        else {
            second++;
        }
        if (minute == 59) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }
    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            hour++;
        }
        else {
            minute++;
        }
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }
    public MyTime nextHour() {
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }
    public MyTime previousHour() {
         if (hour == 0) {
             hour = 24;
         }
         else {
             hour--;
         }
        return new MyTime(hour, minute, second);
    }
    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
            hour--;
        }
        else {
            minute--;
        }
        return new MyTime(hour, minute, second);
    }
    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            minute--;
        }
        else {
            second--;
        }
        if (minute == 0) {
            minute = 59;
            hour--;
        }
        if (hour == 0) {
            hour = 24;
        }
        return new MyTime(hour, minute, second);


    }




}
