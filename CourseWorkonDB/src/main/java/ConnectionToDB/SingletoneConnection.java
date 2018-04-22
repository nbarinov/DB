package ConnectionToDB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Locale;

public class SingletoneConnection {

    private static DataSource dataSource;
    private static volatile SingletoneConnection instance;

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static SingletoneConnection getInstance(){
        SingletoneConnection localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletoneConnection.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletoneConnection();
                    Context initContext = null;
                    try {
                        Locale.setDefault(Locale.ENGLISH);
                        initContext = new InitialContext();
                        dataSource =(DataSource) initContext.lookup("java:comp/env/jdbc/postgres");
                    } catch (NamingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return localInstance;
    }
}