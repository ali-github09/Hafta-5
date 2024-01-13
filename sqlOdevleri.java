public class sqlOdevleri {
    public static void main(String[] args) {

        String odev1_1 = "SELECT title, description FROM film;";

        String odev1_2 = "SELECT * FROM film WHERE length > 60 AND length < 75;";

        String odev1_3 = "SELECT * FROM film WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);";

        String odev1_4 = "Smith";

        String odev1_5 = "select * from film where  length < 50 and (rental_rate != 2.99 and rental_rate != 4.99);";

        String ara = "--------------------------------------------------------------------------------------------------------";

        String odev2_1 = "SELECT replacement_cost FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99;";

        String odev2_2 = "SELECT first_name FROM actor WHERE first_name IN ('Penelope' , 'Nick' , 'Ed');";

        String odev2_3 = "SELECT rental_rate, replacement_cost FROM film WHERE rental_rate IN (0.99 , 2.99 , 4.99) AND replacement_cost IN (12.99, 15.99,28.99);";

        String ara1 = "--------------------------------------------------------------------------------------------------------";

        String odev3_1 = "SELECT country FROM country WHERE country LIKE 'A%a';";

        String odev3_2 = "SELECT country FROM country WHERE country LIKE '____%n';";

        String odev3_3 = "SELECT title FROM film WHERE title ILIKE '%T%T%T%T%';";

        String odev3_4 = "SELECT title,length,rental_rate FROM film WHERE title LIKE 'C%' and length > 90 and rental_rate = 2.99;";

        String ara2 = "--------------------------------------------------------------------------------------------------------";

        String odev4_1 = "SELECT DISTINCT replacement_cost FROM film;";

        String odev4_2 = "SELECT COUNT(DISTINCT replacement_cost) FROM film;";

        String odev4_3 = "SELECT COUNT(*) AS film_sayisi FROM film WHERE title LIKE 'T%' AND rating = 'G';";

        String odev4_4 = "SELECT COUNT(*) AS film_sayisi FROM country WHERE country LIKE '_____';";

        String odev4_5 = "SELECT COUNT(*) AS film_sayisi FROM city WHERE city ILIKE '%r';";
    }
}
