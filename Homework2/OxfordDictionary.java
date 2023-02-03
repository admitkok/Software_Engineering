package Homework2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OxfordDictionary implements WordFinder{

    public OxfordDictionary(){
    }
    @Override
    public List<Word> findAll(){
        Word word = new Word();
        word.setWord("Shalom");
        word.setDict("Oxford");

        return List.of(word);
    }

}
