package org.hsweb.web.service.commons;

import org.hsweb.web.bean.po.GenericPo;
import org.hsweb.web.dao.CRUMapper;
import org.hsweb.web.dao.InsertMapper;
import org.hsweb.web.dao.QueryMapper;
import org.hsweb.web.dao.UpdateMapper;

/**
 * @author zhouhao
 */
public interface CRUService<Po extends GenericPo<Pk>, Pk> extends
        SimpleInsertService<Po, Pk>,
        SimpleQueryService<Po, Pk>,
        SimpleUpdateService<Po,Pk> {
    CRUMapper<Po, Pk> getCRUMapper();

    @Override
    default InsertMapper<Po> getInsertMapper() {
        return getCRUMapper();
    }

    @Override
    default QueryMapper<Po, Pk> getQueryMapper() {
        return getCRUMapper();
    }

    @Override
    default UpdateMapper<Po> getUpdateMapper() {
        return getCRUMapper();
    }
}
