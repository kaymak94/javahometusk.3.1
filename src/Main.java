public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 30_000;
        int miles = service.calculate(price);
        System.out.println("Количество начисленных миль:" + miles);
    }
}