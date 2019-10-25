package com.cx.demo.service.impl;

import com.cx.demo.entity.TUserFrameLog;
import com.cx.demo.mapper.TUserFrameLogMapper;
import com.cx.demo.service.TUserFrameLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuan
 * @since 2019-10-24
 */
@Service
public class TUserFrameLogServiceImpl extends ServiceImpl<TUserFrameLogMapper, TUserFrameLog> implements TUserFrameLogService {

    @Autowired
    TUserFrameLogMapper tUserFrameLogMapper;

    @Override
    public List<TUserFrameLog> findByTUser() {
        return tUserFrameLogMapper.findByTUser();
    }
}
