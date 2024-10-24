import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld beanHelloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld bean comparison: " + (beanHelloWorld1 == beanHelloWorld2)); // true
        System.out.println("Cat bean comparison: " + (beanCat1 == beanCat2));
    }
}