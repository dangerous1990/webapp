package webapp.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import webapp.controller.LoginController;

@RunWith(SpringJUnit4ClassRunner.class)
public class LoginControllerTest extends BaseControllerTest {

	private MockMvc mockMvc;

	@Resource
	private LoginController loginController;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
	}

	@Test
	public void addTemplate() throws Exception {
		this.mockMvc.perform(get("/login/login", "").characterEncoding("UTF-8")
				.contentType(MediaType.APPLICATION_FORM_URLENCODED).param("name", "admin").param("password", "456"))
				.andDo(print());

	}

}
