package com.spring.controllerTest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;
import org.springframework.web.servlet.View;

import com.spring.controller.QualificationController;
import com.spring.model.Qualification;
import com.spring.service.QualificationService;

public class QualificationControllerTest {
	@InjectMocks
	QualificationController controller;
	
	@Mock
	QualificationService mockQualificationService;
	
	@Mock
	View mockView;
	
	MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = standaloneSetup(controller)
                .setSingleView(mockView)
                .build();
	}
	
	@Test
	public void testListQualificationInGroup() {
		List<Qualification> expectedQualifications = Arrays.asList(new Qualification());
        when(mockQualificationService.listQualifications()).thenReturn(expectedQualifications);

        Model model = (Model) new Qualification();
        model.addAttribute("listQualifications", mockQualificationService.listQualifications());
        String viewName = controller.listQualifications(model);

        Assert.assertEquals("qualifications", viewName);
        Assert.assertTrue(model.containsAttribute("listQualifications"));
    }
}
