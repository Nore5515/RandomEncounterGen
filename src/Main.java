import java.util.Random;

/**
 * Created by Nore5515 on 4/11/2017.
 */
public class Main {

    int risk,reward,importance,age,weatherSav,fertility;

    public static void main(String args[]) {

        Main m = new Main();

        System.out.println("Hello World!");

        System.out.print(m.newEncounter());
        System.out.println("\n"+m.massEncounter(100));
    }

    public String newEncounter(){
        String s = new String();
        Random rand = new Random();
        age = rand.nextInt(5)+1;
        weatherSav = rand.nextInt(5)+1;
        fertility = getHighestRoll(age + 1 - weatherSav);
        risk = getHighestRoll(age + fertility - 4);
        reward = getHighestRoll(risk + fertility + age - 8);
        importance = getHighestRoll(risk - reward);

        //s += "Age:\t" + age;
        s += String.format("%-20s|%d|%n","Age", age);
        s += String.format("%-20s|%d|%n","Weather Savagery",weatherSav);
        s += String.format("%-20s|%d|%n","Fertility",fertility);
        s += String.format("%-20s|%d|%n","Risk",risk);
        s += String.format("%-20s|%d|%n","Reward",reward);
        s += String.format("%-20s|%d|%n","Importance",importance);
        //s += "Weather Savagery"

        return s;
    }

    public String massEncounter(int count){
        String s = new String();
        Random rand = new Random();
        String loc = "BAAH";
        int locTemp = -1;
        int ageTotal,wesTotal,ferTotal,rskTotal,rwdTotal,impTotal;
        ageTotal = 0;
        wesTotal = 0;
        ferTotal = 0;
        rskTotal = 0;
        rwdTotal = 0;
        impTotal = 0;

        s += String.format("%-20s|%3s|%3s|%3s|%3s|%3s|%3s%n","LOCATION","AGE","WES","FER","RSK","RWD","IMP");

        for (int x = 0; x < count; x++){
            age = rand.nextInt(5)+ 1);
            weatherSav = getHighestRoll(rand.nextInt(5)+1);
            fertility = getHighestRoll(age + 1 - weatherSav);
            risk = getHighestRoll(age + fertility - 4);
            reward = getHighestRoll(risk + fertility + age - 8);
            importance = getHighestRoll(risk - reward);
            locTemp = rand.nextInt(8)+1;


            s += String.format("%-20s|%-3d|%-3d|%-3d|%-3d|%-3d|%-3d%n",loc,age,weatherSav,fertility,risk,reward,importance);

            ageTotal += age;
            wesTotal += weatherSav;
            ferTotal += fertility;
            rskTotal += risk;
            rwdTotal += reward;
            impTotal += importance;
        }
        s += "-----------------------------";
        s += String.format("%n%-3d|%-3d|%-3d|%-3d|%-3d|%-3d%n", ageTotal/count,wesTotal/count,ferTotal/count,rskTotal/count,rwdTotal/count,impTotal/count);

        return s;
    }

    public String getLoc(int pos){
        if (pos == 0){
            "Island"
        }
    }

    public int getHighestRoll(int rolls) {
        if (rolls <= 0){
            rolls = 1;
        }
        int high = -1;
        int temp = -1;
        Random rand = new Random();
        for (int x = 0; x < rolls; x++){
            temp = rand.nextInt(5) +1;
            if (temp > high){
                high = temp;
            }
        }
        return high;
    }



}
