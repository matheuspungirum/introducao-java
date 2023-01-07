import java.util.Calendar;

public class MensagemHoraDoDia {



        public static void main() {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);

            if (hour >= 6 && hour < 12) {
                System.out.println("Bom dia!");
            } else if (hour >= 12 && hour < 18) {
                System.out.println("Boa tarde!");
            } else if (hour >= 18 && hour < 24) {
                System.out.println("Boa noite!");
            } else {
                System.out.println("Boa madrugada!");
            }
        }
    }

