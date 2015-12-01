package kata6v1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata6v1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        ArrayList<Person> people = MailReader.read();
        HistogramBuilder builder = new HistogramBuilder<>(people);
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {
            @Override
            public String get(Person person) {
                return person.getMail().split("@")[1];
            }
        }
        );
        Histogram<String> peso = builder.build(new Attribute<Person, Float>() {
            @Override
            public Float get(Person person) {
                return person.getPeso();
            }
        }
        );
        Histogram<String> genero = builder.build(new Attribute<Person, String>() {
            @Override
            public String get(Person person) {
                return person.getGenero();
            }
        }
        );
        Histogram<Character> caracteres = builder.build(new Attribute<Person, Character>() {
            public Character get(Person person) {
                return person.getMail().charAt(0);
            }
        }
        );
        HistogramDisplay histoDisplay = new HistogramDisplay(domains);
        histoDisplay.execute();
    }
}
