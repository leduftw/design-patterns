package factory;

import drivers.*;

public class Factory {

    public static DatabaseDriver getDriver(String driver) {
        switch (driver) {
            case "MySQL":
                return new MySQLDriver();

            case "PostgreSQL":
                return new PostgreSQLDriver();

            case "SQLite":
                return new SQLiteDriver();

            default:
                return new MSSQLDriver();
        }
    }

}
