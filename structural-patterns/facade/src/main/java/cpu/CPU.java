package cpu;

public interface CPU {

    void freeze();

    void jump(long position);

    void execute();

}
