package spr1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class beantest1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("leo.xml");
        Person p = ctx.getBean("chinese", Person.class);
        p.useAxe();
    }
}