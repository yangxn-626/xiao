import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestSqlsession extends TestBase{
    @Test
    public void testSqlsession(){
        SqlSessionFactory ssf=
                ctx.getBean("sqlSessionFactory", SqlSessionFactory.class);
        System.out.println(ssf);
    }
}
