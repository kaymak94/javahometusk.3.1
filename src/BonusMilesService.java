public class BonusMilesService {
    public int calculate(int cost) {
        int price = cost;
        int roubles = 20;
        int miles = price / roubles;
        return miles;
    }

}
