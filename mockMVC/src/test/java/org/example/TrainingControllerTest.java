package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TrainingController.class)
class TrainingControllerTest {

    @MockBean
    TrainingService trainingService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void testFindById() throws Exception{
        Training t = new Training(101, "2026-03-07", "2026-03-09", "Mockito",
                "Dinesh");
        when(trainingService.findById(101)).thenReturn(t);

        mockMvc.perform(get("/training/101")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.trainingId").value(101))
                .andDo(res -> System.out.println(res.getResponse().getContentAsString()));
    }
}