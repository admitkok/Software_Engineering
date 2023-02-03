package Homework2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UrbanDictionary implements WordFinder {

    public UrbanDictionary() {
    }
    @Override
    public List<Word> findAll() {
        Word word = new Word();
        word.setWord("Shabbat");
        word.setDict("Urban");

        return List.of(word);
    }
}

