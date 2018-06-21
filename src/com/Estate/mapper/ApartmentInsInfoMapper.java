package com.Estate.mapper;

import com.Estate.model.ApartmentInsInfo;

public interface ApartmentInsInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ApartmentInsInfo record);

    int insertSelective(ApartmentInsInfo record);

    ApartmentInsInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ApartmentInsInfo record);

    int updateByPrimaryKey(ApartmentInsInfo record);
}