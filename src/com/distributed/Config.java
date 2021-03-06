package com.distributed;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Config {

    static InetAddress BS_ADDRESS;

    static {
        try {
            BS_ADDRESS = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    static final int BS_PORT = 55555;
    static final int LISTENING_PORT = 6666;
    static final String USER_NAME = "USER_1";

}
