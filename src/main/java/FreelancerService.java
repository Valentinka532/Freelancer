public class FreelancerService {
    public static int calculateMonthsOfRest(int income, int expenses, int threshold) {
        int months = 0;
        int balance = 0;

        for (int i = 1; i <= 12; i++) {
            if (balance >= threshold) {
                // Отдых
                balance -= expenses;
                balance /= 3;
                months++;
            } else {
                // Работа
                balance += income;
                balance -= expenses;
            }
        }

        return months;
    }
}