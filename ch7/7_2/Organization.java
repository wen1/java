import java.util.ArrayList;


public class Organization {
	final int LEVELS = 3;
	
	private int numOfTechnicalLead;
	private int numOfProductManager;
	private int numOfFresher;
	
	ArrayList<Employee>[] employeesInLevel;
	ArrayList<Fresher> freshers;
	ArrayList<ProductManager> productManagers;
	ArrayList<TechnicalLead> technicalLeads;
	
	Organization(String[] TLs, String[]PMs, String[] Frs){
		this.setNumOfTechnicalLead(TLs.length);
		this.setNumOfProductManager(PMs.length);
		this.setNumOfFresher(Frs.length);
		
		this.employeesInLevel = new ArrayList[LEVELS];
		ArrayList<String[]> employeesNames = new ArrayList();
		employeesNames.add(Frs);
		employeesNames.add(TLs);
		employeesNames.add(PMs);
		
		for (int )
		
		for (int i = 0; i < TLs.length; i++){
			technicalLeads.add(new TechnicalLead(TLs[i]));
		}
		for (int i = 0; i < PMs.length; i++){
			productManagers.add(new ProductManager(PMs[i]));
		}
		for (int i = 0; i < Frs.length; i++){
			freshers.add(new Fresher(TLs[i]));
		}
		
		
	}

	
	public int getNumOfTechnicalLead() {
		return numOfTechnicalLead;
	}

	public void setNumOfTechnicalLead(int numOfTechnicalLead) {
		this.numOfTechnicalLead = numOfTechnicalLead;
	}

	public int getNumOfProductManager() {
		return numOfProductManager;
	}

	public void setNumOfProductManager(int numOfProductManager) {
		this.numOfProductManager = numOfProductManager;
	}

	public int getNumOfFresher() {
		return numOfFresher;
	}

	public void setNumOfFresher(int numOfFresher) {
		this.numOfFresher = numOfFresher;
	}
	
	

}
