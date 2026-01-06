public class shapefactory {

    shape getshape(String input){
        switch (input){
            case "circle" :
                return new circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new square();
            default:
                return null;
        }
    }
}
