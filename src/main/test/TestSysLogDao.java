import com.db.sys.dao.SysLogDao;
import org.junit.Test;

public class TestSysLogDao extends TestBase{
    @Test
    public void test01(){
        SysLogDao dao = ctx.getBean("sysLogDao", SysLogDao.class);
        dao.deleteObjects(11,12);
    }
}
