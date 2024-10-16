package myaong.popolog.prejobsservice.repository;

import myaong.popolog.prejobsservice.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
