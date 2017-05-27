package com.imooc;

import com.imooc.domain.Girl;
import com.imooc.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 廖师兄
 * 2017-02-14 23:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOne(3);
        Assert.assertEquals(new Integer(19), girl.getAge());
    }
    @Test
    public void findOneTest1() {
        Girl girl = girlService.findOne(3);
        Assert.assertEquals(new Integer(19), girl.getAge());
    }
    @Test
    public void findOneTest2() {
        Girl girl = girlService.findOne(3);
        Assert.assertEquals(new Integer(192), girl.getAge());
    }
}
