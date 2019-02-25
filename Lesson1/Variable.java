public class Variable {
	public static void main(String[] args) {
		float cpuStock = 3.6f;
		float cpuOverclock = 4.7f;
		double cpuTurboBoost = 4.3d;
		byte cpuCores = 6;
		byte cpuThreads = 6;
		char c = 0;
		int ram = 16000;
		short gpuModel = 1060;
		short gpuMemory = 6000;
		long memoryHdd = 1000000000L;
		long memorySsd = 240000000L;
		boolean isMoreMemory = memoryHdd > memorySsd;

		System.out.println("\n" + cpuStock + (c = 'G') + (c = 'H') + (c = 'z') +"\n" + cpuTurboBoost + (c = 'G') + (c = 'H') + (c = 'z') +"\n" + cpuOverclock + (c = 'G') + (c = 'H') + (c = 'z') + "\n" + cpuCores + "\n" + cpuThreads + "\n" + ram + (c = 'M') + (c = 'b') + "\n" +
                gpuModel + (c = 'M') + (c = 'b') + "\n" + gpuMemory + (c = 'M') + (c = 'b') + "\n" + memoryHdd + (c = 'K') + (c = 'b') + "\n" + memorySsd + (c = 'K') + (c = 'b') + "\n" + isMoreMemory);

	}
}