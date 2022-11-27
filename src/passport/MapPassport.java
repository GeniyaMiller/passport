package passport;

import java.util.HashMap;
import java.util.Map;

public class MapPassport {
    public static HashMap<String, Passport> mapPassport = new HashMap<>();


    public void addPassport(Passport passport){
        mapPassport.put(passport.getPassportNumber(), passport);
    }

    public void searchPassport(String passportNumber){
        if(mapPassport.containsKey(passportNumber)){
            System.out.println("Найдены данные: " + mapPassport.get(passportNumber));
        } else {
            System.out.println("Данные отсутствуют");
        }
    }

    public void showInfo(){
        for (Map.Entry<String, Passport> passportEntry: mapPassport.entrySet()) {
            System.out.println("Паспорт " + passportEntry.getKey() + ": " + passportEntry.getValue());
        }
    }
}
