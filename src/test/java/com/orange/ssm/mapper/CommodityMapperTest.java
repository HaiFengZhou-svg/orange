package com.orange.ssm.mapper;

import com.alibaba.fastjson.JSON;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

public class CommodityMapperTest {
    private static CommodityMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build( CommodityMapperTest.class.getClassLoader().getResourceAsStream( "mybatisTestConfiguration/CommodityMapperTestConfiguration.xml" ) );
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper( CommodityMapper.class, builder.openSession( true ) );
    }


    /**
     *
     * @throws FileNotFoundException
     * 测试并转化为json数据
     */
    @Test
    public void testSelectAll() throws FileNotFoundException {

        mapper.selectAll( 2 );

        Object toJSON = JSON.toJSON( mapper.selectAll( 2 ) );

        System.out.println( toJSON );
    }

    /**
     *
     * @throws FileNotFoundException
     * 测试并转化为json数据
     */
    @Test
    public void testDeleteById() throws FileNotFoundException {
        mapper.deleteById( 1 );
        System.out.println( mapper.deleteById( 1 ) );
    }


    /**
     *
     * @throws FileNotFoundException
     *
     * 测试并转化为json数据
     */
    @Test
    public void testFindByKeyword() throws FileNotFoundException {

        Object toJSON = JSON.toJSON( mapper.findByKeyword( "液体衣" ) );

        System.out.println(toJSON);
    }
}
