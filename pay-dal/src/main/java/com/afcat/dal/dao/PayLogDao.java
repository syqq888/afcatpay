package com.afcat.dal.dao;

import com.afcat.common.vo.PayLog;

/**
 * Created by xn.L on 2017/12/21.
 */
public interface PayLogDao {
    void writeLog(PayLog log);
}
