public class Restaurant {

    public static void main(String[] args){
        System.out.println(new Calzone(3, new Bacon()).bake());
        System.out.println(new Classic(33, new Bacon()).bake());
        System.out.println(new Calzone(2, new QuattroFormaggi()).bake());
        System.out.println(new Classic(50, new QuattroFormaggi()).bake());
        System.out.println(new Calzone(5, new Margaritha()).bake());
        System.out.println(new Classic(20, new Margaritha()).bake());
    }
}
