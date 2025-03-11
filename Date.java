import java.util.*;

class Date {

    private int dd, mm, yy;

    public void getDate() {
        System.out.println(dd + "/" + mm + "/" + yy);
    }

    public void setDate(int d, int m, int y) {
        dd = d;
        mm = m;
        yy = y;
    }

    public void getter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day,month and year");
        dd = sc.nextInt();
        mm = sc.nextInt();
        yy = sc.nextInt();
    }

}