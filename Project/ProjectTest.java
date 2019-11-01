public class ProjectTest {
    public static void main(String[] args){
        Project testProject = new Project("Abdulrab", "Hello World");
        testProject.setData("Ali", "Hi");
        System.out.print(testProject.getData());
    }
}
