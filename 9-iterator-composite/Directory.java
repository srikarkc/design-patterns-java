import java.util.ArrayList;
import java.util.List;

public class Directory implements FilesystemComponent {
     private String name;
     private List<FilesystemComponent> components = new ArrayList<>();
     
     public Directory(String name) {
        this.name = name;
     }

     public void addComponent(FilesystemComponent component) {
        components.add(component);
     }

     public void removeComponent(FilesystemComponent component) {
        components.remove(component);
     }

     @Override
     public void showDetails() {
         System.out.println("Directory: " + name);
         for (FilesystemComponent c:components) {
            c.showDetails();
         }
     }
}
