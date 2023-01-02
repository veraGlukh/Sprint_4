package Features;

public class ScooterOrderTestData {
    public String name;
    public String surname;
    public String address;
    public String phone;
    public String comment;
    public int[] indexes; // станция метро, дата, срок, цвет

    public ScooterOrderTestData(String name, String surname, String address, String phone, String comment, int[] indexes) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
        this.indexes = indexes;
    }
}
