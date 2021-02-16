/*
Autor: Abraham Gómez Muñoz
 */
package birthdayprogrammerabraham;


public class BirthdayProgrammerAbraham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int day=13, month=9, year=2021;
    String stDat=birtDay_ZellerMonlau(day, month, year);
    System.out.println("International programmer's day: "+stDat + "sep2021");
    }

    private static String birtDay_ZellerMonlau(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
    
}
