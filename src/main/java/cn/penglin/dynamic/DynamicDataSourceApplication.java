package cn.penglin.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import cn.penglin.dynamic.datasource.DynamicDataSourceRegister;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
@ComponentScan(value = {"cn.penglin.dynamic"})
@MapperScan("cn.penglin.dynamic.dao")//将项目中对应的mapper类的路径加进来就可以了
public class DynamicDataSourceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DynamicDataSourceApplication.class, args);
        System.out.println( "Hello World!" );
    }
}
