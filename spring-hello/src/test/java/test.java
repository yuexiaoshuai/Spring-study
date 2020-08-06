import com.eva.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void hello(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
    @Test
    public void user1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object user = context.getBean("user1");
        System.out.println(user);
    }
    @Test
    public void user2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object user = context.getBean("user2");
        System.out.println(user);
    }
    @Test
    public void user3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object user = context.getBean("user3");
        System.out.println(user);
    }
}
