package com.cx.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public IPage<TUserFrameLog> selePage(int page, int pagesize)throws RuntimeException {
        try {
            Page<TUserFrameLog> p = new Page<>(page,pagesize);
            p.setRecords(tUserFrameLogMapper.selectPageExt(p));
            return p;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
