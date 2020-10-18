package src.main.site.niwo.www.myInterface;

/**
 * Created by web on 2020/5/15.
 */

import niwo.mapper.MybatiesPoMapper;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

//@Intercepts({//注意看这个大花括号，也就这说这里可以定义多个@Signature对多个地方拦截，都用这个拦截�?
//        @Signature(
//                type = MybatiesPoMapper.class,//这是指拦截哪个接�?
//                method = "getPoAll", //这个接口内的哪个方法名，不要拼错�?
//                args = {})//这是拦截的方法的入参，按顺序写到这，不要多也不要少，如果方法重载，可是要通过方法名和入参来确定唯�?�?
//})
//首先清除拦截器试拦截的是�?�? 在构建执行器的时候拦截整个帅�? �?下拦截没鸟用
@Intercepts({@Signature(type = MybatiesPoMapper.class, method = "getPoAll", args = {})})
public class MybatisInterface implements Interceptor {

        // 这里是每次执行操作的时�?�，都会进行这个拦截器的方法�?
        public Object intercept(Invocation invocation) throws Throwable {
            StatementHandler statementHandler=(StatementHandler)invocation.getTarget();
            MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
            String sql= String.valueOf(metaStatementHandler.getValue("delegate.boundSql.sql"));
            sql = sql.replace(";"," limit 1;");
            metaStatementHandler.setValue("delegate.boundSql.sql",sql);
            return invocation.proceed();
        }

        // 主要是为了把这个拦截器生成一个代理放到拦截器链中
        public Object plugin(Object target) {
            //官方推荐写法
            return Plugin.wrap(target, this);
        }

        // 插件初始化的时�?�调用，也只调用�?次，插件配置的属性从这里设置进来
        public void setProperties(Properties properties) {

        }
}

