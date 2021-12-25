
package kata5p2.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {

    public static void main(String[] args) throws FileNotFoundException {
        input();
    }
        
    
    public static void input() throws FileNotFoundException{
        process(MailListReaderBD.read());
    }
    
    public static void process(List<Mail> mailList){
        output(MailHistogramBuilder.build(mailList));
    }
    
    public static void output(Histogram<String> histogram){
        new HistogramDisplay(histogram).execute();
    }
    
    
}
