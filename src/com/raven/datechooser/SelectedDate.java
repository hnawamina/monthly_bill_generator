package com.raven.datechooser;

/**
 *
 * @author Administrator
 */
public class SelectedDate {

    /**
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     *
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     * @param day
     * @param month
     * @param year
     */
    public SelectedDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     *
     */
    public SelectedDate() {
    }

    private int day;
    private int month;
    private int year;
}
