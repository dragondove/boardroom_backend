package top.dragondove.boardroom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardroomApplicationTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;


    @Test
    public void indexExample() throws Exception {

    }

}

