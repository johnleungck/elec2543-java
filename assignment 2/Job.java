public class Job {
    private int id;
	private int servedTimeNeeded, jobtime;
	private static int uid=1;
	private int totaltime=0;
	
	public Job (int servedTimeNeeded) {
		this.servedTimeNeeded = servedTimeNeeded;
		jobtime = servedTimeNeeded;
		id = uid++;
	}
	
	public int served(int servedTime) {
		totaltime += servedTime;
		servedTimeNeeded -= servedTime;
		return (servedTimeNeeded);
	}
	
	public String toString() {
		return id + ":(" + jobtime + "," + totaltime + ")";
	}
}