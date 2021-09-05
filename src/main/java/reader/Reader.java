package reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

    private static final Logger LOG = LogManager.getLogger(Reader.class);

    private static final String OPENING_FILE = "Opening file <%s>";
    private static final String MISSING_FILE = "File <%s> not found";
    private static final String ERROR_IN_READING_LINE = "An error in reading line <%s>";
    private static Reader instance;
    ResourseReader readerOfFile;
    private String wholeText = "";

    private Reader() {
    }

    public static Reader getInstance() {
        if (instance == null) {
            instance = new Reader();
        }
        return instance;
    }

//    public void read(String file) {
//        try (readerOfFile=ResourseReader.of(file)){
//            LOG.info(String.format(OPENING_FILE, file));
//        } catch(FileNotFoundException e){
//            LOG.error(String.format(MISSING_FILE, file));
//        } catch(Exception e){             // какое исключение ловим????
//            e.printStackTrace();
//        }
//    }

//    public String saveWholeText(String file) {
//        read(file);
//        String line = null;
//        try {
//            line = readerOfFile.getBufferedReader().readLine();
//            while (line != null) {
//                wholeText = wholeText.concat(line);
//            }
//        } catch (IOException e) {
//            LOG.error(String.format(ERROR_IN_READING_LINE, line));
//        }
//        return wholeText;
//    }






}
