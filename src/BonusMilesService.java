public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        {
            int y = 20; // количесво рублей для 1 мили
            int miles = cost / y;
            result = miles;
        }
        return result;
    }
}