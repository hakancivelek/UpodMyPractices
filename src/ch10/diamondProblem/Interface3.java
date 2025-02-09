package ch10.diamondProblem;

public interface Interface3 extends Interface1, Interface2{
    //"Comment out the method below and observe the outcome."
    @Override
    default void play() {
        System.out.println("Interface3 playing");;
    }
}
