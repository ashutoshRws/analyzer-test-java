package com.analyzer.probes;

import java.sql.Connection;
import java.sql.Statement;

public final class SqlInjectionProbe {
    // PROBE-SEC-002
    public static void findUser(Connection conn, String username) throws Exception {
        Statement stmt = conn.createStatement();
        stmt.executeQuery("SELECT * FROM users WHERE name = '" + username + "'");
    }

    private SqlInjectionProbe() {}
}
