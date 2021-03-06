package om.swh.spring.bean;

import com.swh.spring.bean.comfig.scan.SpringAutoScanConfig;
import com.swh.spring.bean.service.CompactDiscService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: swh
 * @Date: 2019/5/22 22:10
 * @Description: CompactDiscService的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAutoScanConfig.class)
public class CompactDiscServiceTest {

    // 播放器服务
    @Autowired
    private CompactDiscService compactDiscService;

    /**
     * 播放器的播放方法的测试方法
     */
    @Test
    public void play_Test(){
        compactDiscService.play();
    }
}
