public interface Subject {
	public String register (Observer listener);
	public void unRegister (String regKey);

	void notifyUpdate();
}