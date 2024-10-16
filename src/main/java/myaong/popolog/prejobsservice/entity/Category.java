package myaong.popolog.prejobsservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

	@Builder
	public Category(String name) {
		this.name = name;
	}
}
