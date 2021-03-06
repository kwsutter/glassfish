/*
 * Copyright (c) 2001, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.s1asdev.ejb.cmp.readonly.ejb;

import jakarta.ejb.EJBLocalHome;

import jakarta.ejb.CreateException;
import jakarta.ejb.FinderException;

public interface StudentLocalHome extends EJBLocalHome {

    /**
     * Gets a reference to the remote interface to the StudentBean bean.
     * @exception throws CreateException
     *
     */
    public StudentLocal create(String studentId, String name)
        throws CreateException;

    /**
     * Gets a reference to the remote interface to the StudentBean object by Primary Key.
     * @exception throws FinderException.
     *
     */
 
    public StudentLocal findByPrimaryKey(String studentId) 
        throws FinderException;


    public StudentLocal findByLocalStudent(StudentLocal student) throws FinderException;
    
}
