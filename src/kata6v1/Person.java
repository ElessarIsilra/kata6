package kata6v1;


public class Person {
    private final int id;
    private final String mail;
    private final String name;
    private final float peso;
    private final String genero;

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public float getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public Person(int id, String mail, String name, float peso, String genero) {
        this.id = id;
        this.mail = mail;
        this.name = name;
        this.peso = peso;
        this.genero = genero;
    }
}