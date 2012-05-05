package org.triple_brain.module.repository;

/*
* Copyright Mozilla Public License 1.1
*/
public interface SQLConnectionInfo {
    public static final int MYSQL_DATABASE_TYPE = 0;
    public static final int H2_DATABASE_TYPE = 1;
    public String driverClassPath();
    public String databasePath();
    public String databaseName();
    public String username();
    public String password();
    public int databaseType();
}
