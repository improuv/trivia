package com.adaptionsoft.games;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimpleMockitoTest {

    @Test
    public void mockitoTest() {
        List<String> myMock = mock(List.class);
        when(myMock.get(0)).thenReturn("asdf");
        assertThat(myMock.get(0), is("asdf"));
    }
}
