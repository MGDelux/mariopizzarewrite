package DataMapper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderReadTest {
    OrderRead read;
    int tempUID = 0;
    @Before

    public void setUp() throws Exception {
        read = new OrderRead();
        final String USERNAME = "fullroot";
     final String PASSWORD = "fullroot";
     final String CONN_STR = "jdbc:mysql://cphb-gruppe1.c4mqzn3xlkdy.us-east-2.rds.amazonaws.com/";

    }

    @Test
    public void getOrderHighestID() {
      tempUID =   read.getOrderHighestID();

    }
}