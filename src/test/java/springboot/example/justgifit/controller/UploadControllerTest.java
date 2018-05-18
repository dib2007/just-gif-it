/*package springboot.example.justgifit.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class UploadControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test() throws Exception {
		MockMultipartFile firstFile = new MockMultipartFile("file", "filename.txt", null, "some xml".getBytes());
		mockMvc.perform(MockMvcRequestBuilders.multipart("/upload").file(firstFile).param("start", "4")
				.param("end", "100").param("speed", "2").param("repeat", "true")).andExpect(status().is(200))
				.andExpect(content().string("success"));
	}
}
*/