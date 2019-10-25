package com.cx.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cx.demo.entity.TUserFrameLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yuan
 * @since 2019-10-24
 */
public interface TUserFrameLogService extends IService<TUserFrameLog> {

    List<TUserFrameLog> findByTUser();

    IPage<TUserFrameLog> selePage(int page,int pagesize)throws RuntimeException;


}
