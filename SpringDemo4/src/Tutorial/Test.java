package Tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext r=new ClassPathXmlApplicationContext("applicationContext.xml");


        Question q=(Question)r.getBean("q");
        q.displayInfo();

    }
}