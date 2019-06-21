package com.solstice.spring.basics.springin10steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    @Mock
    SomeCDIDAO someCDIDAO;

    @Test
    public void testBasicScenario() {
        when(someCDIDAO.getData()).thenReturn(new   int[] {2,4});
        assertEquals(4, someCDIBusiness.findGreatest());
    }

    @Test
    public void testBasicScenarioNoElements() {
        when(someCDIDAO.getData()).thenReturn(new   int[] {});
        assertEquals(Integer.MIN_VALUE, someCDIBusiness.findGreatest());
    }

    @Test
    public void testBasicScenarioEqualElements() {
        when(someCDIDAO.getData()).thenReturn(new   int[] {2,2});
        assertEquals(2, someCDIBusiness.findGreatest());
    }

}
