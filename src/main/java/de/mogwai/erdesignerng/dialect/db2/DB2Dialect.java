/**
 * Mogwai ERDesigner. Copyright (C) 2002 The Mogwai Project.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package de.mogwai.erdesignerng.dialect.db2;

import de.mogwai.erdesignerng.dialect.JDBCReverseEngineeringStrategy;
import de.mogwai.erdesignerng.dialect.NameCastType;
import de.mogwai.erdesignerng.dialect.sql92.SQL92Dialect;

/**
 * 
 * @author $Author: mirkosertic $
 * @version $Date: 2007-08-05 18:28:04 $
 */
public class DB2Dialect extends SQL92Dialect {

	public DB2Dialect() {
		setSpacesAllowedInObjectNames(false);
		setCaseSensitive(false);
		setMaxObjectNameLength(28);
		setNullablePrimaryKeyAllowed(false);
		setCastType(NameCastType.UPPERCASE);
	}

	@Override
	public JDBCReverseEngineeringStrategy getReverseEngineeringStrategy() {
		return new DB2ReverseEngineeringStrategy(this);
	}

	@Override
	public String getUniqueName() {
		return "MSSQLDialect";
	}

	@Override
	public String getDriverClassName() {
		return "net.sourceforge.jtds.jdbc.Driver";
	}

	@Override
	public String getDriverURLTemplate() {
		return "jdbc:jtds:sqlserver://<host>/<db>";
	}

}