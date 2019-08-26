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
package org.xwiki.notifications.preferences.internal.event;

import org.xwiki.observation.event.Event;

/**
 * Base class for event generated when notification preferences are manipulated.
 * 
 * @version $Id$
 * @since 10.11.4
 * @since 11.2
 */
public abstract class AbstractNotificationPreferenceEvent implements Event
{
    @Override
    public boolean matches(Object otherEvent)
    {
        return otherEvent.getClass() == getClass();
    }
}
