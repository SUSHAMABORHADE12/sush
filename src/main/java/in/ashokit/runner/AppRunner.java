package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.EligibilityDetails;
import in.ashokit.repo.EligibilityRepo;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	private EligibilityRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		
		 EligibilityDetails entity1=new EligibilityDetails();
		 
		 entity1.setElig_id(1);
		 entity1.setName("John");
		 entity1.setMobile(1234567899);
		 entity1.setGender('M');
		 entity1.setSsn(6856566);
		 entity1.setPlanName("SNAP");
		 entity1.setPlanStatus("Approved");
		 repo.save(entity1);

		 
EligibilityDetails entity2=new EligibilityDetails();
		 
		 entity2.setElig_id(2);
		 entity2.setName("Smith");
		 entity2.setMobile(325456);
		 entity2.setGender('F');
		 entity2.setSsn(7878767);
		 entity2.setPlanName("CCAP");
		 entity2.setPlanStatus("Denied");
		 repo.save(entity2);

		 
EligibilityDetails entity3=new EligibilityDetails();
		 
		 entity3.setElig_id(3);
		 entity3.setName("Robert");
		 entity3.setMobile(325551);
		 entity3.setGender('M');
		 entity3.setSsn(5655757);
		 entity3.setPlanName("Medicaid");
		 entity3.setPlanStatus("Closed");
		 repo.save(entity3);

	}
	
}
