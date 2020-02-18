import com.itheima.dao.MenuMapper;
import com.itheima.pojo.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@ContextConfiguration("classpath:spring-dao-tx.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class springTest {
    @Autowired
    MenuMapper menuMapper;

    @Test
    public void test0(){
        List<Menu> all = menuMapper.findAll();
        System.out.println(all);
    }

    @Test
    public void test1() {
        Menu byId = menuMapper.findById(1);
        System.out.println(byId);
    }


}
