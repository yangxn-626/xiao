import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBase {
   ClassPathXmlApplicationContext ctx;
   @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
    }
    @Test
    public void testCtx(){
        System.out.println(ctx);
    }
    @After
    public void destory(){
       ctx.close();
    }
}
