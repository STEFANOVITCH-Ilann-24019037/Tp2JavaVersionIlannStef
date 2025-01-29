package fr.IlannStefanovitch.Tp2.Exo1_3;

import fr.IlannStefanovitch.Tp2.Exo3.MyTime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
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
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
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
    public Time nexSecond() {

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
        return new Time(hour, minute, second);
    }
    public Time previousSecond() {
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
        return new Time(hour, minute, second);
    }
}
