package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory extends FileSystemElement {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void display(String prepend) {

        System.out.println(prepend + "*--" + getName());

    }
    @Override
    public void add(File newFile) {
        children.add(newFile);
    }

    @Override
    public void remove(String fileName) {
        this.children = children.stream()
               .filter(file -> file.getName().equals(fileName))
               .toList();
    }

}
