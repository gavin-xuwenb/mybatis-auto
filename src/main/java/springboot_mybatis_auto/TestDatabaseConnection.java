package springboot_mybatis_auto;

import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import com.self.mapper.UsersMapper;
import com.self.pojo.Users;
import com.self.pojo.UsersExample;

/**
 * 自动生成mybatis文件后，测试数据库表查询
 * @author xuwenbin
 */
public class TestDatabaseConnection {

	public static void main(String[] args) throws Exception{

       ResourceLoader loader = new DefaultResourceLoader();
       Resource resource = loader.getResource("mybatis/mybatis-config.xml");
       EncodedResource encodedResource= new EncodedResource(resource,"UTF-8");
       Reader reader = encodedResource.getReader();
       SqlSessionFactoryBuilder  builder = new SqlSessionFactoryBuilder();
       SqlSessionFactory factory = builder.build(reader,"development",new Properties());
       SqlSession session = factory.openSession();
       
       UsersMapper mapper = session.getMapper(UsersMapper.class);
       
       UsersExample example = new UsersExample();
       example.createCriteria().andIdEqualTo("1");
       
       Users user = mapper.selectByPrimaryKey("1");
       System.out.print(user);
       session.close();
	}

}
