package om.swh.spring.bean;

import com.swh.spring.bean.comfig.scan.AutoScanByClassConfig;
import com.swh.spring.bean.service.CDPlayer;
import com.swh.spring.bean.service.CompactDiscService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: swh
 * @Date: 2019/5/31 22:07
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class BeanConfigByXML {
    // 播放器服务
    @Autowired
    private CompactDiscService compactDiscService;

    @Autowired
    private CDPlayer cdPlayer;

    /**
     * 播放器的播放方法的测试方法
     */
    @Test
    public void play_Test(){
        compactDiscService.play();
        cdPlayer.play();
    }
}
