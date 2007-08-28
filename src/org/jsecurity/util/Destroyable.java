/*
 * Copyright (C) 2005-2007 Jeremy Haile, Les Hazlewood
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 *
 * Free Software Foundation, Inc.
 * 59 Temple Place, Suite 330
 * Boston, MA 02111-1307
 * USA
 *
 * Or, you may view it online at
 * http://www.opensource.org/licenses/lgpl-license.php
 */
package org.jsecurity.util;

/**
 * JSecurity container-agnostic interface that indicates that this object requires a callback during destruction.
 *
 * @see org.jsecurity.spring.LifecycleBeanPostProcessor
 *
 * @since 0.2
 * @author Les Hazlewood
 * @author Jeremy Haile
 */
public interface Destroyable {

    /**
     * Called when this object is being destroyed, allowing any necessary cleanup of internal resources.
     * @throws Exception if an exception occurs during object destruction.
     */
    void destroy() throws Exception;
    
}
