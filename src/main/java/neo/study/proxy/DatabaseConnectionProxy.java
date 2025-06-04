package neo.study.proxy;

public class DatabaseConnectionProxy implements DatabaseConnection {

    private final String serverAddress;
    private final int port;
    private DatabaseConnectionImpl database;

    public DatabaseConnectionProxy(DatabaseConnectionImpl database, String serverAddress,
            int port) {
        this.database = database;
        this.serverAddress = serverAddress;
        this.port = port;
    }

    @Override
    public String getDatabaseName() {
        return String.format("подключено %s:%d/%s", serverAddress, port,
                database.getDatabaseName());
    }

}
