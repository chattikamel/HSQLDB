package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void aggregateFuctionTest() {

        jdbcTemplate.queryForList("SELECT listagg(ename) FROM emp GROUP BY job")
                .forEach(stringObjectMap -> stringObjectMap.forEach((s, o) -> System.out.println(o)));
    }

    @Test
    public void aggregateFuctionTest2() {

        jdbcTemplate.queryForList("SELECT listagg(ename || '|'  || job) FROM emp GROUP BY deptno")
                .forEach(stringObjectMap -> stringObjectMap.forEach((s, o) -> System.out.println(o)));
    }


}

