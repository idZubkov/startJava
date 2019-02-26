public class Variable {
    public static void main(String[] args) {
        float cpuStock = 3.6f;
        float cpuOverclock = 4.7f;
        double cpuTurboBoost = 4.3d;
        byte cpuCores = 6;
        byte cpuThreads = 6;
        short cpu = 8600;
        char K = 'K';
        int ram = 16000;
        short gpuModel = 1060;
        short gpuMemory = 6000;
        long memoryHdd = 1000000000L;
        long memorySsd = 240000000L;
        boolean isMoreMemory = memoryHdd > memorySsd;

        System.out.println("\n" + cpu + K + "\n" + cpuStock + "GHz" + "\n" + cpuTurboBoost + "GHz" + "\n" + cpuOverclock + "GHz" + "\n" + cpuCores + " Cores" + "\n" + cpuThreads + " Threads" + "\n" + ram + "Mb" + "\n" +
            gpuModel + "Mb" + "\n" + gpuMemory + "Mb" + "\n" + memoryHdd + "Kb" + "\n" + memorySsd + "Kb" + "\n" + isMoreMemory);
    }
}