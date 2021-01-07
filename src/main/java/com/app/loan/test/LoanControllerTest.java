package com.app.loan.test;

import com.app.loan.model.Client;
import com.app.loan.model.ClientResponse;
import com.app.loan.service.LoanService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class LoanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void generateLoan() throws Exception {
        Client client = new Client("Test", "296.539.278-50", 29, "CE", 3000.0);

        this.mockMvc.perform(post("/loan/register")
            .contentType(MediaType.APPLICATION_JSON)
            .content(client.toString()))
            .andExpect(status().isCreated());
    }
}
