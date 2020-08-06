import com.eva.dao.UserMapperImpl;
import com.eva.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class myTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapperImpl useMapperImpl = context.getBean("userMapperImpl", UserMapperImpl.class);
        List<User> users = useMapperImpl.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
