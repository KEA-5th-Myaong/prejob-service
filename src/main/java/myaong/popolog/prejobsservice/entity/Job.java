package myaong.popolog.prejobsservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`job`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"category_id", "job_name"}),
				@UniqueConstraint(columnNames = {"category_id", "`index`"})})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Job extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long id;

	// 카테고리
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false, updatable = false)
	private Category category;

	// 직군 이름
	@Column(name = "job_name", nullable = false)
	private String name;

	// 순서
	@Column(name = "`index`", nullable = false)
	private Integer index;

	@Builder
	public Job(Category category, String name, Integer index) {
		this.category = category;
		this.name = name;
		this.index = index;
	}
}
