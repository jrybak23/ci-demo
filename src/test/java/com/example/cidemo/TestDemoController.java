package com.example.cidemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Igor Rybak
 * @since 22-Sep-2018
 */
@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class TestDemoController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSum() throws Exception {
        mockMvc.perform(get("/sum")
                .param("a", "1")
                .param("b", "2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("3"));
    }
}