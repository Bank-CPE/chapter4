/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cpe4235.chapter4.IP;
import com.cpe4235.chapter4.YesNo;
import static com.sun.javafx.Utils.sum;
import java.lang.reflect.Method;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author BANK.CPE
 */
public class SumAvgReflectionPatientT {

    private int sum;

    public int sum(IP ip) throws Exception {
        Method[] methods = ip.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }

    @Test
    public void testSum() throws Exception {
        IP ip = new IP();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));

    }
}
