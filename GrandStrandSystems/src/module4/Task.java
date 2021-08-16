package module4;

public class Task {
	
	private final String uniqueTaskId;
	private String requiredName;
	private String requiredDescription;
	
	public Task(String uniqueTaskId, String requiredName, String requiredDescription) {
		if(uniqueTaskId == null || uniqueTaskId.length() > 10) {
			throw new IllegalArgumentException("Id must not be null or greater than 10 characters.");
		}
		if(requiredName == null || requiredName.length() > 20) {
			throw new IllegalArgumentException("Name must not be null or greater than 20 characters.");
		}
		if(requiredDescription == null || requiredDescription.length() > 50) {
			throw new IllegalArgumentException("Description must not be null or greater than 50 characters.");
		}
		
		this.uniqueTaskId = uniqueTaskId;
		this.requiredName = requiredName;
		this.requiredDescription = requiredDescription;
	}

	public String getUniqueTaskId() {
		return uniqueTaskId;
	}

	/*final public void setUniqueTaskId(final String uniqueTaskId) {
		this.uniqueTaskId = uniqueTaskId;
	}
	*/
	public String getRequiredName() {
		return requiredName;
	}

	public void setRequiredName(String requiredName) {
		this.requiredName = requiredName;
	}

	public String getRequiredDescription() {
		return requiredDescription;
	}

	public void setRequiredDescription(String requiredDescription) {
		this.requiredDescription = requiredDescription;
	}
	
	

}
