public class sqlOdevleri {
    public static void main(String[] args) {

        String odev1_1 = "SELECT title, description FROM film;";

        String odev1_2 = "SELECT * FROM film WHERE length > 60 AND length < 75;";

        String odev1_3 = "SELECT * FROM film WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);";

        String odev1_4 = "Smith";

        String odev1_5 = "select * from film where  length < 50 and (rental_rate != 2.99 and rental_rate != 4.99);";

    }
}
