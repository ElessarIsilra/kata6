package kata6v1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata6v1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname = "C:\\Users\\usuario\\Desktop\\emails.txt";
        ArrayList<Person> people = MailReader.read(pathname);
        HistogramBuilder builder = new HistogramBuilder<>(people);
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {
            @Override
            public String get(Person person) {
                return person.getMail().split("@")[1];
            }
        }
        );
        HistogramDisplay histoDisplay = new HistogramDisplay(domains);
        histoDisplay.execute();
    }
}
