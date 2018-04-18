package algs;

public class Actor {
	int id;
	String value;
	UseCases[] useCases;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public UseCases[] getUseCases() {
		return useCases;
	}
	public void setUseCases(UseCases[] useCases) {
		this.useCases = useCases;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", value=" + value + "]";
	}
}
