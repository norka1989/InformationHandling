package service;

import entity.Paragraph;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Action {
    private static final Logger LOG = LogManager.getLogger(Action.class);
    private static List<Paragraph> listOfParagraphs = new ArrayList();
    private int numberOfPredlozenij;                                       //перевести
    final Pattern patternForParagraph = Pattern.compile(".*[^\\n]");
    final Pattern patternForPredlozenij = Pattern.compile("[A-Z]]?.*\\.$");      //translate and check
    static Matcher matcher = null;

    public List saveListOfParagraphs(String wholeText) {
        matcher = patternForParagraph.matcher(wholeText);
        while (matcher.find()) {
            Paragraph paragraph=new Paragraph(matcher.group());         //можно ли так??
            listOfParagraphs.add(paragraph);
        }
        return listOfParagraphs;
    }

//    public List parseTextOnLecsems (){                  //перевести красиво!!!!!!!!!
//
//    }
//
//    public int countNumberOfPredlodenijInParagraph(Paragraph paragraph){              //перевести слово предложений
//        if(matcher==null) {
//            matcher = patternForPredlozenij.matcher(paragraph);
//        } else {
//            matcher.reset(paragraph);
//        }
//
//        return numberOfPredlozenij;
 //   }

    public static void main(String[] args) {
       String text = "Ngfcgc mhgvv jhbjhv hjblkgbkj b\n" +
                "Mjhbvjhvj lhblhblk\n" +
                "Mhgvkgvl luigliglig \n";
        new Action().saveListOfParagraphs(text);
        System.out.println(listOfParagraphs);
    }
}
