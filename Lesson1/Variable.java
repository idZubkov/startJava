public class Variable {
	public static void main(String[] args) {
		float cpuStock = 3.6f; 							//+
		float cpuOverclock = 4.7f;						//+
		double cpuTurboBoost = 4.3d;					//+
		byte cpuCores = 6;								//+
		byte cpuThreads = 6;							//+
		char G = 'G';									//+
		char H = 'H';									//+
		char z = 'z';									//+
		char b = 'b';									//+
		char M = 'M';									//+
		char K = 'K';									//+
		int ram = 16000;								//+
		short gpuModel = 1060;							//+
		short gpuMemory = 6000;							//+
		long memoryHdd = 1000000000L;					//+
		long memorySsd = 240000000L;					//+
		boolean moreMemory = memoryHdd > memorySsd;		//+

		System.out.println("\n"+cpuStock+G+H+z+"\n"+cpuTurboBoost+G+H+z+"\n"+cpuOverclock+G+H+z+"\n"+cpuCores+"\n"+cpuThreads+"\n"+ram+M+b+"\n"+
			gpuModel+M+b+"\n"+gpuMemory+M+b+"\n"+memoryHdd+K+b+"\n"+memorySsd+K+b+"\n"+moreMemory);

	}
}