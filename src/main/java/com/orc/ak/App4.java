package com.orc.ak;

/**
 * Hello world #4!
 *
 */
public class App4
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World 4 !" );
        System.out.println( "Filling contact book.." );
        ContactBook book1 = new ContactBook( new ContactCard("Vasia", 1200));
        book1.Add("Kolya", 1301);
        //book1.Add("Sasha", null);
        book1.Add("Vasia", 2100);
        book1.Add("Petya", 31);

        System.out.println( "\nBook contains:" );
        System.out.println( book1.toString() );

        System.out.println( "\nSearch Vasia only, get his book:" );
        ContactBook bookVasia = new ContactBook( book1.getContactByName("Vasia") );
        System.out.println( bookVasia.toString() );

        System.out.println( "\nSearch phone 2100 only, get book of owner:" );
        ContactBook book2100 = new ContactBook( book1.getContactByPhone( (Integer)2100 ) );
        System.out.println( book2100.toString() );

        System.out.println( "\nSearch Doe only, get his book:" );
        try {
            ContactBook bookDoe = new ContactBook(book1.getContactByName("Doe"));
            System.out.println(bookDoe.toString());
        }
        catch (Exception e) {
            System.out.println("Getting Doe book failed:" + e);
        }

        System.out.println( "\nEnd." );

    }
}
