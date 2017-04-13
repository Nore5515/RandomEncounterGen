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
        String loc = "BAAH";
        int locTemp = -1;
        int ageBoost, wesBoost, ferBoost, rskBoost, rwdBoost, impBoost;

        locTemp = rand.nextInt(8) + 1;
        if (locTemp == 1) {
            loc = "Island";
            ageBoost = 2;
            wesBoost = 1;
            ferBoost = 2;
            rskBoost = 1;
            rwdBoost = 0;
        } else if (locTemp == 2){
            loc = "Mountain";
            ageBoost = 3;
            wesBoost = 2;
            ferBoost = 1;
            rskBoost = 2;
            rwdBoost = 1;
        } else if (locTemp == 3){
            loc = "Crashed Ship";
            ageBoost = -1;
            wesBoost = 0;
            ferBoost = -3;
            rskBoost = 2;
            rwdBoost = 3;
        } else if (locTemp == 4){
            loc = "Scout Ship";
            ageBoost = -2;
            wesBoost = 0;
            ferBoost = -3;
            rskBoost = 1;
            rwdBoost = 2;
        } else if (locTemp == 5){
            loc = "Gaping Hole";
            ageBoost = 3;
            wesBoost = 3;
            ferBoost = -5;
            rskBoost = 3;
            rwdBoost = 0;
        } else if (locTemp == 6){
            loc = "Tornado";
            ageBoost = -3;
            wesBoost = 5;
            ferBoost = -5;
            rskBoost = 3;
            rwdBoost = -1;
        } else if (locTemp == 7){
            loc = "Monster Corpse";
            ageBoost = 0;
            wesBoost = 0;
            ferBoost = 3;
            rskBoost = 3;
            rwdBoost = 3;
        } else if (locTemp == 8){
            loc = "Shallows";
            ageBoost = 2;
            wesBoost = 1;
            ferBoost = 2;
            rskBoost = 1;
            rwdBoost = 0;
        } else{
            loc = "ERR";
            ageBoost = 1000;
            wesBoost = 1000;
            ferBoost = 1000;
            rskBoost = 1000;
            rwdBoost = 1000;
        }

        age = getHighestRoll(rand.nextInt(5) + 1 + ageBoost);
        weatherSav = getHighestRoll(rand.nextInt(5) + 1 + wesBoost);
        fertility = getHighestRoll(age + 1 - weatherSav + ferBoost);
        risk = getHighestRoll(age + fertility - 4 + rskBoost);
        reward = getHighestRoll(risk + fertility + age - 8 + rwdBoost);
        importance = getHighestRoll(risk - reward);

        //s += "Age:\t" + age;
        s += String.format("%-20s%n", loc);
        s += String.format("%-20s|%d|%n","Age", age);
        s += String.format("%-20s|%d|%n","Weather Savagery",weatherSav);
        s += String.format("%-20s|%d|%n","Fertility",fertility);
        s += String.format("%-20s|%d|%n","Risk",risk);
        s += String.format("%-20s|%d|%n","Reward",reward);
        s += String.format("%-20s|%d|%n","Importance",importance);
        //s += "Weather Savagery"

        return s;
    }

    public String massEncounter(int count) {
        String s = new String();
        Random rand = new Random();
        String loc = "BAAH";
        int locTemp = -1;
        int ageBoost, wesBoost, ferBoost, rskBoost, rwdBoost, impBoost;
        int ageTotal, wesTotal, ferTotal, rskTotal, rwdTotal, impTotal;
        ageTotal = 0;
        wesTotal = 0;
        ferTotal = 0;
        rskTotal = 0;
        rwdTotal = 0;
        impTotal = 0;

        s += String.format("%-20s|%3s|%3s|%3s|%3s|%3s|%3s%n", "LOCATION", "AGE", "WES", "FER", "RSK", "RWD", "IMP");

        for (int x = 0; x < count; x++) {

            locTemp = rand.nextInt(8) + 1;
            if (locTemp == 1) {
                loc = "Island";
                ageBoost = 2;
                wesBoost = 1;
                ferBoost = 2;
                rskBoost = 1;
                rwdBoost = 0;
            } else if (locTemp == 2){
                loc = "Mountain";
                ageBoost = 3;
                wesBoost = 2;
                ferBoost = 1;
                rskBoost = 2;
                rwdBoost = 1;
            } else if (locTemp == 3){
                loc = "Crashed Ship";
                ageBoost = -1;
                wesBoost = 0;
                ferBoost = -3;
                rskBoost = 2;
                rwdBoost = 3;
            } else if (locTemp == 4){
                loc = "Scout Ship";
                ageBoost = -2;
                wesBoost = 0;
                ferBoost = -3;
                rskBoost = 1;
                rwdBoost = 2;
            } else if (locTemp == 5){
                loc = "Gaping Hole";
                ageBoost = 3;
                wesBoost = 3;
                ferBoost = -5;
                rskBoost = 3;
                rwdBoost = 0;
            } else if (locTemp == 6){
                loc = "Tornado";
                ageBoost = -3;
                wesBoost = 5;
                ferBoost = -5;
                rskBoost = 3;
                rwdBoost = -1;
            } else if (locTemp == 7){
                loc = "Monster Corpse";
                ageBoost = 0;
                wesBoost = 0;
                ferBoost = 3;
                rskBoost = 3;
                rwdBoost = 3;
            } else if (locTemp == 8){
                loc = "Shallows";
                ageBoost = 2;
                wesBoost = 1;
                ferBoost = 2;
                rskBoost = 1;
                rwdBoost = 0;
            } else{
                loc = "ERR";
                ageBoost = 1000;
                wesBoost = 1000;
                ferBoost = 1000;
                rskBoost = 1000;
                rwdBoost = 1000;
            }

            age = getHighestRoll(rand.nextInt(5) + 1 + ageBoost);
            weatherSav = getHighestRoll(rand.nextInt(5) + 1 + wesBoost);
            fertility = getHighestRoll(age + 1 - weatherSav + ferBoost);
            risk = getHighestRoll(age + fertility - 4 + rskBoost);
            reward = getHighestRoll(risk + fertility + age - 8 + rwdBoost);
            importance = getHighestRoll(risk - reward);


            s += String.format("%-20s|%-3d|%-3d|%-3d|%-3d|%-3d|%-3d%n", loc, age, weatherSav, fertility, risk, reward, importance);

            ageTotal += age;
            wesTotal += weatherSav;
            ferTotal += fertility;
            rskTotal += risk;
            rwdTotal += reward;
            impTotal += importance;
        }
        s += "-----------------------------";
        s += String.format("%n%-20s|%-3d|%-3d|%-3d|%-3d|%-3d|%-3d%n","AVG", ageTotal / count, wesTotal / count, ferTotal / count, rskTotal / count, rwdTotal / count, impTotal / count);

        return s;
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
