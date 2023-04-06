package dev.ibispo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.ToString;

@Entity(name = "labseq")
@ToString
public class LabseqEntity extends PanacheEntityBase {
	
	@Id
	@Column(name = "number_index", nullable = false)
	private Integer numberIndex;
	
	@Column(name = "number_result", nullable = false)
	private Integer numberResult;

	public Integer getNumberIndex() {
		return numberIndex;
	}

	public void setNumberIndex(Integer numberIndex) {
		this.numberIndex = numberIndex;
	}

	public Integer getNumberResult() {
		return numberResult;
	}

	public void setNumberResult(Integer numberResult) {
		this.numberResult = numberResult;
	}

}
