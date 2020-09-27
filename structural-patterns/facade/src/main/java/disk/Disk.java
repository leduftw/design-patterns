package disk;

public interface Disk {

    byte[] read(long sector, long size);

}
