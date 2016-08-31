/*******************************************************************************
 *
 *  Copyright FUJITSU LIMITED 2016
 *
 *  Creation Date: 30.08.2016
 *
 *******************************************************************************/
package org.oscm.tenant.bean;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.*;
import javax.interceptor.Interceptors;

import org.oscm.domobjects.Tenant;
import org.oscm.interceptor.InvocationDateContainer;
import org.oscm.internal.intf.TenantService;
import org.oscm.tenant.dao.TenantDao;
import org.oscm.tenant.local.TenantServiceLocal;

@RolesAllowed("PLATFORM_OPERATOR")
@Interceptors({ InvocationDateContainer.class, org.oscm.interceptor.ExceptionMapper.class })
@Stateless
@Local(TenantServiceLocal.class)
public class TenantServiceLocalBean implements TenantServiceLocal {

    @EJB
    TenantDao tenantDao;

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    @Override
    public List<Tenant> getAllTenants() {
        return tenantDao.getAllTenants();
    }
}