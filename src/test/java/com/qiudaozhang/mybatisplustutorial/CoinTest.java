package com.qiudaozhang.mybatisplustutorial;

import com.qiudaozhang.mybatisplustutorial.domain.Coin;
import com.qiudaozhang.mybatisplustutorial.mapper.CoinMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
public class CoinTest {

    @Resource
    private CoinMapper coinMapper;
    @Test
    void save() {

        Coin coin = Coin.builder().name("BTC")
                .icon("xxx")
                .created(new Date()).build();
        coinMapper.insert(coin);

    }
}
