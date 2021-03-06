//package csu.springmvc.controller;
//
//import static org.hamcrest.CoreMatchers.any;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.servlet.ModelAndView;
//
//@ContextConfiguration(locations = { "classpath:csu/config/beans.xml" })
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//public class SearchControllerTest {
//  
//  @Autowired
//  private WebApplicationContext wac;
//
//  private MockMvc mockMvc;
//  
//  @Before
//  public void setup() {
//      this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//  }
//  
//  @Test
//  public void testSearch() {
//      SearchController searchController = new SearchController();
//      ModelAndView mav = searchController.search(null, null);
//      Assert.assertEquals("search", mav.getViewName());
//  }
//
//  @Test
//  public void testSearchProcess() throws Exception {
//    this.mockMvc.perform(post("/searchProcess")
//        .param("trainerid", "78907")
//          )
//        .andExpect(status().isOk())
//        .andExpect(forwardedUrl("success"))
//        .andExpect(model().attribute("name", any(String.class)));
//  }
//
//}
