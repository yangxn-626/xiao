import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataSource extends TestBase{
    @Test
    public void testDataSource() throws SQLException {
       DataSource ds =  ctx.getBean("dataSource", DataSource.class);
        System.out.println(ds.getConnection());
    }
    @Test
    public  void testMysql() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:///jtsys?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();


    }
}
