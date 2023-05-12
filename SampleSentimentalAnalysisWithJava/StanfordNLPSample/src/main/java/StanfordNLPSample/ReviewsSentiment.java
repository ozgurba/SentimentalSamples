package StanfordNLPSample;

import com.opencsv.CSVReader;
import com.opencsv.CSVParser;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException; 
import java.io.FileReader;
import java.io.IOException;
public class ReviewsSentiment {
    public static void main(String[] args) throws IOException, CsvException {
        nlpPipeline.init();
        String fileName = ".\\resource\\NlpBookReviews.csv";
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(fileName)).withSkipLines(1).build())
        {
            String[] row;
            while ((row = reader.readNext()) != null) {
                System.out.println("Review: " + row[1] + "\t" + " Amazon rating: " + row[4] + "\t" + " Sentiment: " + nlpPipeline.findSentiment(row[1]));
            }
        }
    }
}