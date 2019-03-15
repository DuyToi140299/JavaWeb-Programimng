/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyDate {

    private int ngay;
    private int thang;
    private int nam;
    
    public MyDate() {
    }

    public MyDate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void print() {
        System.out.println(this.ngay + "/" + this.thang + "/" + this.nam);
        System.out.printf("Ngày %d Tháng %d Năm %d ", this.ngay, this.thang, this.nam);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày :");
        ngay = sc.nextInt();
        System.out.print("Nhập tháng :");
        thang = sc.nextInt();
        System.out.print("Nhập năm :");
        nam = sc.nextInt();

    }

    public boolean checkValid() {
        
        if (ngay <= 0 || thang <= 0 || nam <= 0 || thang > 12) {
            return false;
        } else {
            if (thang == 2) {
                if (thang % 4 == 0 && nam % 100 != 0 || (nam % 400 == 0)) {
                    if (ngay > 29) {
                        return false;
                    }
                } else {
                    if (ngay > 28) {
                        return false;
                    }
                }
            } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                if (ngay > 30) {
                    return false;
                }
            } else {
                if (ngay > 31) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addDay(int day) {
        this.ngay += day;
        if (checkValid()) {
            switch (this.thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (this.ngay > 31) {
                        this.addMonth(1);
                        int diff = this.ngay - 31;
                        this.ngay = 0;
                        this.addDay(diff);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (this.ngay > 30) {
                        this.addMonth(1);
                        int diff = this.ngay - 30;
                        this.ngay = 0;
                        this.addDay(diff);
                    }
                    break;
                case 2:
                    if (thang % 4 == 0 && nam % 100 != 0 || (nam % 400 == 0)) {
                        if (this.ngay >= 29) {
                            this.addMonth(1);
                            int diff = this.ngay - 29;
                            this.ngay = 0;
                            this.addDay(diff);
                        }
                    } else {
                        if (this.ngay >= 28) {
                            this.addMonth(1);
                            int diff = this.ngay - 28;
                            this.ngay = 0;
                            this.addDay(diff);
                        }
                    }
                    break;

            }

        }

    }

    public void addYear(int years) {
        this.nam += years;
    }

    public void addMonth(int month) {
        this.thang += month;
        if (this.thang > 12) {
            int years = this.thang % 12;
            this.addYear(years);
            this.thang = this.thang/ 12;
        }
    }
    
    
    
    
    

}

