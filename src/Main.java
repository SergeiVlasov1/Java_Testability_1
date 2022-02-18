public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int miles = service.calculate(cost);
        System.out.println("Сумма начисленых бонусов: " + miles + " мил(ь/я/и)");
    }
}