package com.cx.demo.mapper;

import com.cx.demo.entity.TUserFrameLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yuan
 * @since 2019-10-24
 */
@Mapper
public interface TUserFrameLogMapper extends BaseMapper<TUserFrameLog> {

    List<TUserFrameLog> findByTUser();
}
