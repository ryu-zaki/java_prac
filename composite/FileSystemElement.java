package composite;

public abstract class FileSystemElement {

    private String name;

    public FileSystemElement(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display(String prepend);

    public void add(FileSystemElement elem) throws Exception
    {
        throw new Exception("Cannot add to this element");
    }

    public void remove(FileSystemElement elem) throws Exception
    {
        throw new Exception("Cannot add to this element");
    }
}
