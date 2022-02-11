/**
 * @author Vasilshift
 */
package PATTERNS.Adapter;

public class AdapterJavaAppToDatabase extends JavaApp implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
       deleteObject();
    }
}
