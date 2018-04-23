//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.client.gxt.cache;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

/**
 * The GxtCacheHierarchyListenerIF interface should be implemented by classes that
 * want to listen for events related to object hierarchies.
 */
public interface GxtCacheHierarchyListenerIF {

	public void hierarchyObjectAdded(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyObjectDeleted(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyObjectModified(DmcClassInfo index, GxtWrapper object, DMPEventDMO event);
	
	public void hierarchyAvailable(DmcClassInfo index, GxtWrapper object);
	
	
}
