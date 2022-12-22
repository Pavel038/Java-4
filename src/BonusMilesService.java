public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        int pricePerMile = 20; // количесво рублей для 1 мили
        int miles = cost / pricePerMile;
        result = miles;
        return result;
    }
}
