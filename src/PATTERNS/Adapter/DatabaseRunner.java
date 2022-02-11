/**
 * @author Vasilshift
 */
package PATTERNS.Adapter;
// обеспечивает совместную работу классов, интерфейсы которых не совместимы

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaAppToDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();

    }
}
