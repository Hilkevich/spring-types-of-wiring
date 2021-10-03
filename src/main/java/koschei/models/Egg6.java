package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                          //+
public class Egg6 {

    @Autowired
    private Needle7 needle;         //+

//    @Autowired                        //можно и через конструктор!
//    private Egg6(Needle7 needle) {
//        this.needle = needle;
//    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();  //+ было вместо needle.toString  + ""
    }
}
