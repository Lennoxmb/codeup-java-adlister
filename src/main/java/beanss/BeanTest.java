package beanss;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanTest {
    //include a main method that instantiates a few instances of Album, beanss.Author and Quote.
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Albums  album1 = new Albums(1, "The Dark Side of the Moon", "Pink Floyd", 1973, "Progressive Rock", 45);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));
        Albums  album2 = new Albums(2, "The Wall", "Pink Floyd", 1979, "Progressive Rock", 45);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album2));
        Albums  album3 = new Albums(3, "The Division Bell", "Pink Floyd", 1994, "Progressive Rock", 45);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album3));
        Albums  album4 = new Albums(4, "The Final Cut", "Pink Floyd", 1983, "Progressive Rock", 45);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album4));
        Albums  album5 = new Albums(5, "Wish You Were Here", "Pink Floyd", 1975, "Progressive Rock", 45);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album5));

        Author author1 = new Author(1, "Douglas", "Adams");


//        Quotes quote1 = new Quotes(1, "I love deadlines. I like the whooshing sound they make as they fly by.", author1);
//        Quotes quote2 = new Quotes(2, "A common mistake that people make when trying to design something completely foolproof is to underestimate the ingenuity of complete fools.", author1);



    }
}
