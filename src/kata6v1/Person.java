package kata6v1;


public class Person {
    private final int id;
    private final String mail;

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public Person(int id, String mail) {
        this.id = id;
        this.mail = mail;
    }
    
}
