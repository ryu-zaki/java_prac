package composite;

public class File extends FileSystemElement {

    public File(String name) {
        super(name);
    }

    @Override
    public void display(String prepend) {
       System.out.println(prepend + "|--" + getName());
    }



}
