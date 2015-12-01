package kata6v1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata6v1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname="C:\\Users\\usuario\\Desktop\\emails.txt";
        ArrayList <String> mailList = MailReader.read(pathname);
        Histogram<String> histogram= MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
