package tek.bdd.utility;

public class RandomEmailPick {

    public static String getEmail(String chosenName){
        int random = (int) (Math.random()*1000);
        return chosenName + random + "@gmail.com";
    }

}
