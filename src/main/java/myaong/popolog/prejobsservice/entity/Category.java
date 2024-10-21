package myaong.popolog.prejobsservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "`category`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", nullable = false)
	private Long id;

	// 카테고리 이름
	@Column(name = "category_name", nullable = false, unique = true, updatable = false)
	private String name;

	// 해당 카테고리의 직군 목록
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<Job> jobs;

	@Builder
	public Category(String name) {
		this.name = name;
	}
}
