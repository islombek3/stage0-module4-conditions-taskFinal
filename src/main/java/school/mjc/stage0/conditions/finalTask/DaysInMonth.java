package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month > 0 && month < 13 && year > 0){
            switch (month){
                case 2:
                    switch (year){
                        case 1976:case 1980:case 1984:case 1988:case 1992:case 1996:case 2000:
                        case 2004:case 2008:case 2012:case 2016:case 2020:case 2024:
                            System.out.println(29);
                            break;
                        default:
                            System.out.println(28);
                            break;
                    }
                    break;
                case 1:case 3:case 5:case 7:case 8:
                    System.out.println(31);
                    break;
                case 4:case 6:case 9:case 10:case 11:
                    System.out.println(30);
                    break;
            }
        } else {
            System.out.println("invalid date");
        }      
    }
}
