package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class Test {

    @Autowired
    MessageSource messageSource;




    public String getName() {
        System.out.println(messageSource);
        return messageSource.getMessage("yen.name",null, Locale.getDefault());
    }
}
