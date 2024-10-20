package myaong.popolog.prejobsservice.repository;

import myaong.popolog.prejobsservice.entity.PreferredJob;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreferredJobRepository extends JpaRepository<PreferredJob, Long> {
    List<PreferredJob> findByMemberId(Long memberId);
}
