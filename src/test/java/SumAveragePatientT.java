/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cpe4235.chapter4.data.IP;
import com.cpe4235.chapter4.data.YesNo;
import junit.framework.TestCase;

/**
 *
 * @author BANK.CPE
 */
public class SumAveragePatientT extends TestCase {

    public int sum(IP ip) {
        return ip.getRole1().getScore()
                +ip.getRole2().getScore()
                +ip.getRole3().getScore()
                +ip.getRole4().getScore()
                +ip.getRole5().getScore();
    }

    public void sum1Test() {
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
    }
}
