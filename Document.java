package Homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Document {
    @Autowired
    SpellChecker spellChecker;

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(DictConfig.class);
        final var bean = context.getBean(SpellChecker.class);

        System.out.println("Document was created");
        System.out.println(bean.spellChecking("Shabbat"));

    }
}
