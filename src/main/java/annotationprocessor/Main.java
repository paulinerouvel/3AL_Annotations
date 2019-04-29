package annotationprocessor;

public class Main {
    public static void main(String[] args) {
        MainWindow classTest = new MainWindow("Connexion Window");
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(classTest);
    }
}
