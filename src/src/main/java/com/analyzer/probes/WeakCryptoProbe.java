package com.analyzer.probes;

import java.security.MessageDigest;

public final class WeakCryptoProbe {
    // PROBE-SEC-006
    public static byte[] md5(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return md.digest(input.getBytes());
    }

    private WeakCryptoProbe() {}
}
