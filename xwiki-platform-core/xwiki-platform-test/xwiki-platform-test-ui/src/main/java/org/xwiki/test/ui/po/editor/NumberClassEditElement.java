/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.test.ui.po.editor;

import org.xwiki.test.ui.po.FormContainerElement;

/**
 * Represents a NumberClass property form.
 * 
 * @version $Id$
 * @since 3.2M3
 */
public class NumberClassEditElement extends ClassPropertyEditPane
{
    public NumberClassEditElement(FormContainerElement form, String propertyName)
    {
        super(form, propertyName);
    }

    public void setNumberType(String value)
    {
        setMetaProperty("numberType", value);
    }
}
