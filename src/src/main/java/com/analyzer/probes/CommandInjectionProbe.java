package com.analyzer.probes;

public final class CommandInjectionProbe {
    // PROBE-SEC-003
    public static void ping(String host) throws Exception {
        Runtime.getRuntime().exec("ping -c 1 " + host);
    }

    private CommandInjectionProbe() {}
}
