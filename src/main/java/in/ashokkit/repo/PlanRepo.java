package in.ashokkit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokkit.entity.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
