package Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCutils;

import javax.sql.DataSource;
import javax.xml.transform.Templates;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args)  {
        Connection conn=null;
        PreparedStatement stmt=null;
        JdbcTemplate template=new JdbcTemplate(JDBCutils.getDataSource());
        String sql="select * from emp";
        List<emp> list = template.query(sql, new BeanPropertyRowMapper<emp>(emp.class));
        for(emp e:list){
            System.out.println(e);
        }
    }
}
