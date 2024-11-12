package Question1;

public class DaysFormatClass {

    static void convertDaysToFormat(int N) {
        int years = 0;
        int months = 0;
        int days = 0;
        int totalDays = N;
        int yearCount = 0;
        int monthCount = 0;

        while(totalDays >= 365) {
            years++;
            totalDays -= 365;
            yearCount++;

            if(years == 3 && totalDays >=366) {
                yearCount = 0;
                years++;
                totalDays -= 366;
            }
        }

        while (totalDays >= 31) {
            months++;
            totalDays -= 31;
            monthCount++;
            if (monthCount == 1 && totalDays>=28) {
                monthCount++;
                months++;
                totalDays -= 28;
            }
            if (totalDays >= 30 && monthCount != 2 ) {
                months++;
                totalDays -= 30;
            }
        }
        days = totalDays;

        System.out.println(totalDays + " Days = " + years + " years, " + months + " months, " + days + " days");
    };

    public static void main(String[] args) {

        convertDaysToFormat(456);
        convertDaysToFormat(1627);
    }
}
