package dev.ibispo.service.impl;

import dev.ibispo.entity.LabseqEntity;
import dev.ibispo.service.LabseqService;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabseqServiceImpl implements LabseqService {

	@Override
	public void addLanseq(Integer index, Integer result) {
		LabseqEntity labseqEntity = new LabseqEntity();
		labseqEntity.setNumberIndex(index);
		labseqEntity.setNumberResult(result);
		labseqEntity.persist();
	}

	@Override
	public Integer getLabseqCalculated(Integer index) {
		LabseqEntity labseqEntity = LabseqEntity.findById(index);
		return labseqEntity != null ? labseqEntity.getNumberResult() : null;
	}

	@Override
	public List<LabseqEntity> getListLabseq() {
		return LabseqEntity.listAll();
	}

}
