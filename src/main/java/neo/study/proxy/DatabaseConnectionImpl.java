package neo.study.proxy;

public class DatabaseConnectionImpl implements DatabaseConnection {
    private final String databaseName;

    public DatabaseConnectionImpl(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String connect() {
        return databaseName;
    }
}
