package PATTERNS.Command;

public class Developer {
    Command insert;
    Command update;
    Command delete;

    public Developer(Command insert, Command update, Command delete) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    void insertRecord() {
        insert.execute();
    }
    void updateRecord() {
        update.execute();
    }
    void deleteRecord() {
        delete.execute();
    }
}
