package KitapSiralayici;

import java.util.HashSet;
import java.util.TreeSet;

public class kitapSiralayici {

    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new orderNameComperator());
        books.add(new Book("LordoftheRings",250,"J.R.R.Talkien",1977));
        books.add(new Book("Harry-Potter",300,"J. K. Rowling",1997));
        books.add(new Book("Sherlock-Holmes",350,"Arthur Conan Doyle",1887));
        books.add(new Book("Kaşağı",100,"Ömer-Seyfettin",1919));
        books.add(new Book("Sadece-Şeyma",150,"Şeyma Subaşı",2019));

        for(Book x : books){
            System.out.println(x.getName());
        }
        System.out.println("----------------");

        TreeSet<Book> books2 = new TreeSet<>(new orderPageComparator());
        books2.add(new Book("LordoftheRings",250,"J.R.R.Talkien",1977));
        books2.add(new Book("Harry-Potter",300,"J. K. Rowling",1997));
        books2.add(new Book("Sherlock-Holmes",350,"Arthur Conan Doyle",1887));
        books2.add(new Book("Kaşağı",100,"Ömer-Seyfettin",1919));
        books2.add(new Book("Sadece-Şeyma",150,"Şeyma Subaşı",2019));


        for(Book y : books2){
            System.out.println(y.getPage());
        }

    }
}
