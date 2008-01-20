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
package de.erdesignerng.dialect.generic;

import de.erdesignerng.dialect.DataType;
import de.erdesignerng.dialect.JDBCReverseEngineeringStrategy;
import de.erdesignerng.dialect.NameCastType;
import de.erdesignerng.dialect.SQLGenerator;
import de.erdesignerng.dialect.sql92.SQL92Dialect;

/**
 * @author $Author: mirkosertic $
 * @version $Date: 2008-01-17 19:34:30 $
 */
public class GenericJDBCDialect extends SQL92Dialect {

    public GenericJDBCDialect() {
        super(null);
        setSpacesAllowedInObjectNames(false);
        setCaseSensitive(false);
        setMaxObjectNameLength(255);
        setNullablePrimaryKeyAllowed(false);
        setCastType(NameCastType.UPPERCASE);
    }

    @Override
    public JDBCReverseEngineeringStrategy getReverseEngineeringStrategy() {
        return new GenericJDBCReverseEngineeringStrategy(this);
    }

    @Override
    public String getUniqueName() {
        return "GenericJDBC";
    }

    @Override
    public String getDriverClassName() {
        return "<Whatever>";
    }

    @Override
    public String getDriverURLTemplate() {
        return "<Whatever>";
    }

    @Override
    public boolean supportsSchemaInformation() {
        return true;
    }

    @Override
    protected DataType createDataTypeFor(String aTypeName, String aCreateParams) {
        return new GenericDataType(aTypeName, aCreateParams);
    }

    @Override
    public SQLGenerator createSQLGenerator() {
        return new GenericSQLGenerator(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataType getDataType(String aTypeName) {
        return new GenericDataType(aTypeName, "[$size],[$decimal]");
    }
}