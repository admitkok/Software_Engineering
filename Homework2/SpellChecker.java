package Homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    private final List<WordFinder> finders;

    @Autowired
    public SpellChecker(List<WordFinder> finders) {
        this.finders = finders;
    }


    public List<String> spellChecking(String word) {

        List<String> result = new ArrayList<>();
        for (var finder:
             finders) {

            List<Word> allWords = finder.findAll();

            for (var word1 : allWords) {
                if (Objects.equals(word1.getWord(), word)) {
                    result.add(word1.getDict());
                }
            }
        }
        return result;
    }


}
