public class BonusMilesService {
    public int calculate(int amount) {
        int one_mile = 20;
        int bonus = amount / one_mile;
        return bonus;
    }
}