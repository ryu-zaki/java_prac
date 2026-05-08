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

    public void add(File newFile) throws Exception {
        throw new Error("CANNOT ADD TO THIS ELEMENT.");
    }

    public void remove(String fileName) throws Exception {
        throw new Error("CANNOT REMOVE THIS ELEMENT.");
    }

}
