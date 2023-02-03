package Homework2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Word {

    private String word;
    private String dict;

    public String getWord(){ return word; }
    public void setWord(String word){ this.word = word; }
    public String getDict(){ return dict; }
    public void setDict(String dict){ this.dict = dict; }

}
