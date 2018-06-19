package com.adaptionsoft.games;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class HamcrestTest {

    @Test
    public void matchersInHamcrestCanBeCombined() {
        assertThat(true, is(not(false)));
    }
}
