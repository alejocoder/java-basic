package interfaces;

public class main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}
