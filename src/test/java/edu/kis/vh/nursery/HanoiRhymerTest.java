package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testHanoiRhymerReject() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int initialValue = 10;
        int biggerValue = 20;

        rhymer.countIn(initialValue);
        rhymer.countIn(biggerValue); // Powinna zostać odrzucona

        int rejectedCount = rhymer.reportRejected();
        Assert.assertEquals(1, rejectedCount);
    }
}