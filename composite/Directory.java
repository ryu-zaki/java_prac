package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory extends FileSystemElement {

    private List<FileSystemElement> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void display(String prepend) {
        System.out.println(prepend + "*--" + getName());

        for (FileSystemElement e: children) {
             e.display("  " + prepend);
        }
    }
    @Override
    public void add(FileSystemElement newElement) {
        children.add(newElement);
    }

    @Override
    public void remove(String fileName) {
        this.children = children.stream()
               .filter(file -> file.getName().equals(fileName))
               .toList();
    }

}
