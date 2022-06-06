package com.prpractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PrPracticeTest {

    @Mock
    private PrPractice mock;

    @Test
    public void testPopulateNames() {
        List<String> names = new ArrayList<String>();
        names.add("Stephen Squire");
        Mockito.when(mock.populateNames()).thenReturn(names);
        assertEquals(names, mock.populateNames());
    }

    @Test
    public void testPopulateNamesNoMock() {
        PrPractice prPracticeUnderTest = new PrPractice();
        List<String> names = new ArrayList<String>();
        names.add("Stephen Squire");
        assertEquals(names, prPracticeUnderTest.populateNames());
    }
    
}
