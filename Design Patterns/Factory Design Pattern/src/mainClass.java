public class mainClass {
    public static void main(String[] args) {
        shapefactory sf = new shapefactory();
       shape s= sf.getshape("square");
       s.draw();
    }
}