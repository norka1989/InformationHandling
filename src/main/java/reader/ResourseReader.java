package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourseReader implements AutoCloseable {

    private static final Logger LOG = LogManager.getLogger(ResourseReader.class);
    private static final String FILE_READING_COMPLITED_MESSAGE = "File <%s> reading complited";
    private final FileReader fileReader;
    private final BufferedReader bufferedReader;

    public ResourseReader(String file) throws FileNotFoundException {
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    }

    public static ResourseReader of(String file) throws FileNotFoundException {  //разобраться с этим!!!!!!!!!!!
        return new ResourseReader(file);
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    @Override
    public void close() throws Exception {
        bufferedReader.close();
        fileReader.close();
        LOG.info(FILE_READING_COMPLITED_MESSAGE);
    }
}

