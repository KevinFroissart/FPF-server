package fr.fairepartfait.server;

import fr.fairepartfait.server.controllers.ApiController;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {

    private final String helloMessage = "hello, world";

    @Autowired
    public ApiController controller;

    @Autowired
    public MockMvc mvc;

    @Test
    public final void testContextLoad() {
        assertThat(controller).isNotNull();
    }

    @Test
    public final void testHelloMessage() {
        assertThat(controller.hello()).isEqualTo(helloMessage);
    }

    @Test
    public final void testContextContent() throws Exception {
        mvc.perform(get("/api/v1/myresource")).andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString(helloMessage)));
    }


}