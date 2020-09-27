package facade;

import cpu.CPU;
import cpu.IntelCPU;
import disk.Disk;
import disk.SSD;
import memory.Memory;
import memory.RAMMemory;

public class ComputerFacade {

    private static final long BOOT_SECTOR = 36;
    private static final long SECTOR_SIZE = 512;
    private static final long BOOT_ADDRESS = 1024;

    private CPU cpu = new IntelCPU();
    private Memory memory = new RAMMemory();
    private Disk disk = new SSD();

    public void start() {
        cpu.freeze();
        byte[] data = disk.read(BOOT_SECTOR, SECTOR_SIZE);
        memory.load(BOOT_ADDRESS, data);
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

}
