import passport.MapPassport;
import passport.Passport;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        MapPassport mapPassport = new MapPassport();


        Passport popov = new Passport("Иван", "Попов", "Алексеевич", "645_266_637", LocalDate.of(1990,02,21));
        Passport egopova = new Passport("Олеся", "Егорова", "Викторовна", "656_111_600", LocalDate.of(1980,06,01));
        Passport smirnova = new Passport("Евгения", "Смирнова", "Станиславовна", "987222678", LocalDate.of(1979,11,14));
        Passport shmelev = new Passport("Аркадий", "Шмлев", "Игнатьевич", "09845622", LocalDate.of(1996,04,20));
        Passport agapova = new Passport("Таисия", "Агапова", "Ивановна", "777444466", LocalDate.of(1992,05,05));

        mapPassport.addPassport(popov);
        mapPassport.addPassport(egopova);
        mapPassport.addPassport(smirnova);
        mapPassport.addPassport(shmelev);
        mapPassport.addPassport(agapova);

        mapPassport.showInfo();

        mapPassport.searchPassport("09845622");
        mapPassport.searchPassport("7773333333");










    }
}