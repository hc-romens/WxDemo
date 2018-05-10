package com.zed.xposed.demo.greedao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.zed.xposed.demo.greedao.entity.WxChatInvokeMsg;

import com.zed.xposed.demo.greedao.dao.WxChatInvokeMsgDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig wxChatInvokeMsgDaoConfig;

    private final WxChatInvokeMsgDao wxChatInvokeMsgDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        wxChatInvokeMsgDaoConfig = daoConfigMap.get(WxChatInvokeMsgDao.class).clone();
        wxChatInvokeMsgDaoConfig.initIdentityScope(type);

        wxChatInvokeMsgDao = new WxChatInvokeMsgDao(wxChatInvokeMsgDaoConfig, this);

        registerDao(WxChatInvokeMsg.class, wxChatInvokeMsgDao);
    }
    
    public void clear() {
        wxChatInvokeMsgDaoConfig.clearIdentityScope();
    }

    public WxChatInvokeMsgDao getWxChatInvokeMsgDao() {
        return wxChatInvokeMsgDao;
    }

}
