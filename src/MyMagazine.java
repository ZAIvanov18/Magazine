public class MyMagazine extends Magazine {
    String title;
    String price;
    String author;

    public MyMagazine(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(title + " " + getName()+  " " + getAuthor() + " " + getPrice());
    }
}
