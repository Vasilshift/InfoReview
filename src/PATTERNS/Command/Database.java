package PATTERNS.Command;

public class Database {
    public void insert() {
        System.out.println("Inserting ... ");
    }
    public void update() {
        System.out.println("Updating ...");
    }
    public void delete() {
        System.out.println("Deleting ... ");
    }
}

interface Command {
    public void execute();
}

class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}

class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}

class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
