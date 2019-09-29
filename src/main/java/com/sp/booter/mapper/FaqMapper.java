package com.sp.booter.mapper;

import com.sp.booter.model.Opac_faq;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface FaqMapper {
    @Select("select * from opac_faq")
    @ResultType(com.sp.booter.model.Opac_faq.class)
    List<Opac_faq> getALl();
}
