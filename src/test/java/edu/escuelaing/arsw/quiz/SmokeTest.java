package edu.escuelaing.arsw.quiz;

import edu.escuelaing.arsw.quiz.controller.HomeController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Spring.io
 */
@SpringBootTest
public class SmokeTest 
{
    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads () throws Exception 
    {
        assertThat(controller).isNotNull();
    }
}
