package dev.ibispo.service;

import java.util.List;

import dev.ibispo.entity.LabseqEntity;

public interface LabseqService {
	
	Integer getLabseqCalculated(Integer index);
	
	void addLanseq(Integer index, Integer result);
	
	List<LabseqEntity> getListLabseq();
	
}
