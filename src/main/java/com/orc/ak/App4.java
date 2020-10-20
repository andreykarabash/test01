package com.orc.ak;

import java.util.List;

/**
 * Hello world #4!
 *
 */
public class App4
{
    public static void main( String[] args )
    {
        // feat.50011 jkgjgkjg kjh g
        // feat/50001  n,nm,n
        // feat.4050 ..
        // feature 4010
        // feat.4000 + fix
        // feature 3000.fix
        // Feature 20001 . fixed
        // feature 20002. here
        //
        // fixed Master.
        // Develop branch
        System.out.println( "Hello World 4 !" );
        System.out.println( "Filling contact book.." );
        ContactBook book1 = new ContactBook( new ContactCard("Vasia", 1200));
        book1.Add("Kolya", 1301);
        book1.Add("Sasha", null);
        book1.Add("Vasia", 2100);
        book1.Add("Petya", 31);
        book1.Add("Petya", 317);
        book1.Add("Tolya", null);
        book1.Add("Petya", null);

        System.out.println( "\nBook contains:" );
        System.out.println( book1 );

        System.out.println( "\nSearch Vasia only, get his book:" );
        ContactBook bookVasia = new ContactBook( book1.getContactByName("Vasia") );
        System.out.println( bookVasia );

        System.out.println( "\nSearch phone 2100 only, get book of owner:" );
        ContactBook book2100 = new ContactBook( book1.getContactByPhone( 2100 ) );
        System.out.println( book2100 );

        System.out.println( "\nSearch Doe only, get his book:" );
        try {
            ContactBook bookDoe = new ContactBook(book1.getContactByName("Doe"));
            System.out.println(bookDoe);
        }
        catch (Exception e) {
            System.out.println("Getting Doe book failed:" + e);
        }

        System.out.println( "\nSearch persons with Null phone, get their books:" );
        try {
            ContactBook bookPhonNull = new ContactBook(book1.getContactByPhone(null));
            ContactBook bookNull = new ContactBook();
            for ( ContactCard e : bookPhonNull.getContactCards() ) {
                ContactBook bookNameN = new ContactBook(book1.getContactByName(e.getName()));
                for ( ContactCard e2 : bookNameN.getContactCards())
                    bookNull.Add(e2);
            }
            System.out.println(bookNull);
        }
        catch (Exception e) {
            System.out.println("Getting Null book failed:" + e);
        }

        System.out.println( "\nSearch Petya only, get his book:" );
        ContactBook bookPetya = new ContactBook( book1.getContactByName("Petya") );
        System.out.println( bookPetya );

        System.out.println( "\nEnd." );

    }
}
