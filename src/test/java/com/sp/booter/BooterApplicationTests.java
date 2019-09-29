package com.sp.booter;

import com.sp.booter.controller.HelloController;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BooterApplicationTests {

    @Autowired
    HelloController controller;

    private MockMvc mm;
    @Before
    public void setup(){
        mm = MockMvcBuilders.standaloneSetup(controller).build();
    }
    @Test
    public void contextLoads() throws Exception {
        mm.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
               // .andExpect(MockMvcResultMatchers.content().string(CoreMatchers.equalTo("hello")))
    }

}
