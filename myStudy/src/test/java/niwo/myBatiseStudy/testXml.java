package niwo.myBatiseStudy;

import com.alibaba.fastjson.JSON;
import niwo.data.mybatis.MybatiesPo;
import niwo.mapper.MybatiesPoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by web on 2020/5/12.
 */
public class testXml {

   public static void main(String[] args) throws IOException {
       //1.读取配置文件


       InputStream in = Resources.getResourceAsStream("mybatis.cfg.xml");
       //2.创建SqlSessionFactory工厂
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
       //3.使用工厂生产SqlSession对象
       SqlSession session = sqlSessionFactory.openSession();
       MybatiesPoMapper mapper = session.getMapper(MybatiesPoMapper.class);
       MybatiesPo po = mapper.getPo(1);
       System.out.println(JSON.toJSONString(po));
       //6.释放资源
       session.close();
       in.close();
   }
}
