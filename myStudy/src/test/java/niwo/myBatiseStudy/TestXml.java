package niwo.myBatiseStudy;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import site.niwo.www.data.mybatis.MybatiesPo;
import site.niwo.www.mapper.MybatiesPoMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by web on 2020/5/12.
 */
public class TestXml {

   public static void main(String[] args) throws IOException {
       //1.读取配置文件 为确保准确（加载都是几个加载器选用 路劲的转换）
       InputStream in = Resources.getResourceAsStream("mybatis.cfg.xml");
       //2.创建SqlSessionFactory工厂  里面就是一个构建好的config
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
       //3.使用工厂生产SqlSession对象  SqlSession里面有事务  执行器  核心内容
       //事务在这里因该摄入理解
       SqlSession session = sqlSessionFactory.openSession(false);
       //返回代理类  上面是环境  这里的就是具体操作和执行的开始 DefaultSqlSession
       MybatiesPoMapper mapper = session.getMapper(MybatiesPoMapper.class);
       TestXml testXml = new TestXml();
       testXml.insert(mapper);
       MybatiesPo po = mapper.getPo(1);
       List<MybatiesPo> pos = mapper.getPoAll();
       List<MybatiesPo> pos2 = mapper.getPoAll();
       System.out.println(JSON.toJSONString(pos));
       System.out.println(JSON.toJSONString(pos2));

       //6.释放资源
       session.close();
       in.close();
       System.out.println("=================");
   }

   public int insert(MybatiesPoMapper mapper){
       MybatiesPo mybatiesPo = new MybatiesPo();
       mybatiesPo.setDate(new Date());
       mybatiesPo.setName(UUID.randomUUID().toString());
       Double number = Math.random() * 100;
       mybatiesPo.setNumber(number.intValue());
       return mapper.insertPo(mybatiesPo);
   }

}
