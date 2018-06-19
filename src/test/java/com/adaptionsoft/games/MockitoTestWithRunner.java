package com.adaptionsoft.games;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestWithRunner {

    @Mock
    public List<String> myMockedStringList;

    @Test
    public void mockitoTest() {
        when(myMockedStringList.get(0)).thenReturn("asdf");
        assertThat(myMockedStringList.get(0), is("asdf"));
    }
}
