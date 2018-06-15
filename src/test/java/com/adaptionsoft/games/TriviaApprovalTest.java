package com.adaptionsoft.games;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.approvaltests.Approvals;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TriviaApprovalTest {

    /**
     * How it works:
     * Output of game is captured and compared to a previously recorded output
     * (aka "Golden Master"), which is stored in a text-file (....approved.txt).
     *
     * Why we do it:
     * This kind of "blackbox testing" comes handy when it seems impossible to
     * cover your code with unit tests before refactoring but you still want to
     * rely on a safety net. Try to run this test with code coverage and see for
     * yourself how good the safety net really is.
     */
    @Test
    public void runCompleteGameAndCompareCapturedOutputToExpectedOutput() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true));

        GameRunner.main(null);

        Approvals.verify(out.toString());
    }
}

