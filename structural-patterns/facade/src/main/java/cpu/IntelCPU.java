package cpu;

public class IntelCPU implements CPU {

    public void freeze() {
        System.out.println("CPU frozen!");
    }

    public void jump(long position) {
        System.out.println("CPU jump@" + position + "!");
    }

    public void execute() {
        System.out.println("CPU executing!");
    }

}
